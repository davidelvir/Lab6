/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatos_y_baleadas_trump;

/**
 *
 * @author David
 */
public class Empleado extends Persona{
    
    private String trabajo;
    private int entrada;
    private int salida;
    private int sueldo;
    private String estado;

    public Empleado() {
        super();
    }

    public Empleado(String trabajo, int entrada, int salida, int sueldo, String estado, int edad, int id, String nacionalidad, String lugar, String nombre, String piel) {
        super(edad, id, nacionalidad, lugar, nombre, piel);
        this.trabajo = trabajo;
        this.entrada = entrada;
        this.salida = salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
