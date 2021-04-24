package Clase_11;

public class Nodo {

    public Persona dato = new Persona();
    public Nodo next = null;

    public Nodo(String cedula, String nombre, String apellido) {

        this.dato.cedula = cedula;
        this.dato.nombre = nombre;
        this.dato.apellido = apellido;
    }
}
