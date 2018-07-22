package com.educacionit.java.lab04.ar.com.educacionit.vehiculos.entidades;

import com.educacionit.java.lab04.ar.com.educacionit.base.entidades.Persona;

public class Comprador extends Persona {

    private double presupuesto;

    public Comprador(String nombre, String apellido, String numeroDocumento, double presupuesto) {
        super(nombre, apellido, numeroDocumento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString (){
        return String.valueOf(getNombre() + " " + getApellido() + " DNI: " + getNumeroDocumento() +
                                            " cuenta con un presupuesto de: $" + presupuesto + ".");
    }
}
