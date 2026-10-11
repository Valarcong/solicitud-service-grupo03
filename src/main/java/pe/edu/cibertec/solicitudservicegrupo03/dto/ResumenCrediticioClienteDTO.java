package pe.edu.cibertec.solicitudservicegrupo03.dto;

import java.util.List;

public class ResumenCrediticioClienteDTO {

    private Long clienteId;
    private String nombreCliente;
    private String dni;
    private ScoringRiesgoDTO scoringActual;
    private List<SolicitudPrestamoResponseDTO> historialSolicitudes;
    private String estadoCrediticioGlobal;

    public ResumenCrediticioClienteDTO() {
    }

    public ResumenCrediticioClienteDTO(Long clienteId, String nombreCliente, String dni, ScoringRiesgoDTO scoringActual, List<SolicitudPrestamoResponseDTO> historialSolicitudes, String estadoCrediticioGlobal) {
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.scoringActual = scoringActual;
        this.historialSolicitudes = historialSolicitudes;
        this.estadoCrediticioGlobal = estadoCrediticioGlobal;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ScoringRiesgoDTO getScoringActual() {
        return scoringActual;
    }

    public void setScoringActual(ScoringRiesgoDTO scoringActual) {
        this.scoringActual = scoringActual;
    }

    public List<SolicitudPrestamoResponseDTO> getHistorialSolicitudes() {
        return historialSolicitudes;
    }

    public void setHistorialSolicitudes(List<SolicitudPrestamoResponseDTO> historialSolicitudes) {
        this.historialSolicitudes = historialSolicitudes;
    }

    public String getEstadoCrediticioGlobal() {
        return estadoCrediticioGlobal;
    }

    public void setEstadoCrediticioGlobal(String estadoCrediticioGlobal) {
        this.estadoCrediticioGlobal = estadoCrediticioGlobal;
    }
}
