
package Ejercicio_Dianostico;

import java.util.Arrays;
import java.util.Scanner;
public class Ecuaciones {
    
    public static void main(String[] args) {
        
        Scanner lea= new Scanner (System.in);
        
        int[] coeficientes = new int[3];
        int[] valorX = new int[3];
        
        
        //Numeros de los  coeficientes
        for (int numCoeficientes = 0; numCoeficientes < 3; numCoeficientes++) {
            System.out.println("Ingrese el coeficiente " + (numCoeficientes + 1) + ": ");
            coeficientes[numCoeficientes] = lea.nextInt();
        }
        
        // Pedir valor de X
        System.out.println("Ingrese el valor de x: ");
        int x = lea.nextInt();
        
        //Llena el vector con valores de x
        for (int i = 0; i < 3; i++) {
            valorX[i] = x;
        }
        
        System.out.println("coeficientes: " + Arrays.toString(coeficientes));
        System.out.println("valor de X en array: " + Arrays.toString(valorX));
        
        
        //Resultado
        double ecuation = coeficientes[0] * valorX[0] + coeficientes[1] * 
                Math.pow(valorX[0], 2) + coeficientes[2] * Math.pow(valorX[2], 3);
        System.out.println("Resultado: " + ecuation);
    }
}
