package Clase_11;

public class ListaLigada {

    Nodo head = new Nodo();

    public void insertarPrincipio(int dato) {
        Nodo nodo = new Nodo(dato);

        if (head == null) {
            head = nodo;
        } else {
            nodo.siguiente = head;
            head = nodo;
        }

    }

    public void inserFinal(int dato) {
        Nodo nodo = new Nodo(dato);
        if (head == null) {
            head = nodo;
        } else {
            Nodo apuntador = head;
            while (apuntador.siguiente != null) {
                apuntador = apuntador.siguiente;
            }
            apuntador.siguiente = nodo;

        }
    }

    public void mostrar() {
//        System.out.println(head.dato);
//        System.out.println(head.siguiente.dato);

        Nodo apuntador = head;
        int contador ;

        while (apuntador.siguiente != null) {
            System.out.println(apuntador.dato);
            apuntador = apuntador.siguiente;
        }
    }
}
