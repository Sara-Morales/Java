
package Ejercicio_Dianostico;

import java.util.Scanner;


public class CalificacionesAlumnos {
    static String[] nombres;
	static int[][] calificaciones;
	static double[] promedios;
 
	public static void main(String[] args) {
                Scanner lea = new Scanner(System.in);
		System.out.print("¿Cuantas alumnos introducirá?: ");
		int cantidad = Integer.parseInt(lea.nextLine());
 
		//Inicializamos arrays
		nombres = new String[cantidad];
		calificaciones = new int[cantidad][5]; //Son 5 materias, asi que serán 5 calificaciones por alumno 
		promedios = new double[cantidad];
 
		//Empezamos a pedir datos
		for (int i = 0; i < cantidad; i++)
		{
			System.out.println("\n\nDatos del alumno #" + (i+1));
			//Nombre
			System.out.print("Nombre: ");
			nombres[i] = lea.nextLine();
			//Calificaciones
			System.out.println("Introduzca ahora las 5 calificaciones...");
			for (int j = 0; j < 5; j++)
			{
				System.out.print("Calificacion #" + (j+1) + ": ");
				calificaciones[i][j] = Integer.parseInt(lea.nextLine());
			}
			//Calculamos el promedio, pasando la fila de calificaciones al metodo
			promedios[i] = calculaPromedio(calificaciones[i]);
		}
 
		//Ya tenemos datos. Los presentamos
		/*
         * CODIGO OMITIDO
         */
 
		System.out.println("\n\n\t\tFIN DE PROGRAMA");
 
	}
 
	static double calculaPromedio(int[] filaCalificaciones)
	{
		int suma = 0;
		for (int i = 0; i < 5; i++)
			suma += filaCalificaciones[i];
 
		return suma / 5d;
	}
 
}

