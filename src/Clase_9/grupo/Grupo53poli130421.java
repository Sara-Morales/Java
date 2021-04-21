
package Clase_9.grupo;

import java.util.Scanner;


public class Grupo53poli130421 {

    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Scanner leer = new Scanner(System.in);
        Empleado[] empleado = new Empleado[10];

        //Estoy generando 10 empleados
        for (int i = 0; i <= 9; i++) {
            empleado[i] = new Empleado();
        }
        int contador = 0;

        boolean estado = true;
        while (estado) {
            int numeroEmpleados = 0;
            int contadorEmpleados = 0;
            System.out.println("Ingrese el cargo(Empleado o Gerente)");
            String cargo = leer.nextLine();//Ingresando el cargo

            if (cargo.equalsIgnoreCase("Gerente")) {

                System.out.println("nombre");
                gerente.nombre = leer.nextLine();
                System.out.println("apellido");
                gerente.apellido = leer.nextLine();
                System.out.println("cedula");
                gerente.cedula = leer.nextLine();
                System.out.println("cargo");
                gerente.cargo = leer.nextLine();
            } else if (cargo.equalsIgnoreCase("empleado")) {
                System.out.println("Ingrese el numero de empleados");
                numeroEmpleados = Integer.parseInt(leer.nextLine());
                contadorEmpleados = 0;
                while (contadorEmpleados < numeroEmpleados) {
                    System.out.println("cedula");
                    empleado[contadorEmpleados].cedula = leer.nextLine();
                    System.out.println("nombre");
                    empleado[contadorEmpleados].nombre = leer.nextLine();
                    System.out.println("apellido");
                    empleado[contadorEmpleados].apellido = leer.nextLine();
                    System.out.println("cargo");
                    empleado[contadorEmpleados].cargo = leer.nextLine();
                    System.out.println("galones");
                    empleado[contadorEmpleados].carro.galones = leer.nextLine();
                    System.out.println("placa");
                    empleado[contadorEmpleados].carro.placa = leer.nextLine();
                    System.out.println("el empleado se almacena exitosamente");
                    System.out.println(empleado[contador].cedula + ", " + empleado[contador].nombre + ", " + empleado[contador].cargo);
                    System.out.println(empleado[contador].carro.placa + ", " + empleado[contador].carro.placa);
                    contadorEmpleados++;
                }
                contador = contador + 1;
            }
            contador = 0;
            System.out.println("Los datos del gerente son");
            System.out.println("nombre :" + gerente.nombre);
            System.out.println("apellido :" + gerente.apellido);
            System.out.println("cedula :" + gerente.cedula);
            System.out.println("cargo :" + gerente.cargo);
            while (contador < numeroEmpleados) {
                System.out.println("Los datos del empleado son");
                System.out.println("nombre :" + empleado[contador].nombre);
                System.out.println("apellido :" + empleado[contador].apellido);
                System.out.println("cedula :" + empleado[contador].cedula);
                System.out.println("cargo :" + empleado[contador].cargo);
                contador++;
            }
            System.out.println("Ingrese s si desea salir del programa de lo contrario oprima otratecla");
            String continua = leer.nextLine();
            if (continua.equalsIgnoreCase("s")) {
                estado = false;
            }
        }
    }
}
