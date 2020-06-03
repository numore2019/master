package com.numa.prueba1.demo.controller;

import com.numa.prueba1.demo.entities.Cliente;
import com.numa.prueba1.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente show(@PathVariable Integer id) {
        return clienteService.findById(id);
    }

    @ResponseStatus (HttpStatus.CREATED) // Esta parte es electiva es la respuesta al usar el controlador
    @PostMapping ("/clientes")
    public Cliente create(@RequestBody Cliente cliente) {
        cliente.setFechaCreado(new Date());
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id) {
        Cliente clienteactual = clienteService.findById(id);
        clienteactual.setNombre(cliente.getNombre());
        clienteactual.setApellido(cliente.getApellido());
        clienteactual.setDui(cliente.getDui());
        return clienteService.save(clienteactual);
    }

    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Integer id) {
        clienteService.delete(id);
    }

}
