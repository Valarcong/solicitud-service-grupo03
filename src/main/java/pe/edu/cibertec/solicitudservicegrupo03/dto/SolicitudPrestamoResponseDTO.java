package pe.edu.cibertec.solicitudservicegrupo03.dto;

import java.time.LocalDateTime;
import java.util.List;

public class SolicitudPrestamoResponseDTO {

    private Long idSolicitud;
    private String codigoSolicitud;
    private LocalDateTime fechaSolicitud;
    private Long clienteId;
    private Double montoSolicitado;
    private Integer plazoMeses;
    private String estadoSolicitud;
    private List<CuotaPrestamoDTO> listaCuotasProyectadas;
    private Double tasaInteresAnual;
    private Double montoTotalPagar;

    public SolicitudPrestamoResponseDTO() {
    }

    public SolicitudPrestamoResponseDTO(Long idSolicitud, String codigoSolicitud, LocalDateTime fechaSolicitud, Long clienteId, Double montoSolicitado, Integer plazoMeses, String estadoSolicitud, List<CuotaPrestamoDTO> listaCuotasProyectadas, Double tasaInteresAnual, Double montoTotalPagar) {
        this.idSolicitud = idSolicitud;
        this.codigoSolicitud = codigoSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.clienteId = clienteId;
        this.montoSolicitado = montoSolicitado;
        this.plazoMeses = plazoMeses;
        this.estadoSolicitud = estadoSolicitud;
        this.listaCuotasProyectadas = listaCuotasProyectadas;
        this.tasaInteresAnual = tasaInteresAnual;
        this.montoTotalPagar = montoTotalPagar;
    }

    public Long getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Long idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(String codigoSolicitud) {
        this.codigoSolicitud = codigoSolicitud;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(Double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public Integer getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(Integer plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public List<CuotaPrestamoDTO> getListaCuotasProyectadas() {
        return listaCuotasProyectadas;
    }

    public void setListaCuotasProyectadas(List<CuotaPrestamoDTO> listaCuotasProyectadas) {
        this.listaCuotasProyectadas = listaCuotasProyectadas;
    }

    public Double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(Double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public Double getMontoTotalPagar() {
        return montoTotalPagar;
    }

    public void setMontoTotalPagar(Double montoTotalPagar) {
        this.montoTotalPagar = montoTotalPagar;
    }
}
