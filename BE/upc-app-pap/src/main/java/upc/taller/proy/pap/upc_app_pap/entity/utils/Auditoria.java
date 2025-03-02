package upc.taller.proy.pap.upc_app_pap.entity.utils;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;

//@NoArgsConstructor
//@AllArgsConstructor
@Setter
@Getter
@SuperBuilder  // Permite herencia en constructores
@NoArgsConstructor
@MappedSuperclass
public class Auditoria {
    @Column(name = "usuario_registro", length = 100)
    private String usuarioRegistro;
    @Column(name= "fecha_registro")
    private LocalDateTime fechaRegistro;
    @Column(name = "usuario_modifica")
    private String usuarioModifica;
    @Column(name = "fecha_modifica")
    private LocalDateTime fechaModifica;
    @Column(name = "activo")
    private Integer activo;
}
