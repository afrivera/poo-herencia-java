package org.afrivera.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor(){
        System.out.println("Profesor: inicializando constructor");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos días soy el profesor: "
                + this.getAsignatura()
                + ", y mi nombre es: "
                + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nasignatura='" + asignatura + '\'' + "\n";
    }
}
