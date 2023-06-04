package com.gamis214.herencia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Caballo caballo = new Caballo("Venzedor" , "CaballoCan" , 15 , "Venzedor");
        Animal[] misAnimales = new Animal[6];

        misAnimales[0] = new Animal("Bobby" , "Procan " , 10);
        misAnimales[1] = new Animal("Bob" , "Procan " , 5);
        misAnimales[2] = new Animal("Jose" , "Procan " , 7);
        misAnimales[3] = new Animal("Juan" , "Procan " , 2);
        misAnimales[4] = new Perro("Mateo" , "Procan " , 3 , "doverman");
        misAnimales[5] = caballo;

        Arrays.sort(misAnimales);
        System.out.println( "El Bonus al empleado es " + caballo.estableceBonus(500));
        System.out.println(caballo.asignarAnimal("Bloque 1"));


        for(Animal animal : misAnimales){
            System.out.println(animal.toString() + " El bonus Anual es "+ animal.estableceBonus(200));
        }

    }
}
