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
public class Orden {
    private int gatos;
    private int baleadas;

    public Orden() {
    }

    public Orden(int gatos, int baleadas) {
        this.gatos = gatos;
        this.baleadas = baleadas;
    }

    public int getGatos() {
        return gatos;
    }

    public void setGatos(int gatos) {
        this.gatos = gatos;
    }

    public int getBaleadas() {
        return baleadas;
    }

    public void setBaleadas(int baleadas) {
        this.baleadas = baleadas;
    }
    
    
}
