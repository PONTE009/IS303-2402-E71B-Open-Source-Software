package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.PersonaEntity;
import upc.taller.proy.pap.upc_app_pap.repository.core.PersonaRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {


    @Autowired
    PersonaRepository personaRepository;


    @Override
    public PersonaEntity Insertar(PersonaEntity personaEntity) {
        return personaRepository.save(personaEntity);
    }
}
