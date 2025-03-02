package upc.taller.proy.pap.upc_app_pap.controller.core;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.taller.proy.pap.upc_app_pap.entity.core.DependenciaEntity;
import upc.taller.proy.pap.upc_app_pap.entity.core.EspecialidadEntity;
import upc.taller.proy.pap.upc_app_pap.service.core.EspecialidadService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/Especialidad")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("/Listar")
    public List<EspecialidadEntity> Listar(){
        return especialidadService.Listar();
    }

}
