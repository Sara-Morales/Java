package Clase_11;

public class L53220421 {

    public static void main(String[] args) {
        Nodo nodo0 = new Nodo("34", "Jorge", "Perez");;
        Nodo nodo1 = new Nodo("34", "Miguel", "Gomez");
        Nodo nodo2 = new Nodo("35", "José", "Fernandez");
        Nodo nodo3 = new Nodo("38", "Pablo", "Fernandez");
        Nodo head = null;
        nodo0.next = nodo1;
        head = nodo0;o2
        nodo1.next = nodo2;
        nodo3.next = head;
        head = nodo3;
        System.out.println("Primer dato del nodo " + head.dato.nombre);
        System.out.println("Primer dato del nodo " + head.next.dato.nombre);
        System.out.println("Primer dato del nodo " + head.next.next.dato.nombre);
        System.out.println("Primer dato del nodo " + head.next.next.next.dato.nombre);
        //System.out.println(nodo.dato.apellido);
        System.out.println(nodo1);
        if (nodo0 == null) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
}
