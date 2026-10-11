package pe.edu.cibertec.solicitudservicegrupo03.restclient.evaluacion.iclient;

import pe.edu.cibertec.solicitudservicegrupo03.dto.ScoringRiesgoDTO;
import pe.edu.cibertec.solicitudservicegrupo03.restclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "evaluacion-service-grupo03",
        configuration = FeignConfig.class)
public interface EvaluacionClient {

    @GetMapping("/api/v1/evaluaciones/scoring/{clienteId}")
    ScoringRiesgoDTO obtenerScoring(@PathVariable("clienteId") Long clienteId);
}
