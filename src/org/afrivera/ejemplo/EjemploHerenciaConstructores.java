package org.afrivera.ejemplo;

import org.afrivera.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("==========Creando la Instancia Alumno==========");
        Alumno alumno  = new Alumno("Andres", "Rivera", 32, "Politecnico Municipal");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setCorreo("andres@correo.com");

        System.out.println("\n==========Creando la Instancia AlumnoInternacional==========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Parker", "Estados Unidos");
        alumnoInt.setEdad(18);
        alumnoInt.setInstitucion("Universidad de New York");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setCorreo("peter@parker.com");

        System.out.println("\n==========Creando la Instancia Profesor==========");
        Profesor profesor = new Profesor("Paola", "Muelas", "Pregrado");
        profesor.setCorreo("paola.profesor@correo.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){

        System.out.println("Imprimiendo los datos en común del tipo Persona");
        System.out.println("Nombre: " + persona.getNombre() +
                ", Apellido: " + persona.getApellido() +
                ", Edad: " + persona.getEdad() +
                ", email: " + persona.getCorreo());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: "  + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if( persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura" + ((Profesor) persona).getAsignatura());
        }
        System.out.println("=".repeat(20));
    }
}
