package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.EspecialidadEntity;
import upc.taller.proy.pap.upc_app_pap.repository.core.EspecialidadRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.EspecialidadService;

import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public List<EspecialidadEntity> Listar() {
        return especialidadRepository.findAll();
    }
}
