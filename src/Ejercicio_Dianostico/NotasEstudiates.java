package Ejercicio_Dianostico;

import static Ejercicio_Dianostico.NotasEstudiates.lea;
import java.util.Scanner;

public class NotasEstudiates {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        
        int cantidadEstudiantes, cantidadNotas;
        
        System.out.println("Ingrese la cantidad de estudiantes");
        cantidadEstudiantes=lea.nextInt();
        
        System.out.println("Ingresa el numero de notas");
        cantidadNotas= lea.nextInt();
        
        String cedula [] [] = new String [cantidadEstudiantes][2];
        double notas [] [] = new double [cantidadEstudiantes] [cantidadNotas];
        double l[] [] = new double [cantidadEstudiantes] [2];
        for (int i = 0; i < cantidadEstudiantes; i++) {
            
            String n,s ;
            double suma =0;
            n= lea.nextLine();
            cedula[i][0]=n;
            cedula[i][0] = n ;
            
            System.out.println("\n\nDatos del alumno #" + (i + 1));
            System.out.println("Ingresa el nombre del estudiante" );
            n= lea.nextLine();
            cedula [i][0]= n ;
            
            System.out.println("Ingrese la cedula del estudiante  " );
            s= lea.nextLine();
            cedula[i][1] =s;
            
            System.out.println("Ingresa las notas ");
            for (int j = 0; j < cantidadEstudiantes; j++) {
               System.out.print("Nota #" + (j + 1) + ": ");
                notas [i][j] = lea.nextDouble();
                suma = suma + notas [i][j];
            }
            l[i][1]= suma;
            
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("------------------------");
            System.out.println("El estudiante " +cedula[i][0]);
            System.out.println("Con cedula " + cedula[i][1]);
            if (l[i][1] / cantidadNotas <3) {
                System.out.println(" es aprobado" );
                System.out.println("------------------------");
            }else {
                System.out.println("No es aprobado");
            }
        }

    }
}

    
    
    
//    static String[] nombres;
//    static double[][] calificaciones;
//    static double[] promedios;
//
//    public static void main(String[] args) {
//
//        System.out.print("¿Cuantas alumnos introducirá?: ");
//        int cantidad = Integer.parseInt(teclado.nextLine());
//
//        //Inicializamos arrays
//        nombres = new String[cantidad];
//        calificaciones = new double[cantidad][5]; //Son 5 materias, asi que serán 5 calificaciones por alumno 
//        promedios = new double[cantidad];
//
//        //Empezamos a pedir datos
//        for (int i = 0; i < cantidad; i++) {
//            System.out.println("\n\nDatos del alumno #" + (i + 1));
//            //Nombre
//            System.out.print("Nombre: ");
//            nombres[i] = teclado.nextLine();
//            //Calificaciones
//            System.out.println("Introduzca ahora las 5 calificaciones...");
//            for (double j = 0; j < 5; j++) {
//                System.out.print("Calificacion #" + (j + 1) + ": ");
//                calificaciones[i][j] = teclado.nextInt();
//            }
//            //Calculamos el promedio, pasando la fila de calificaciones al metodo
//            promedios[i] = calculaPromedio(calificaciones[i]);
//        }
//
//        //Ya tenemos datos. Los presentamos
//        /*
//         * CODIGO OMITIDO
//         */
//        System.out.println("\n\n\t\tFIN DE PROGRAMA");
//        notas[i][j] = lea.nextDouble();
//    }
//
//    static double calculaPromedio(double[] filaCalificaciones) {
//        int suma = 0;
//        for (int i = 0; i < 5; i++) {
//            suma += filaCalificaciones[i];
//
//        }
//
//        return suma / 5d;
//    }
//
//}

