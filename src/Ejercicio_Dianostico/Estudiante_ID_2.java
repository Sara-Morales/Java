package Ejercicio_Dianostico;

import java.util.Scanner;

public class Estudiante_ID_2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int documentos[] = new int[5];
        int buscarDocumento;
        boolean existe = false;
        int index = 0; //posicion del documento buscado // 

        System.out.println("ingrese el numero de personas");
        int n = Integer.parseInt(lea.nextLine());
        String[] nombres = new String[n];

        // for para pedir datos //
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = lea.nextLine();

            System.out.print("Número documento: ");
            documentos[i] = lea.nextInt();
            lea.nextLine();
        }

        System.out.println("Ingrese el número del documento que quiere buscar");
        buscarDocumento = lea.nextInt();

        for (int i = 0; i < documentos.length; i++) {
            if (buscarDocumento == documentos[i]) {
                index = i;
                existe = true;
            }
        }

        if (existe) {
            System.out.println("El nombre del alumno con el docuemnto " + buscarDocumento + " es: " + nombres[index]);
        } else {
            System.out.println("El DNI ingresado es incorrecto");
        }
    }
}
