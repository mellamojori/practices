package com.educacionit.java.lab03;

public class Programa {

    public static void main (String [] args){

        Vehículo v1 = new Vehículo(4, 1, 6);
        System.out.println("El vehículo tiene " + v1.getAlto() + "m de alto, " + v1.getAncho() +
                           "m de ancho y " + v1.getLargo() + "m de largo.");

        Persona p1 = new Persona ("Veronique", "Dumas", "33782934");
        System.out.println(p1.getNombre() + " " + p1.getApellido() + ", DNI: " + p1.getNumeroDocumento());

    }
}
