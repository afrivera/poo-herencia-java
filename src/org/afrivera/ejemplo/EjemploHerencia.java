package org.afrivera.ejemplo;

import org.afrivera.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno  = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Rivera");
        alumno.setInstitucion("Politecnico Municipal");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Parker");
        alumnoInt.setPais("Estados Unidos");
        alumnoInt.setEdad(18);
        alumnoInt.setInstitucion("Universidad de New York");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Andrea");
        profesor.setApellido("Muelas");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(alumnoInt.getNombre()
        + " " + alumnoInt.getApellido()
        + " " + alumnoInt.getInstitucion()
        + " " + alumnoInt.getPais());
        System.out.println("Profesor " + profesor.getAsignatura() + " " + profesor.getNombre() + " " + profesor.getApellido());

        Class claseAlumnoInt = alumnoInt.getClass();
        while (claseAlumnoInt.getSuperclass()!=null){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();

            System.out.println(hija + " es una clase hija de la clase padre: " + padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }

    }
}
