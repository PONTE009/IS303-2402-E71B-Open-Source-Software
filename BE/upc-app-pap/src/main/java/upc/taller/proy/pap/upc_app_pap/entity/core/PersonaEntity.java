package upc.taller.proy.pap.upc_app_pap.entity.core;

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
@Entity(name = "PersonaEntity")
@Table(name = "tbl_persona", schema = "pap")
public class PersonaEntity extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private Long personaId;
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;


    // Tabla dependencia (dependenciaId), grado (gradoId),
    // especialidad (especialidadId), tipoPersona (tipoPersonaId)

    // List Object

    @ManyToOne
    @JoinColumn(name = "dependenciaaaaa_id", referencedColumnName = "dependencia_id",nullable = false)
    private DependenciaEntity dependencia;




}
