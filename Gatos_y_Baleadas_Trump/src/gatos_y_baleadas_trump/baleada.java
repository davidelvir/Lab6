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
public class baleada extends Articulo{
    
    private ArrayList<String>ingredientes = new ArrayList();

    public baleada() {
        super();
    }

    public baleada(int precio) {
        super(precio);
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
