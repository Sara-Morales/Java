
package Clase_3;
import java.util.Scanner;

public class Kelvin_a_Celsius {
    
    public static void main(String[] args) {
        
        
        double kelvin;
        Scanner lea=new Scanner(System.in);
        
        System.out.println("Ingresa °k");
        kelvin=lea.nextDouble();
        System.out.println(kelvin + "°c equivale a " + (kelvin + 273.15) + "°c");
        
        
        //
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Digite los grados en kelvin: ");
//       int k=leer.nextInt();
//       double c=k-273.15;
//       System.out.println("Convercion a Celcius: "+c);//
    }
    
}
