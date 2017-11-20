/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Clases;

/**
 *
 * @author solan
 */
public class Compra {
 
    private Double codigoCompra;
    private String tipoCompra;
    private Double numFicha;
    private Double cantidadCompra;
    private Float precioTotal;
private String fecha;

    public Compra() {
    }

    public Compra(Double codigoCompra, String tipoCompra, Double numFicha, Double cantidadCompra, Float precioTotal, String años, String mes, String dia) {
        this.codigoCompra = codigoCompra;
        this.tipoCompra = tipoCompra;
        this.numFicha = numFicha;
        this.cantidadCompra = cantidadCompra;
        this.precioTotal = precioTotal;
        this.fecha = fecha;
    }

    public Double getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(Double codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public Double getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(Double numFicha) {
        this.numFicha = numFicha;
    }

    public Double getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(Double cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
