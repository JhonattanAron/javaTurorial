package com.gamis214.herencia;


public class Animal implements  Comparable,Trabajadores{

    private String nombre,tipo_alimentacion;
    private int edad;

    public Animal(String nombre,String tipo_alimentacion,int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo_alimentacion='" + tipo_alimentacion + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Animal otroAnimal = (Animal) o;
        if (this.edad<otroAnimal.edad){
            return -1;
        }else if (this.edad > otroAnimal.edad){
            return 1;
        }
        return 0;
    }

    @Override
    public double estableceBonus(double bonus) {
        double bonusAnual = 200;
        return Trabajadores.bonusBase + bonus + bonusAnual;
    }
}
