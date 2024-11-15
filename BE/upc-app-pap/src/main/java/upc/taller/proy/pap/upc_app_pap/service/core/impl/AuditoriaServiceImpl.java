package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.AuditoriaEntity;
import upc.taller.proy.pap.upc_app_pap.repository.core.AuditoriaRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.AuditoriaService;

import java.util.List;

@Service
public class AuditoriaServiceImpl implements AuditoriaService {

    @Autowired
    AuditoriaRepository auditoriaRepository;

    @Override
    public List<AuditoriaEntity> Listar() {
        return auditoriaRepository.findAll();
    }

    @Override
    public AuditoriaEntity Insertar(AuditoriaEntity auditoriaEntity) {
        return auditoriaRepository.save(auditoriaEntity);
    }

    @Override
    public void Eliminar(String auditoriaId) {
        auditoriaRepository.deleteById(auditoriaId);
    }
}
