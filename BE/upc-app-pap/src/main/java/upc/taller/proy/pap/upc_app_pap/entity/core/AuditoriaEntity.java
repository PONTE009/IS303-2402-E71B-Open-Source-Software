package upc.taller.proy.pap.upc_app_pap.entity.core;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Setter
@Getter
@Document(collection = "servicios")
@TypeAlias("AuditoriaEntity")
public class AuditoriaEntity {
    private String Id;
    private String urlServicio;
    private String usuario;
    private String fechaConsulta;
    private String request;
    private String response;

    @Field("estado_peticion")
    private Integer estadoPeticion;
}
