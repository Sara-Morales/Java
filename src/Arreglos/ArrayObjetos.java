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
public class ArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de cuentas que necesita");
        int maxSize= Integer.parseInt(leer.nextLine());
        Cuenta[] cuenta = new Cuenta[maxSize];
        double valor = 0;
        int id=0;
        for (int i = 0; i < maxSize; i++) {
            System.out.println("Ingrese un id");
            id = Integer.parseInt(leer.nextLine());
            System.out.println("Ingrese el valor");
            valor = Double.valueOf(leer.nextLine());
            cuenta[i] = new Cuenta(valor,id);
           
        }
 for (int i = 0; i < maxSize; i++) {
            System.out.println("El id de la posición "+i+" es "+cuenta[i].id+" y el valor es "+cuenta[i].valor);
                     
        }
 int buscarId=Integer.parseInt(leer.nextLine());
 for (int i = 0; i < maxSize; i++) {
          if(cuenta[i].id==buscarId){
           System.out.println("El  valor de la cuenta con el id  "+cuenta[i].id+" es "+cuenta[i].valor);
           i=maxSize;
          }else{
              System.out.println("No se encontró el valor");
          }          
        }
    }

}
