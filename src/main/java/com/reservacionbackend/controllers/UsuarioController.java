package com.reservacionbackend.controllers;

import com.reservacionbackend.models.UsuarioModel;
import com.reservacionbackend.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/save")
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){


        return this.usuarioService.guardarUsuario(usuario);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se elimino el usuario con id" + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuariPorId(@PathVariable("id") long id){
        return this.usuarioService.obtenerPorId(id);
    }
}
