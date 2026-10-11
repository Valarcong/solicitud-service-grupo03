package pe.edu.cibertec.solicitudservicegrupo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SolicitudServiceGrupo03Application {

    public static void main(String[] args) {
        SpringApplication.run(SolicitudServiceGrupo03Application.class, args);
    }

}
