package upc.taller.proy.pap.upc_app_pap.entity.utils;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.util.Date;

//@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
@MappedSuperclass
public class Auditoria {
    @Column(name = "usuario_registro", length = 100)
    private String usuarioRegistro;
    @Column(name= "fecha_registro")
    private Date fechaRegistro;
    @Column(name = "usuario_modifica")
    private String usuarioModifica;
    @Column(name = "fecha_modifica")
    private Date fechaModifica;
    @Column(name = "activo")
    private Integer activo;
}
