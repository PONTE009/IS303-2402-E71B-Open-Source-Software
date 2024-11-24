package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.*;
import upc.taller.proy.pap.upc_app_pap.entity.utils.UsuarioRequest;
import upc.taller.proy.pap.upc_app_pap.repository.core.PersonaRepository;
import upc.taller.proy.pap.upc_app_pap.repository.core.UsuarioRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.PersonaService;
import upc.taller.proy.pap.upc_app_pap.service.core.UsuarioService;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PersonaRepository personaRepository;


    @Transactional
    @Override
    public UsuarioEntity Insertar(UsuarioRequest request) {
        try{
            List<DependenciaEntity> listaDependencia = new ArrayList<>();
            List<Integer> listaDependenciaIds = request.getPersona().getListaDependenciasIds();

            for(Integer items : listaDependenciaIds){
                DependenciaEntity eDependencia = new DependenciaEntity();
                eDependencia.setDependenciaId(items.longValue());
                listaDependencia.add(eDependencia);
            }

            request.getPersona().setListaDependencia(listaDependencia);

            TipoPersonaEntity eTipoPersona = new TipoPersonaEntity();
            eTipoPersona.setTipoPersonaId(request.getPersona().getTipoPersonaId());

            GradoEntity eGrado = new GradoEntity();
            eGrado.setGradoId(request.getPersona().getGradoId());

            EspecialidadEntity eEspecialidad = new EspecialidadEntity();
            eEspecialidad.setEspecialidadId(request.getPersona().getEspecialidadId());


            request.getPersona().setTipopPersona(eTipoPersona);
            request.getPersona().setGrado(eGrado);
            request.getPersona().setEspecialidad(eEspecialidad);



            // Insetar persona
            PersonaEntity ePersona = personaRepository.save(request.getPersona());
            request.getUsuario().setPersona(ePersona);
            log.info("Ya inserto en la tabla persona");
            if(request.isFlagGeneraError()){
                throw  new Exception("Error controlado");
            }

            // Insertar usuario
            return usuarioRepository.save(request.getUsuario());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
