package pe.edu.cibertec.solicitudservicegrupo03.dto;

import java.time.LocalDate;

public class CuotaPrestamoDTO {

    private Integer numeroCuota;
    private LocalDate fechaVencimiento;
    private Double montoCuota;
    private Double interes;
    private Double capital;
    private String estadoCuota;

    public CuotaPrestamoDTO() {
    }

    public CuotaPrestamoDTO(Integer numeroCuota, LocalDate fechaVencimiento, Double montoCuota, Double interes, Double capital, String estadoCuota) {
        this.numeroCuota = numeroCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.montoCuota = montoCuota;
        this.interes = interes;
        this.capital = capital;
        this.estadoCuota = estadoCuota;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public String getEstadoCuota() {
        return estadoCuota;
    }

    public void setEstadoCuota(String estadoCuota) {
        this.estadoCuota = estadoCuota;
    }
}
