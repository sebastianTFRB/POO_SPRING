package com.example.libreria.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.libreria.infraestructure.entity.Autor;

public interface AutorCrudRepository extends CrudRepository<Autor, Integer> {
    
}
