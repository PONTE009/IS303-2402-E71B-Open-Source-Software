package upc.taller.proy.pap.upc_app_pap.controller.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.taller.proy.pap.upc_app_pap.entity.core.AuditoriaEntity;
import upc.taller.proy.pap.upc_app_pap.entity.ejemplo.LibrosEntity;
import upc.taller.proy.pap.upc_app_pap.service.core.AuditoriaService;
import upc.taller.proy.pap.upc_app_pap.service.ejemplo.LibroService;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    LibroService libroService;

    @Autowired
    AuditoriaService auditoriaService;


    @GetMapping("/listar")
    public List<LibrosEntity> Listar(){

        AuditoriaEntity eAuditoria = new AuditoriaEntity();
        eAuditoria.setId("1");
        eAuditoria.setUrlServicio("/listar");
        eAuditoria.setUsuario("admin");
        eAuditoria.setFechaConsulta("03-11-2024");
        eAuditoria.setRequest("123");
        eAuditoria.setResponse("[{key:value},{key:value}]");
        eAuditoria.setEstadoPeticion(200);

        auditoriaService.Insertar(eAuditoria);
        return libroService.listar();
    }

    @PostMapping("/insertar")
    public LibrosEntity insertar(@RequestBody LibrosEntity librosEntity){
        return libroService.insertar(librosEntity);
    }

    @GetMapping("/ConsultarPorAutor")
    public List<LibrosEntity> ConsultarPorAutor(@RequestParam String Autor){
        return libroService.ConsultarPorAutor(Autor);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long libroId){
        libroService.eliminar(libroId);
    }

}
