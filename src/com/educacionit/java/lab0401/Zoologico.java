package com.educacionit.java.lab0401;

public class Zoologico {

    //Constante publica a la cual puedo acceder desde cualquier clase.
    public final static int CANTIDAD_ANIMALES   = 25;
    public final static int RACIONES_POR_ANIMAL = 5;
    private boolean abierto;

    public boolean isAbierto (){
        return this.abierto;
    }

    public String status(){
        return this.abierto? "abierto":"cerrado";
    }

    public void abrir(){
       this.abierto = true;
    }

    public String alimentarAnimales(int unaCantidadDeRaciones) {
        Cuidador c1 = new Cuidador(unaCantidadDeRaciones);
        return c1.alimentarAnimales();
    }

    public void cerrar (){
        this.abierto = false;
    }
}
