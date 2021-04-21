
package Clase_1_Vectores;
import java.util.Scanner;

public class Arrays {

    
    public static void main(String[] args) {
        
        Scanner lea= new Scanner(System.in);
        
//        String[] car = {"Volvo","BMW","Ford","Mazda"};
//        System.out.println(car[0]);
//        System.out.println(car[1]);
//        System.out.println(car[2]);

        String[] cosas= new String [3];
        System.out.println("Ingresa el nombre del objeto 1 ");
        cosas [0]= lea.nextLine();
        
        System.out.println("Ingresa el nombre del objeto 2 ");
        cosas [1]= lea.nextLine();
        
        System.out.println("Ingresa el nombre del objeto 3 ");
        cosas [2]= lea.nextLine();
        
        System.out.println("La cosa 0 :" +cosas[0]);
        System.out.println("La cosa 1 :" + cosas[1]);
        System.out.println("La cosa 2 :" + cosas [2]);
        
        System.out.println(cosas.length); // imprime la cantidad del arreglo //
        
        
        for (int i = 0; i < cosas.length; i++) { 
            System.out.println("La cosa " +i+ " " + cosas[i]);
        }
        
    }
    
}
