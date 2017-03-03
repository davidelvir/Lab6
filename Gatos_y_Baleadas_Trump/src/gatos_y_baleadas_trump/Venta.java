/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatos_y_baleadas_trump;

import java.util.Date;

/**
 *
 * @author David
 */
public class Venta {
    private String cliente;
    private String empleado;
    private int num_articulos;
    private int total;
    private Date fecha;

    public Venta() {
    }

    public Venta(String cliente, String empleado, int num_articulos, int total, Date fecha) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.num_articulos = num_articulos;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getNum_articulos() {
        return num_articulos;
    }

    public void setNum_articulos(int num_articulos) {
        this.num_articulos = num_articulos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
