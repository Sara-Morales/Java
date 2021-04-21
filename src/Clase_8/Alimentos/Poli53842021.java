/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_8.Alimentos;

/**
 *
 * @author Diego Ramirez
 */
public class Poli53842021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoProduccion empleadoProduccion=new EmpleadoProduccion("Noche");
        empleadoProduccion.setNombre("Diego");
        System.out.println(empleadoProduccion.getTurno()+" "+empleadoProduccion.getNombre());    
    }
    
}
