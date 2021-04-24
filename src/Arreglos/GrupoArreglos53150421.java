/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author Diego Ramirez
 */
public class GrupoArreglos53150421 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int sizeArray = Integer.parseInt(leer.nextLine());
        int[] numero = new int[sizeArray];
       
         for(int i=0;i<sizeArray;i++){
            System.out.println("Por favor ingrese un numero en el  array ");
             numero[i] = Integer.parseInt(leer.nextLine()); ;
        }
        for(int i=0;i<sizeArray;i++){
            System.out.println("El número es "+numero[i]);
        }
        System.out.println("Ingreseel numero a buscar");
        int numeroBuscar= Integer.parseInt(leer.nextLine());
        for(int i=0;i<sizeArray;i++){
           if(numeroBuscar== numero[i]){
           System.out.println("El número que busca se encuentra en la posicion "+ i);
           i=sizeArray;
           }
        }
        
    }

}
