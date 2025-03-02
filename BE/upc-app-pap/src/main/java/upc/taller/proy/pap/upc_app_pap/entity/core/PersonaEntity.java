package upc.taller.proy.pap.upc_app_pap.entity.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import upc.taller.proy.pap.upc_app_pap.entity.utils.Auditoria;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
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


    @Transient
    private List<Integer> listaDependenciasIds;

    // Tabla dependencia (dependenciaId), grado (gradoId),
    // especialidad (especialidadId), tipoPersona (tipoPersonaId)

    // List Object

    /*@ManyToOne
    @JoinColumn(name = "dependenciaaaaa_id", referencedColumnName = "dependencia_id",nullable = false)
    private DependenciaEntity dependencia;*/

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "tbl_persona_dependencia", schema = "pap",
            joinColumns = @JoinColumn(name = "persona_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "dependencia_id", nullable = false)
    )
    private List<DependenciaEntity> listaDependencia;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "especialidad_id", referencedColumnName = "especialidad_id",nullable = false)
    private EspecialidadEntity especialidad;

    @Transient
    private Long EspecialidadId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "grado_id", referencedColumnName = "grado_id",nullable = false)
    private GradoEntity grado;

    @Transient
    private Long GradoId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tipo_persona_id", referencedColumnName = "tipo_persona_id",nullable = true)
    private TipoPersonaEntity tipopPersona;

    @Transient
    private Long TipoPersonaId;

    @JsonIgnore
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL,orphanRemoval = true)
    private UsuarioEntity usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonaOrganigramaEntity> listaOrganigrama = new ArrayList<>();

}
