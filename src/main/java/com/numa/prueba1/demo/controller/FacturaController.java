package com.numa.prueba1.demo.controller;

import com.numa.prueba1.demo.entities.Factura;
import com.numa.prueba1.demo.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FacturaController {

    @Autowired
    public FacturaService facturaService;

    @GetMapping("/facturas")
    public List<Factura> index(){
        return facturaService.findAll();
    }

    @GetMapping("/facturas/{id}")
    public Factura show(@PathVariable Integer id){
        return facturaService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/facturas")
    public Factura create(@RequestBody Factura factura){
        return facturaService.save(factura);
    }

    @PutMapping("/facturas/{id}")
    public Factura update(@RequestBody Factura factura, @PathVariable Integer id){
        Factura factura1 = facturaService.findById(id);
        factura1.setProductos(factura.getProductos());
        factura1.setPrecio(factura.getPrecio());
        factura1.setIdCliente(factura.getIdCliente());
        factura1.setIva(factura.getIva());

        return facturaService.save(factura1);
    }


    @DeleteMapping("/facturas/{id}")
    public void delete(@PathVariable Integer id){
        facturaService.delete(id);
    }



}
