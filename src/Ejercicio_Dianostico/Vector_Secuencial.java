package Ejercicio_Dianostico;

import java.util.Scanner;

public class Vector_Secuencial {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int numeros[] = new int[5];

        System.out.println("Ingresa 5 números");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(lea.nextLine());

        }

        System.out.println("Los números ingresados fueron:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i] + " ");
        }
    }
}
