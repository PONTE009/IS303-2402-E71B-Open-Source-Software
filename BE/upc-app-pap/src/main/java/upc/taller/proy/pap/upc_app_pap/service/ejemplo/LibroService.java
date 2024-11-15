package upc.taller.proy.pap.upc_app_pap.service.ejemplo;

import upc.taller.proy.pap.upc_app_pap.entity.ejemplo.LibrosEntity;

import java.util.List;

public interface LibroService {

    List<LibrosEntity> listar();
    LibrosEntity insertar(LibrosEntity librosEntity);
    List<LibrosEntity> ConsultarPorAutor(String autor);
    void eliminar(Long libroId);

}
