package com.leonardo.crud.crudspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.crud.crudspringboot.models.Empleado;
import com.leonardo.crud.crudspringboot.repository.EmpleadoRepositories;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepositories repositories;

    @GetMapping("/empleado")
    public List<Empleado> listAllEmpleado(){
        return repositories.findAll();
    }
    
}
