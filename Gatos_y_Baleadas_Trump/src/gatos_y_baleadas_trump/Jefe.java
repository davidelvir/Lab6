/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatos_y_baleadas_trump;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Jefe extends Persona{
    
    private String trabajo;
    private ArrayList<Empleado>empleados = new ArrayList();
    private int clientes_atendidos;
    private double ganancias;

    public Jefe() {
    }

    public Jefe(String trabajo, int clientes_atendidos, double ganancias, int edad, int id, String nacionalidad, String lugar, String nombre, String piel) {
        super(edad, id, nacionalidad, lugar, nombre, piel);
        this.trabajo = trabajo;
        this.clientes_atendidos = clientes_atendidos;
        this.ganancias = ganancias;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }
    
    
    
}
