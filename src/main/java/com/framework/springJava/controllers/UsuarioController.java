package com.framework.springJava.controllers;

import com.framework.springJava.db.UsuarioDb;
import com.framework.springJava.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    //INYECCION DE DEPENDENCIAS
    @Autowired // crea un objeto automaticamente en la clase usuarioDbImp y lo guarda en esta variable creada I
    private UsuarioDb usuarioDb;

    @RequestMapping(value = "usuario/{id}") //nombre de la URL
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Alexandra");
        usuario.setApellido("Arias");
        usuario.setEmail("jealexa321@gmail.com");
        usuario.setTelefono("3232831235");
        return  usuario;
    }


    //Llamado GET de lista de usuarios
    @RequestMapping(value = "usuarios") //nombre de la URL
    public List<Usuario> getUsuarios(){
        return usuarioDb.getUsuarios();
    }





    @RequestMapping(value = "usuario1") //nombre de la URL
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alexandra");
        usuario.setApellido("Arias");
        usuario.setEmail("jealexa321@gmail.com");
        usuario.setTelefono("3232831235");
        return  usuario;
    }

    @RequestMapping(value = "usuario2") //nombre de la URL
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alexandra");
        usuario.setApellido("Arias");
        usuario.setEmail("jealexa321@gmail.com");
        usuario.setTelefono("3232831235");
        return  usuario;
    }

    @RequestMapping(value = "usuario3") //nombre de la URL
    public Usuario bucar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Alexandra");
        usuario.setApellido("Arias");
        usuario.setEmail("jealexa321@gmail.com");
        usuario.setTelefono("3232831235");
        return  usuario;
    }
}
