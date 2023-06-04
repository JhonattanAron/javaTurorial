package com.gamis214.herencia;

public class Caballo extends Animal implements Cuidador {
    String raza;

    public Caballo(String nombre, String tipo_alimentacion, int edad,String raza) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "raza='" + raza + '\'' +
                '}';
    }

    @Override
    public String asignarAnimal(String bloque) {
        return "El bloque asignado al Caballo es " + bloque;
    }

    @Override
    public double estableceBonus(double bonus) {
        double prima = 200;

        return Trabajadores.bonusBase+bonus + prima;
    }
}


