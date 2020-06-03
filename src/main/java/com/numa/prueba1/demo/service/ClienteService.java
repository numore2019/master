package com.numa.prueba1.demo.service;

import com.numa.prueba1.demo.entities.Cliente;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Integer id);

    public Cliente save(Cliente cliente);

    public void delete(Integer id);

}
