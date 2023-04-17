package com.repuestos.proyecto.controller;

import com.repuestos.proyecto.dao.clienteDao;
import com.repuestos.proyecto.models.clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UsuarioController {
    @Autowired
    private clienteDao clienteDao;
    @RequestMapping(value = "cliente/{id}", method = RequestMethod.GET)
    public clientes getclientes(@PathVariable Integer id) {
        clientes clientes = new clientes();
        clientes.setId(1206534);
        clientes.setNombre("Fernando");
        clientes.setCelular("321789945");
        clientes.setCorreo("flopez918@gmail.com");
        clientes.setDireccion("5555555");
        return clientes;
    }


    @RequestMapping(value = "clientess",method = RequestMethod.GET)
    public List<clientes> getclientess() {
        return clienteDao.getclientess();
    }

    @RequestMapping(value = "clientess/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Integer id){
        clienteDao.eliminar(id);
    }

    @RequestMapping(value = "clientes2")
    public clientes editar() {
        clientes clientes = new clientes();
        clientes.setId(1206534);
        clientes.setNombre("Fernando");
        clientes.setCelular("321789945");
        clientes.setCorreo("flopez918@gmail.com");
        clientes.setDireccion("5555555");
        return clientes;
    }
    @RequestMapping(value = "clientess", method = RequestMethod.POST)
    public void registrarclientes(@RequestBody clientes clientes) {
        clienteDao. registrar(clientes);
    }



    @RequestMapping(value = "clientes3")
    public clientes buscar() {
        clientes clientes = new clientes();
        clientes.setId(1206534);
        clientes.setNombre("Fernando");
        clientes.setCelular("321789945");
        clientes.setCorreo("flopez918@gmail.com");
        clientes.setDireccion("5555555");
        return clientes;
    }

}
