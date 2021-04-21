package Clase_10;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array");
        int sizeArray = Integer.parseInt(lea.nextLine());
        int[] numero = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Por favor ingrese un numero en el  array ");
            numero[i] = Integer.parseInt(lea.nextLine());;
        }
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("El número es " + numero[i]);
        }
        System.out.println("Ingrese el numero a  busacr");
        int numeroBuscar = Integer.parseInt(lea.nextLine());
        for (int i = 0; i < sizeArray; i++) {
            if (numeroBuscar == numero[i]) {
                System.out.println("El número que busca se encuentra en la posicion " + i);
            i=sizeArray;
            }
        }

    }

}
