/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author solan
 */
public class Operaciones {
 
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) 
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else if (cedula.length() == 13) {
                cedulaCorrecta = true;
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    public float transaccion(float saldo, float monto) {
        float nsaldo;
        nsaldo = saldo + monto;
        if (nsaldo < 0) {
            return -1;
        } else {
            return nsaldo;
        }

    }

    private boolean ValidarAnio(int anio) {
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public int diasMes(int m, int anio) {
        int aux = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                aux = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                aux = 30;
                break;
            case 2:
                if (ValidarAnio(anio) == true) {
                    aux = 29;
                } else {

                    aux = 28;
                }
                break;

        }

        return aux;
    }

    public String validarRangoFechas(String fechaI, String fechaF, String fechaAc) throws ParseException {
        String resultado = "";
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate1 = (Date) formateador.parse(fechaI);
        Date fechaDate2 = (Date) formateador.parse(fechaF);
        Date fechaDateAc = (Date) formateador.parse(fechaAc);

        String diaI = fechaI.substring(8, 9);
        String diaF = fechaF.substring(8, 9);
        String mesI = fechaI.substring(5, 6);
        String anioI = fechaI.substring(0, 3);
        int intmesI = Integer.parseInt(mesI);
        int intanioI = Integer.parseInt(anioI);
        int intdiaI = Integer.parseInt(diaI);

        String mesF = fechaF.substring(5, 6);
        String anioF = fechaF.substring(0, 3);
        int intmesF = Integer.parseInt(mesF);
        int intanioF = Integer.parseInt(anioF);
        int intdiaF = Integer.parseInt(diaF);
        //String ini=String.valueOf(diasMes(intmesI,intanioI));
        //String fin=String.valueOf(diasMes(intmesF,intanioF));
        int ini = diasMes(intmesI, intanioI);
        int fin = diasMes(intmesF, intanioF);

        if (fechaDate1.before(fechaDateAc) && (ini >= intdiaI) && (fin >= intdiaF)) {
            if ((fechaDate2.before(fechaDate1)) && (ini >= intdiaI) && (fin >= intdiaF)) {
                resultado = "0";
                //resultado= "El rango de fechas está ingresado incorrectamente ";
            } else if ((ini >= intdiaI) && (fin >= intdiaF)) {
                //resultado="Se realizará la busqueda";
                resultado = "1";
            }
        } else {
            //resultado="El rango de fechas está ingresado incorrectamente"+fechaAc;
            resultado = "0";
        }
        return resultado;
    }
}
