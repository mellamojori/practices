package com.educacionit.java.lab0401;

public class Programa {

    public static void main (String [] args){

        Zoologico zoo = new Zoologico ();

        zoo.abrir();
        System.out.println("El Zoologico está " + zoo.status());

        String racionesSuficientes = zoo.alimentarAnimales(67);

        System.out.println(racionesSuficientes);

        zoo.cerrar();
        System.out.println("El Zoologico está " + zoo.status());

    }
}
