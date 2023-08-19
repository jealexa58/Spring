package com.framework.springJava.db;

import com.framework.springJava.models.Usuario;

import java.util.List;
// se realiza la implementación de las funciones, estas funciones utiilizan la funciones del controllers
public interface UsuarioDb {

    List<Usuario> getUsuarios();

}
