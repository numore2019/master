package com.numa.prueba1.demo.service;

import com.numa.prueba1.demo.dao.FacturaDao;
import com.numa.prueba1.demo.entities.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements  FacturaService{

    @Autowired
    FacturaDao facturaDao;

    @Override
    public List<Factura> findAll() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    public Factura findById(Integer id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    public Factura save(Factura factura) {
        return facturaDao.save(factura);
    }

    @Override
    public void delete(Integer id) {
        facturaDao.deleteById(id);
    }
}
