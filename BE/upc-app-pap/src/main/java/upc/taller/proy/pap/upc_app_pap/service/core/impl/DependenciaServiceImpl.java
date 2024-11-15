package upc.taller.proy.pap.upc_app_pap.service.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.core.DependenciaEntity;
import upc.taller.proy.pap.upc_app_pap.repository.core.DependenciaRepository;
import upc.taller.proy.pap.upc_app_pap.service.core.DependenciaService;

import java.util.List;
import java.util.Optional;

@Service
public class DependenciaServiceImpl implements DependenciaService {

    @Autowired
    DependenciaRepository dependenciaRepository;

    @Override
    public List<DependenciaEntity> Listar() {
        return dependenciaRepository.findAll();
    }

    @Override
    public Page<DependenciaEntity> ListarPaginado(Pageable pageable) {
        return dependenciaRepository.findAll(pageable);
    }

    @Override
    public Optional<DependenciaEntity> BuscarPorId(Long id) {
        return dependenciaRepository.findById(id);
    }

    @Override
    public List<DependenciaEntity> BuscarPorDescripcion(String descripcion) {
        return dependenciaRepository.findByDescripcionLike("%" + descripcion + "%");
    }

    @Override
    public DependenciaEntity Insertar(DependenciaEntity dependenciaEntity) {
        return dependenciaRepository.save(dependenciaEntity);
    }

    @Override
    public DependenciaEntity Actualizar(DependenciaEntity dependenciaEntity) {
        return dependenciaRepository.save(dependenciaEntity);
    }

    @Override
    public void Elminar(Long id) {
        dependenciaRepository.deleteById(id);
    }
}
