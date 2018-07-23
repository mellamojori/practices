package com.educacionit.java.lab0401;

public class Cuidador extends Persona {

    private int cantidadDeRaciones;

    public Cuidador (int cantidadDeRaciones){
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

    public String alimentarAnimales (){
        if (this.cantidadDeRaciones >= (Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMAL)){
            return "Las raciones fueron suficientes";
        }
        return "Las raciones NO fueron suficientes";
    }
}
