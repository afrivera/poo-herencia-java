package org.afrivera.ejemplo;

import org.afrivera.pooherencia.Alumno;
import org.afrivera.pooherencia.AlumnoInternacional;
import org.afrivera.pooherencia.Persona;
import org.afrivera.pooherencia.Profesor;

public class EjemploHerenciaToString {
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
        System.out.println("=".repeat(30));
        System.out.println(persona.toString());
    }
}
