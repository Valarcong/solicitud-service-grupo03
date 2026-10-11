package pe.edu.cibertec.solicitudservicegrupo03.controller;
import pe.edu.cibertec.solicitudservicegrupo03.dto.ResumenCrediticioClienteDTO;
import pe.edu.cibertec.solicitudservicegrupo03.dto.SolicitudPrestamoResponseDTO;
import pe.edu.cibertec.solicitudservicegrupo03.service.SolicitudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class SolicitudController {

    private final SolicitudService solicitudService;
    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @GetMapping("/{idSolicitud}")
    public ResponseEntity<SolicitudPrestamoResponseDTO> obtener(@PathVariable Long idSolicitud) {
        return ResponseEntity.ok(solicitudService.obtenerSolicitud(idSolicitud));
    }

    @GetMapping("/evaluar-y-aprobar/{idSolicitud}")
    public ResponseEntity<SolicitudPrestamoResponseDTO> evaluarYAprobar(@PathVariable Long idSolicitud) {
        return ResponseEntity.ok(solicitudService.evaluarYAprobar(idSolicitud));
    }

    @GetMapping("/resumen-cliente/{clienteId}")
    public ResponseEntity<ResumenCrediticioClienteDTO> resumenCliente(@PathVariable Long clienteId) {
        return ResponseEntity.ok(solicitudService.resumenCliente(clienteId));
    }
}
