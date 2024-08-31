package com.example.libreria.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.libreria.infraestructure.entity.Cliente;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
}
