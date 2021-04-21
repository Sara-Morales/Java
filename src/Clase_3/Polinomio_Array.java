
package Clase_3;
import java.util.Arrays;
import java.util.Scanner;
public class Polinomio_Array {
    
    public static void main(String[] args) {
        
//        int array1 [] = new int [3];
//        
//        array1[0]= 2;
//        array1[3]= 3 ;
//        array1[4]= 1;
//        
//        System.out.println("Ingresa el cociente");
//Scanner lea=new Scanner(System.in);//
//        int coeficiente[] =new int[3];
//        int variable[]=new int[3];
//        int resultado=0;
//        coeficiente[0]=2;
//        coeficiente[1]=3;
//        coeficiente[2]=1;
//        for(int i=0;i<variable.length;i++){
//            System.out.print("Digite el valor de X en la posicion "+(i+1)+": ");
//            variable[i]=leer.nextInt();
//            if(i==0){
//                resultado=resultado+coeficiente[i]*variable[i];
//            }else if(i==1){
//                variable[i]=(int) (Math.pow(variable[i],2));
//                resultado=resultado+coeficiente[i]*variable[i];
//                
//            }else if(i==2){
//                variable[i]=(int) (Math.pow(variable[i],3));
//                resultado=resultado+coeficiente[i]*variable[i];
//                
//            }
//        }
//        System.out.println(resultado);
//    }

// otra opcion // 
 

Scanner lea = new Scanner(System.in);
        int[] coeficientes = new int[3];
        int[] valueX = new int[3];
        System.out.println("Ingrese el valor de x: ");
        int x = lea.nextInt();
        //Valores de coeficientes
        for (int f = 0; f <= 2; f++) {
            System.out.println("Ingrese el coeficiente " + (f + 1) + ": ");
            coeficientes[f] = lea.nextInt();
        }
        //Rellenar vector con valores de x
        for (int i = 0; i <= 2; i++) {
            valueX[i] = x;
        }
        System.out.println("coeficientes: " + Arrays.toString(coeficientes));
        System.out.println("valor de X en array: " + Arrays.toString(valueX));
        //Resultado
        double ecuation = coeficientes[0] * valueX[0] + coeficientes[1] * 
                Math.pow(valueX[0], 2) + coeficientes[2] * Math.pow(valueX[2], 3);
        System.out.println("Resultado: " + ecuation);
    }
}
