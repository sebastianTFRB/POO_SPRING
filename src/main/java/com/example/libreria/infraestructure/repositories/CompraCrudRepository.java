package com.example.libreria.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.libreria.infraestructure.entity.Compra;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
}
