package com.numa.prueba1.demo.service;

import com.numa.prueba1.demo.entities.Factura;

import java.util.List;

public interface FacturaService {

    public List<Factura> findAll();

    public Factura findById(Integer id);

    public Factura save(Factura factura);

    public void delete(Integer id);


}
