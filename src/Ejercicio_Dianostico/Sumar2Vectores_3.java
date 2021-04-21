package Ejercicio_Dianostico;

import java.util.Scanner;

public class Sumar2Vectores_3 {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        int vector1[] = new int[10];
        int vector2[] = new int[10];
        int sumaVector[] = new int[10];

        System.out.println("Ingresa los 10 números para el primer vector");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector1[i] = Integer.parseInt(lea.nextLine());
        }

        System.out.println("Ingresa los 10 número para el segundo vector");
        for (int j = 0; j < vector2.length; j++) {
            System.out.print("Numero " + (j + 1) + ":");
            vector2[j] = Integer.parseInt(lea.nextLine());
        }
        
        System.out.println("Las sumas de los vectores son:");
        for (int i = 0; i < 10; i++) {

        sumaVector[i] = vector1[i] + vector2[i];
            System.out.println(sumaVector[i]);            
        }

    }

}
