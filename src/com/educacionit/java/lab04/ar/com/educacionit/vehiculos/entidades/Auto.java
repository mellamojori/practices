package com.educacionit.java.lab04.ar.com.educacionit.vehiculos.entidades;

import com.educacionit.java.lab04.ar.com.educacionit.base.entidades.Vehículo;

public class Auto extends Vehículo {

    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color, int largo, int ancho, int alto) {

        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Vehículo marca: " + marca + ". Modelo: " + modelo + ". Color: " + color +
                              ". Largo: " + getLargo() + "m. Ancho: " + getAncho() + "m. Alto: " + getAlto() + "m.";
    }



}
