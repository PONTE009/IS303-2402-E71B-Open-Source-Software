package upc.taller.proy.pap.upc_app_pap.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upc.taller.proy.pap.upc_app_pap.entity.core.PersonaEntity;
import upc.taller.proy.pap.upc_app_pap.service.core.PersonaService;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping(value = "/api/personas", method = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE })
@RequestMapping(value = "/api/personas")
public class PersonaController {

    @Autowired
    private  PersonaService personaService;

    @GetMapping("/Listar")
    public ResponseEntity<List<PersonaEntity>> Listar(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping("Insertar")
    public ResponseEntity<PersonaEntity> Insertar(@RequestBody PersonaEntity personaEntity){

        personaService.Insertar(personaEntity);

        return ResponseEntity.ok(PersonaEntity.builder().build());
    }

    @PutMapping("Actualizar/{idPersona}")
    public ResponseEntity<PersonaEntity> Actualizar(@PathVariable Integer idPersona, @RequestBody PersonaEntity personaEntity){
        return ResponseEntity.ok(PersonaEntity.builder().build());
    }

    @PatchMapping("ActualizarNombre/{idPersona}")
    public ResponseEntity<PersonaEntity> ActualizarNombre(@PathVariable Integer idPersona,  @RequestParam String nombre){
        return ResponseEntity.ok(PersonaEntity.builder().build());
    }

    @DeleteMapping("Eliminar/{idPersona}")
    public ResponseEntity<Boolean> Eliminar(@PathVariable Integer idPersona){
        return ResponseEntity.ok(true);
    }
}
