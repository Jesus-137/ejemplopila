package com.upchiapas.Pila.models;//sin esto no se puede llamar la clase

public class Alumno{
    String nombre;
    int matricula;

    public Alumno(String nombreA, int matriculaA){
        this.nombre=nombreA;
        this.matricula=matriculaA;
    }
    public String getNombre(){
        return nombre;
    }
    public int getMatricula(){
        return matricula;
    }
}
