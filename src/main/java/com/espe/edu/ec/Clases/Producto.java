/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Clases;

/**
 *
 * @author solange
 * @author Victoria
 */
public class Producto {
    
    private Double codigo;
    private Double serie;
    private String nombre;
    private String marca;
    private Float precio;
    private String descripcion;
    private String tipo; 
    private Double cantidad;

    public Producto() {
    }

    public Producto(Double codigo, Double serie, String nombre, String marca, Float precio, String descripcion, String tipo, Double cantidad) {
        this.codigo = codigo;
        this.serie = serie;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }

    public Double getSerie() {
        return serie;
    }

    public void setSerie(Double serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
