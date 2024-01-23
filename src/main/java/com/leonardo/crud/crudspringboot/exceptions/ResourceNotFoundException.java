package com.leonardo.crud.crudspringboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * 
 * ESTA ES UNA CLASE PERSONALIZADA
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{

    private static final long  serialVersion = 1L;

    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }

}
