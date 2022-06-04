package com.upchiapas.Pila;
import java.util.Scanner;
import java.util.Stack;
import com.upchiapas.Pila.models.Alumno;
public class PrincipalPila {
    static Scanner entrada= new Scanner (System.in);
    static Alumno objetoAlumno;
    public static void main(String[] args) {
        visualizarOperaciones();
    }
    public static void visualizarOperaciones(){
        int opcionMenu;
        Stack <Alumno> pilaAlumnos = new Stack<Alumno>(); //Crea una pila vacía
        do{
            System.out.println("OPERACIONES DE LA PILA");
            System.out.println("1. Agregar");
            System.out.println("2. Ver el último");
            System.out.println("3. Eliminar el último");
            System.out.println("4. Salir");
            opcionMenu=entrada.nextInt();
            switch(opcionMenu){
                case 1: pilaAlumnos=agregarAlumno(pilaAlumnos); break;
                case 2: visualizarUltimo(pilaAlumnos); break;
                case 3: eliminarUltimo(pilaAlumnos);  break;
                case 4:  break;
                default: System.out.println ("Error");
            }
        }while(opcionMenu!=4);
    }
    public static Stack <Alumno> agregarAlumno(Stack <Alumno> pila){
        int matricula;
        String nombre;
        System.out.println("Nombre: ");
        nombre=entrada.next();
        System.out.println("Matricula: ");
        matricula=entrada.nextInt();
        objetoAlumno=new Alumno (nombre,matricula);//Creación del objeto Alumno
        pila.push(objetoAlumno); //Agrega el objeto a la Pila
        return pila;
    }
    public static void visualizarUltimo(Stack <Alumno> pila){
        if(pila.isEmpty())
            System.out.println("Pila vacia");
        else
            System.out.println("["+pila.peek().getNombre()+" "+pila.peek().getMatricula()+"]");
    }
    public static void eliminarUltimo(Stack <Alumno> pila){
        if(pila.isEmpty())
            System.out.println("Pila vacia");
        else
            System.out.println("Eliminando matricula-> ["+pila.pop().getMatricula()+"]");
    }
}
