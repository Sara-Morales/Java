package Clase_11;

public class ListasSimple {

    public static void main(String[] args) {

        Nodo nodo1 = new Nodo(9);
        Nodo nodo2 = new Nodo(8);
        Nodo nodo3 = new Nodo(10);
        Nodo cabeza = nodo1;
//        nodo1.dato = 9;
        nodo1.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        System.out.println("Nodo 1 " + cabeza.dato);
        System.out.println("Nodo 2 " + cabeza.siguiente.dato);
        System.out.println("Nodo 3 " + cabeza.siguiente.siguiente.dato);
        
        nodo2.siguiente = nodo1;
        nodo1.siguiente = nodo3;
        cabeza=nodo2;
        System.out.println("Nodo 2 " + cabeza.dato);
        System.out.println("Nodo 1 " + cabeza.siguiente.dato);
        System.out.println("Nodo 3 " + cabeza.siguiente.siguiente.dato);
    }

}
