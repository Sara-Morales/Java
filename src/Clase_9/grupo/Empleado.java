
package Clase_9.grupo;


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
