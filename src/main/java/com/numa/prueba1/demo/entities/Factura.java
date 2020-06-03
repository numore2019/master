package com.numa.prueba1.demo.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfactura;

    private String productos;

    private Double precio;

    private Double iva;

    private Integer idCliente;

    public Factura(Integer idfactura, String productos, Double precio, Double iva, Integer idCliente) {
        this.idfactura = idfactura;
        this.productos = productos;
        this.precio = precio;
        this.iva = iva;
        this.idCliente = idCliente;
    }

    public Factura() {
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
