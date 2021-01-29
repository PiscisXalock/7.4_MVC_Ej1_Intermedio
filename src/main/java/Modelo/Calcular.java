/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Piscis Xalock
 */
public class Calcular {
    private String fechaEnt, fechaSal, tipo;
    private double precio, costeTotal, numDias;
    private double iva = 0.21;

    public Calcular() {
    }

    public Calcular(String fechaEnt, String fechaSal, String tipo) {
        this.fechaEnt = fechaEnt;
        this.fechaSal = fechaSal;
        this.tipo = tipo;
    }

    public String getFechaEnt() {
        return fechaEnt;
    }

    public String getFechaSal() {
        return fechaSal;
    }

    public String getTipo() {
        return tipo;
    }
    
    public double getDias(){
        //Probar Split directamente sin el pattern ni nada y volver a poner en double
        Date date = new Date();
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        fechaEnt = df.format(date);
        fechaSal = df.format(date);
        String[] aFechaIng = fechaEnt.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer yearInicio = Integer.parseInt(aFechaIng[2]);
        Integer resInicio = (diaInicio + mesInicio + yearInicio);
        String[] aFecha = fechaSal.split("/");
        Integer diaFinal = Integer.parseInt(aFecha[0]);
        Integer mesFinal = Integer.parseInt(aFecha[1]);
        Integer yearFinal = Integer.parseInt(aFecha[2]);
        Integer resFinal = (diaFinal + mesFinal + yearFinal);
        return numDias = Integer.parseInt(fechaSal) - Integer.parseInt(fechaEnt);
    }
    
    public double getImporte(){
        if(this.tipo.equals("normal")){
            precio = 50;
            return ((precio * numDias) + iva);
        }else if(this.tipo.equals("superior")){
            precio = 75;
            return ((precio * numDias) + iva);
        }
        return 0;
    }
    
}
