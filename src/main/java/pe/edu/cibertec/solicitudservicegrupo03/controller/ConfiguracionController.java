package pe.edu.cibertec.solicitudservicegrupo03.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/solicitudes")
@RefreshScope
public class ConfiguracionController {

    @Value("${fintech.tasa-interes-base}")
    private Double tasaInteresBase;

    @Value("${fintech.monto-maximo-prestamo}")
    private Double montoMaximoPrestamo;

    @Value("${fintech.mensaje-comercial}")
    private String mensajeComercial;

    @Value("${fintech.comision-desembolso}")
    private Double comisionDesembolso;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @GetMapping("/configuracion")
    public Map<String, Object> obtenerConfiguracion() {
        Map<String, Object> response = new HashMap<>();
        response.put("tasa-interes-base", tasaInteresBase);
        response.put("monto-maximo-prestamo", montoMaximoPrestamo);
        response.put("mensaje-comercial", mensajeComercial);
        response.put("comision-desembolso", comisionDesembolso);
        response.put("datasource.url", datasourceUrl);
        return response;
    }
}