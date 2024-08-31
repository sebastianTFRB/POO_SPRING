package com.example.libreria.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.libreria.infraestructure.entity.Libro;

public interface LibroCrudRepository extends CrudRepository<Libro, Integer> {
}