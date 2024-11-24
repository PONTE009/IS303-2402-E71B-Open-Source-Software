package upc.taller.proy.pap.upc_app_pap.controller.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upc.taller.proy.pap.upc_app_pap.entity.core.UsuarioEntity;
import upc.taller.proy.pap.upc_app_pap.entity.utils.UsuarioRequest;
import upc.taller.proy.pap.upc_app_pap.service.core.UsuarioService;

@Slf4j
@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/Insertar")
    public ResponseEntity<UsuarioEntity> Insertar(@RequestBody UsuarioRequest usuarioRequest){
        try{
            UsuarioEntity eUsuario = usuarioService.Insertar(usuarioRequest);
            return ResponseEntity.ok(eUsuario);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
