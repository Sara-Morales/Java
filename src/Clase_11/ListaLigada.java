package Clase_11;

public class ListaLigada {

    public Nodo head = null;

    public void insertarPrincipio(String cedula, String nombre, String apellido) {
        Nodo newNodo = new Nodo(cedula, nombre, apellido);
        if (head == null) {
            head = newNodo;
        } else {
            newNodo.next = head;
            head = newNodo;
        }
    }

    public void insertarFinal(String cedula, String nombre, String apellido) {
        Nodo newNodo = new Nodo(cedula, nombre, apellido);
        if (head == null) {
            head = newNodo;
        } else {
            Nodo pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNodo;
        }

    }

    public void mostrar() {

        Nodo pointer = head;
        while (pointer.next != null) {
            System.out.println(pointer.dato.nombre);
            pointer = pointer.next;

        }
        System.out.println(pointer.dato.nombre);
    }
}
