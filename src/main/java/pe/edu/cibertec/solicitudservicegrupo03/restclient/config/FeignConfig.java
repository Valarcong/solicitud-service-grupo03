package pe.edu.cibertec.solicitudservicegrupo03.restclient.config;

import pe.edu.cibertec.solicitudservicegrupo03.restclient.errorhandler.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
