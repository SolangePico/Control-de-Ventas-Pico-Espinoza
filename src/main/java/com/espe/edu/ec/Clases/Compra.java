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
    private String años;
    private String mes;
    private String dia;

    public Compra() {
    }

    public Compra(Double codigoCompra, String tipoCompra, Double numFicha, Double cantidadCompra, Float precioTotal, String años, String mes, String dia) {
        this.codigoCompra = codigoCompra;
        this.tipoCompra = tipoCompra;
        this.numFicha = numFicha;
        this.cantidadCompra = cantidadCompra;
        this.precioTotal = precioTotal;
        this.años = años;
        this.mes = mes;
        this.dia = dia;
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

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }    
}
