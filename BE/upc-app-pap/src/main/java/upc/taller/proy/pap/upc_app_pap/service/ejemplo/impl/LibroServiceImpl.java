package upc.taller.proy.pap.upc_app_pap.service.ejemplo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.taller.proy.pap.upc_app_pap.entity.ejemplo.LibrosEntity;
import upc.taller.proy.pap.upc_app_pap.repository.ejemplo.LibroRepository;
import upc.taller.proy.pap.upc_app_pap.service.ejemplo.LibroService;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<LibrosEntity> listar() {
        return libroRepository.findAll();
    }

    @Override
    public LibrosEntity insertar(LibrosEntity librosEntity) {
        return libroRepository.save(librosEntity);
    }

    @Override
    public List<LibrosEntity> ConsultarPorAutor(String autor) {
        return libroRepository.findByAutorLike(autor);
    }

    @Override
    public void eliminar(Long libroId) {
        CalculaVenta();
        libroRepository.deleteById(libroId);
    }

    private Double CalculaVenta(){
        return 130.98;
    }
}
