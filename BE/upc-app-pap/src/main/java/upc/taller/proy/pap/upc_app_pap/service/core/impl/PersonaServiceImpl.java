package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.*;
import upc.taller.proy.pap.upc_app_pap.repository.core.PersonaOrganigramaRepository;
import upc.taller.proy.pap.upc_app_pap.repository.core.PersonaRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.PersonaService;

import java.time.LocalDateTime;

@Service
public class PersonaServiceImpl implements PersonaService {


    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    PersonaOrganigramaRepository personaOrganigramaRepository;

    @Transactional
    @Override
    public PersonaEntity Insertar(PersonaEntity personaEntity) {

        TipoPersonaEntity eTipoPersona = TipoPersonaEntity.builder()
                .tipoPersonaId(personaEntity.getTipoPersonaId())
                .build();

        GradoEntity eGrado = GradoEntity.builder()
                .gradoId(personaEntity.getGradoId()).build();

        EspecialidadEntity eEspecialidad = EspecialidadEntity.builder()
                .especialidadId(personaEntity.getEspecialidadId())
                .build();

        personaEntity.setTipopPersona(eTipoPersona);
        personaEntity.setGrado(eGrado);
        personaEntity.setEspecialidad(eEspecialidad);

        PersonaEntity ePersona = personaRepository.save(personaEntity);

        PersonaOrganigramaPK pk = new PersonaOrganigramaPK(ePersona.getPersonaId(),1L);
        PersonaOrganigramaEntity ePersonaOrganigrama = PersonaOrganigramaEntity.builder()
                .id(pk)
                .usuarioRegistro("admin")
                .fechaRegistro(LocalDateTime.now())
                .usuarioModifica("admin")
                .fechaModifica(LocalDateTime.now())
                .activo(1)
                .build();

        PersonaEntity ePer = PersonaEntity.builder()
                        .personaId(ePersona.getPersonaId()).build();

        OrganigramaEntity eOrganigrama = OrganigramaEntity.builder()
                .organigramaId(1L).build();

        ePersonaOrganigrama.setPersona(ePer);
        ePersonaOrganigrama.setOrganigrama(eOrganigrama);

        PersonaOrganigramaEntity personaOrganigrama = personaOrganigramaRepository.save(ePersonaOrganigrama);

        return ePersona;
    }
}
