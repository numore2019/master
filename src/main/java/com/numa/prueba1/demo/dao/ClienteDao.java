package com.numa.prueba1.demo.dao;

import com.numa.prueba1.demo.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
