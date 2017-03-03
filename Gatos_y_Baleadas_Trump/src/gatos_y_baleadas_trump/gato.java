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
public class gato extends Articulo{
    private int peso;
    private int altura;

    public gato() {
        super();
    }

    public gato(int peso, int altura, int precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
