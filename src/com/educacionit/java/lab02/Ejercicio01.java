package com.educacionit.java.lab02;

public class Ejercicio01 {

    public static void main (String [] args) {

        int [] vecNumeros   = {11, -22, 33, -44, 55, -66, 77, -88, 99};

        int [] vecPositivos = new int [10];

        for (int i = 0, j = 0; j < vecPositivos.length; i ++) {

            if (i == vecNumeros.length){
                i = 0;
            } else if (vecNumeros [i] > 0) {
                vecPositivos [j] = vecNumeros [i];
                j++;
            }
        }

        int [] vecNegativos = new int [10];

        for (int i = 0, j = 0; j < vecNegativos.length; i++) {

            if (i == vecNumeros.length) {
                i = 0;
            } else if (vecNumeros [i] < 0) {
                vecNegativos[j] = vecNumeros [i];
                j++;
            }
        }

        int totalPositivos = 0;

        for (int i = 0; i < vecPositivos.length; i ++ ) {
            totalPositivos += vecPositivos [i];
        }

        int totalNegativos = 0;

        for (int i = 0; i < vecNegativos.length; i ++) {
            totalNegativos += vecNegativos [i];
        }

        for (int i = 0; i < vecNumeros.length; i ++) {

            System.out.print (vecNumeros[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < vecPositivos.length; i ++) {

            System.out.print (vecPositivos[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < vecNegativos.length; i ++) {

            System.out.print (vecNegativos[i] + " ");
        }

        System.out.println("Total positivos: " + totalPositivos);

        System.out.println("Total negativos: " + totalNegativos);

        System.out.println("Total: " + (totalPositivos + totalNegativos));

        for (int i = 0; i < args.length; i ++) {

            System.out.print (args[i] + " ");
        }
    }
}
