package upc.taller.proy.pap.upc_app_pap.controller.core;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import upc.taller.proy.pap.upc_app_pap.entity.core.DependenciaEntity;
import upc.taller.proy.pap.upc_app_pap.service.core.DependenciaService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/dependencias")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class DependenciaController {

    private final DependenciaService depService;

    public DependenciaController(DependenciaService dependenciaService){
        this.depService = dependenciaService;
        log.info("Iniciando el contructor " + depService);
    }

    @Operation(
            summary = "Listar todas las dependencias",
            description = "Realiza el listado de dependencias" +
                    "<br><b>Respuesta del servicio</b>" +
                    "<br> - 200 -> Respuesta correcta" +
                    "<br> - 400 -> BadRequest"
    )
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "Dependencia listado correctamente"
            , content =  {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @GetMapping("/Listar")
    public List<DependenciaEntity> Listar(){
        return depService.Listar();
    }

    @Operation(summary = "Listar todas las dependencias por paginado de 5 en 5")
    @GetMapping("/ListarPaginado")
    public Page<DependenciaEntity> ListarPaginado(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "5") Integer size){

        Pageable pageable = PageRequest.of(page, size);

        return depService.ListarPaginado(pageable);
    }

    @PostMapping("/Insertar")
    public DependenciaEntity Insertar(@RequestBody DependenciaEntity dependenciaEntity){
        return depService.Insertar(dependenciaEntity);
    }

}
