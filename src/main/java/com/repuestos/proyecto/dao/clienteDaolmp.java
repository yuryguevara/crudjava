package com.repuestos.proyecto.dao;


import com.repuestos.proyecto.models.clientes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class clienteDaolmp implements clienteDao{

    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public List<clientes> getclientess() {

        String query = "FROM clientes"
                ;

        return entityManager.createQuery(query).getResultList()
                ;
    }

    @Override
    public void eliminar(Integer id) {
        clientes clientes = entityManager.find(clientes.class, id);
        entityManager.remove(clientes);
    }

    @Override
    public void registrar(clientes clientes) {
        entityManager.merge(clientes);
    }
}
