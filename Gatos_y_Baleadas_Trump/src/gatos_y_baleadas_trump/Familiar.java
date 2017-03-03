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
public class Familiar extends Persona{
    private Familiar padre;
    private ArrayList<Familiar>hijos = new ArrayList();

    public Familiar() {
        super();
        
    }

    public Familiar(Familiar padre, int edad, int id, String nacionalidad, String lugar, String nombre, String piel) {
        super(edad, id, nacionalidad, lugar, nombre, piel);
        this.padre = padre;
    }

    public Familiar getPadre() {
        return padre;
    }

    public void setPadre(Familiar padre) {
        this.padre = padre;
    }

    public ArrayList<Familiar> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Familiar> hijos) {
        this.hijos = hijos;
    }
    
    
    
}
