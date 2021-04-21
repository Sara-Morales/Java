package Clase_1_Vectores;

import java.util.Scanner;

public class ConveritrString {

    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        int numeroDenominadorInfinito = 3;
        double numeroReal = 3.5;
        String nombre = "";
        boolean bandera = true;
        //System.out.println("Ingrese el nombre");
        //nombre= lecturaTeclado.nextLine();
        //System.err.println(nombre);

        // System.out.println("Ingrerse un número");
        //numeroDenominadorInfinito= Integer.parseInt(lecturaTeclado.nextLine());// Buena practica converitr de string a entero//
        //System.out.println(numeroDenominadorInfinito);
        numeroReal = Double.valueOf(lecturaTeclado.nextLine()); // de string a double // 

    }

}
