package pe.edu.cibertec.solicitudservicegrupo03.service;

import pe.edu.cibertec.solicitudservicegrupo03.dto.CuotaPrestamoDTO;
import pe.edu.cibertec.solicitudservicegrupo03.dto.ResumenCrediticioClienteDTO;
import pe.edu.cibertec.solicitudservicegrupo03.dto.ScoringRiesgoDTO;
import pe.edu.cibertec.solicitudservicegrupo03.dto.SolicitudPrestamoResponseDTO;
import pe.edu.cibertec.solicitudservicegrupo03.restclient.evaluacion.iclient.EvaluacionClient;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SolicitudService {

    private final EvaluacionClient evaluacionClient;
    public SolicitudService(EvaluacionClient evaluacionClient) {
        this.evaluacionClient = evaluacionClient;
    }

    private List<SolicitudPrestamoResponseDTO> solicitudes = new ArrayList<>();

    {
        solicitudes.add(new SolicitudPrestamoResponseDTO(1L, "SOL-001", LocalDateTime.now(),
                1L, 10000.0, 12, "EN_EVALUACION", new ArrayList<>(), 24.0, 0.0));
        solicitudes.add(new SolicitudPrestamoResponseDTO(2L, "SOL-002", LocalDateTime.now(),
                2L, 15000.0, 24, "EN_EVALUACION", new ArrayList<>(), 24.0, 0.0));
        solicitudes.add(new SolicitudPrestamoResponseDTO(3L, "SOL-003", LocalDateTime.now(),
                3L, 5000.0, 6, "EN_EVALUACION", new ArrayList<>(), 24.0, 0.0));
        solicitudes.add(new SolicitudPrestamoResponseDTO(4L, "SOL-004", LocalDateTime.now(),
                4L, 1000.0, 3, "EN_EVALUACION", new ArrayList<>(), 24.0, 0.0));
    }

    public SolicitudPrestamoResponseDTO obtenerSolicitud(Long idSolicitud) {
        SolicitudPrestamoResponseDTO solicitud = solicitudes
                .stream().filter(s -> s.getIdSolicitud().equals(idSolicitud))
                .toList().get(0);
        calcularCuotas(solicitud);
        return solicitud;
    }

    public SolicitudPrestamoResponseDTO evaluarYAprobar(Long idSolicitud) {
        SolicitudPrestamoResponseDTO solicitud = obtenerSolicitud(idSolicitud);

        ScoringRiesgoDTO scoring = evaluacionClient.obtenerScoring(solicitud.getClienteId());
        boolean montoOk = solicitud.getMontoSolicitado() <= scoring.getCapacidadMaxEndeudamiento();
        boolean riesgoOk = scoring.getNivelRiesgo().equals("BAJO") || scoring.getNivelRiesgo().equals("MEDIO");

        if (montoOk && riesgoOk) {
            solicitud.setEstadoSolicitud("APROBADO");
        } else {
            solicitud.setEstadoSolicitud("RECHAZADO_POR_RIESGO");
        }
        return solicitud;
    }

    public ResumenCrediticioClienteDTO resumenCliente(Long clienteId) {
        ScoringRiesgoDTO scoring = evaluacionClient.obtenerScoring(clienteId);

        List<SolicitudPrestamoResponseDTO> historial = solicitudes
                .stream().filter(s -> s.getClienteId().equals(clienteId)).toList();
        historial.forEach(s -> calcularCuotas(s));

        String estado = "NO_APTO";
        if (scoring.getNivelRiesgo().equals("BAJO") || scoring.getNivelRiesgo().equals("MEDIO")) {
            estado = "APTO";
        }
        return new ResumenCrediticioClienteDTO(clienteId, "Cliente " + clienteId,
                "7000000" + clienteId, scoring, historial, estado);
    }

    private void calcularCuotas(SolicitudPrestamoResponseDTO solicitud) {
        double tasaMensual = solicitud.getTasaInteresAnual() / 12 / 100;
        double capital = solicitud.getMontoSolicitado() / solicitud.getPlazoMeses();
        double saldo = solicitud.getMontoSolicitado();
        double total = 0;

        List<CuotaPrestamoDTO> cuotas = new ArrayList<>();
        for (int i = 1; i <= solicitud.getPlazoMeses(); i++) {
            double interes = saldo * tasaMensual;
            double montoCuota = capital + interes;
            cuotas.add(new CuotaPrestamoDTO(i, LocalDate.now().plusMonths(i),
                    redondear(montoCuota), redondear(interes), redondear(capital), "PENDIENTE"));
            saldo = saldo - capital;
            total = total + montoCuota;
        }

        solicitud.setListaCuotasProyectadas(cuotas);
        solicitud.setMontoTotalPagar(redondear(total));
    }

    private double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
}
