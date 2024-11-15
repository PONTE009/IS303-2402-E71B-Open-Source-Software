package upc.taller.proy.pap.upc_app_pap.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("API de servicio de gestión de papeletas")
                        .description("Servicio de gestión de Papeletas")
                        .version("1.0")
                );
    }
}
