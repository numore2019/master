package com.numa.prueba1.demo.dao;

import com.numa.prueba1.demo.entities.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaDao extends CrudRepository<Factura, Integer> {
}
