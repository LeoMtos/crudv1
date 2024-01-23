package com.leonardo.crud.crudspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.crud.crudspringboot.models.Empleado;

@Repository
public interface EmpleadoRepositories extends JpaRepository<Empleado, Long> {



     
}
