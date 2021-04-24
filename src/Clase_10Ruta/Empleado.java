/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_10Ruta;

/**
 *
 * @author Diego Ramirez
 */
public class Empleado extends Persona {
    
    public double sueldo;
    public Ruta ruta = new Ruta();
    public Carro carro = new Carro();

    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo, Ruta ruta, Carro carro) {
        this.sueldo = sueldo;
        this.carro = carro;
        this.ruta = ruta;
    }

}
