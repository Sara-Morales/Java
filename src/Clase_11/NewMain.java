
package Clase_11;


public class NewMain {

    
    public static void main(String[] args) {
       ListaLigada listaLigada =new ListaLigada();
       listaLigada.insertarPrincipio("3", "jose", "Gomez");
       listaLigada.insertarPrincipio("2", "Pedro", "Mendez");
       listaLigada.insertarFinal("7", "Juan", "Estrada");
       listaLigada.mostrar();
    }
    
}
