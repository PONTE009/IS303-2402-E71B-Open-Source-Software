package upc.taller.proy.pap.upc_app_pap.entity.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity(name = "UsuarioEntity")
@Table(name = "tbl_usuario", schema = "seg")
public class UsuarioEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;
    private String usuario;
    private String clave;


    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id", nullable = false)
    private PersonaEntity persona;
}
