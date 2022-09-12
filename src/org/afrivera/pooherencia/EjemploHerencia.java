package org.afrivera.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno  = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Rivera");

        Profesor profesor = new Profesor();
        profesor.setNombre("Andrea");
        profesor.setApellido("Muelas");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());

    }
}
