package org.afrivera.pooherencia;

public class Persona {
    // cuando el atributo es privado no se puede heredar con protected sí.
    // lo recomendable es dejarlo siempre private y acceder o asignar con setters y getters
    // el protected solo es accesible en el mismo package o herencia
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
