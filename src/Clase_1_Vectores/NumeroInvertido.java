package Clase_1_Vectores;


import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class NumeroInvertido {

    public static void main(String[] args) {

        int numeros[] = new int[5];
        Scanner lea = new Scanner(System.in);
        
        ImageIcon logoPerrito = new ImageIcon("/img/logoPerrito");
        JOptionPane.showMessageDialog(null,"Hola","Ejercicio de números invertidos",0,logoPerrito);
        
        
        System.out.println("Ingresa 5 númeritos: ");
        numeros[0] = lea.nextInt();
        numeros[1] = lea.nextInt();
        numeros[2] = lea.nextInt();
        numeros[3] = lea.nextInt();
        numeros[4] = lea.nextInt();
        
        
        JOptionPane.showMessageDialog(null,"Los numeros ingresados son:" +" " + numeros[0] +" " + numeros[1] + " " +numeros[2] + " " + numeros[3]+ " " + numeros[4]);
        
        
        JOptionPane.showMessageDialog(null,"Numeros invertidos son:" );
        System.out.println("Los números inveritods son:");
        for (int contador  = numeros.length - 1 ; contador >= 0 ; contador--) {
            System.out.println(numeros[contador]);

        }

    }

}
