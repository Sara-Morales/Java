/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package Ejercicio_Dianostico;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
class areaSalida {
    public static void main(String[] args) {
      
        Scanner leer1 = new Scanner(System.in);
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de notas que quiere digitar: ");

        double promedio[] = new double[5];
        
        int numeroNota = leer1.nextInt() + 3;
        
        String matriz[][] = new String[6][numeroNota];

        for (int i = 0; i < matriz.length; i++) {

            Scanner cedula = new Scanner(System.in);
            System.out.println("Ingrese cedula del estudiante: ");
            matriz[i][1] = leer.nextLine();

            Scanner nombre = new Scanner(System.in);
            System.out.println("Ingrese nombre del estudiante: ");
            matriz[i][0] = leer.nextLine();

            Scanner materia = new Scanner(System.in);
            System.out.println("ingrese materia del estudiante: ");
            matriz[i][2] = leer.nextLine();

            for (int a = 3; a < matriz[0].length; a++) {

                System.out.println("Ingrese nota del estudiante: ");

                double notaDeLaMateria = leer1.nextDouble();

                promedio[i] += notaDeLaMateria;

                matriz[i][a] = "" + notaDeLaMateria;

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            
            System.out.println("Estudiante numero: " + i);

            for (int a = 0; a < matriz[0].length; a++) {
                
                double NotaPromedio = promedio[i] / numeroNota;
                
                System.out.println(matriz[i][a]);

                System.out.println("Promedio nota de la materia: " + NotaPromedio);

            }

        }
    }
    
}
