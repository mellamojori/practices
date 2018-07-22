package com.educacionit.java.lab04.ar.com.educacionit.vehiculos.pruebas;

import com.educacionit.java.lab04.ar.com.educacionit.vehiculos.entidades.Auto;
import com.educacionit.java.lab04.ar.com.educacionit.vehiculos.entidades.Comprador;
import com.educacionit.java.lab04.ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Programa {

    public static void main (String [] args){

        Auto a1 = new Auto("Fiat", "Argo", "blanco", 4, 2, 1);

        System.out.println(a1);

        Comprador c1 = new Comprador("Cynthia", "Gastaldi", "26743987", 560000.00);

        System.out.println(c1);

        Vendedor v1 = new Vendedor("Ramiro", "Pucciarelli", "23981166", 14);

        System.out.println(v1);
    }
}
