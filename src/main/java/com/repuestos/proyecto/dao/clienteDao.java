package com.repuestos.proyecto.dao;

import com.repuestos.proyecto.models.clientes;

import java.util.List;

public interface clienteDao {
    public List<clientes> getclientess();

    void eliminar(Integer id);

    void registrar(clientes clientes);
}
