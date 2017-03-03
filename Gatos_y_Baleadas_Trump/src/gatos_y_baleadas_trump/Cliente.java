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
public class Cliente extends Persona{
    private int ticket;
    private int dinero;
    private ArrayList<Orden>ordenes = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int ticket, int dinero, int edad, int id, String nacionalidad, String lugar, String nombre, String piel) {
        super(edad, id, nacionalidad, lugar, nombre, piel);
        this.ticket = ticket;
        this.dinero = dinero;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }
    
}
