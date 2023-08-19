package com.framework.springJava.db;

import com.framework.springJava.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository // accede al repositorio de la base de datos
@Transactional // realiza las consultas SQL (estructura y ejecución)

public class UsuarioDbImp implements UsuarioDb{
     @PersistenceContext
      EntityManager entityManager; // conexión a la base de datos

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
       return entityManager.createQuery(query).getResultList();

    }
}
