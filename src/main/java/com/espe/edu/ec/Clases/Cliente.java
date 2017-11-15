/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Clases;

/**
 *
 * @author Solange
 * @author Victoria
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Double telefonoFijo;
    private Double celular;
    private String direccion;
    private String correo;

    public Cliente(String cedula, String nombre, String apellidoPaterno, String apellidoMaterno, Double telefonoFijo, Double celular, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefonoFijo = telefonoFijo;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Double getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Double telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Double getCelular() {
        return celular;
    }

    public void setCelular(Double celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
