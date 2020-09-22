/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

public class Horario {
    private int codigoHorario;
    private String descripcion;
    private Boolean traslape;

    public Horario(int codigoHorario, String descripcion) {
        this.codigoHorario = codigoHorario;
        this.descripcion = descripcion;
        this.traslape = false;
    }

    public Horario() {
    }
    
    

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setTraslape( Boolean ptraslape) {
        this.traslape = ptraslape;
    }
    
    
}
