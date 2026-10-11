package pe.edu.cibertec.solicitudservicegrupo03.dto;

public class ScoringRiesgoDTO {

    private Long clienteId;
    private Integer puntajeCrediticio;
    private String nivelRiesgo;
    private Double capacidadMaxEndeudamiento;
    private String dictamenRiesgo;

    public ScoringRiesgoDTO() {
    }

    public ScoringRiesgoDTO(Long clienteId, Integer puntajeCrediticio, String nivelRiesgo, Double capacidadMaxEndeudamiento, String dictamenRiesgo) {
        this.clienteId = clienteId;
        this.puntajeCrediticio = puntajeCrediticio;
        this.nivelRiesgo = nivelRiesgo;
        this.capacidadMaxEndeudamiento = capacidadMaxEndeudamiento;
        this.dictamenRiesgo = dictamenRiesgo;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getPuntajeCrediticio() {
        return puntajeCrediticio;
    }

    public void setPuntajeCrediticio(Integer puntajeCrediticio) {
        this.puntajeCrediticio = puntajeCrediticio;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public Double getCapacidadMaxEndeudamiento() {
        return capacidadMaxEndeudamiento;
    }

    public void setCapacidadMaxEndeudamiento(Double capacidadMaxEndeudamiento) {
        this.capacidadMaxEndeudamiento = capacidadMaxEndeudamiento;
    }

    public String getDictamenRiesgo() {
        return dictamenRiesgo;
    }

    public void setDictamenRiesgo(String dictamenRiesgo) {
        this.dictamenRiesgo = dictamenRiesgo;
    }
}
