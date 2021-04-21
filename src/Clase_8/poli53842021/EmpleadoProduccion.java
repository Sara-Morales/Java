/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poli53842021;

import Clase_8.Alimentos.Asalariado;

/**
 *
 * @author Diego Ramirez
 */
public class EmpleadoProduccion extends Asalariado{
  private String turno;
  public EmpleadoProduccion(String turnoP){
  this.turno=turnoP;
  }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


}
