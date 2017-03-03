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
public class Persona {
    private int edad;
    private int id;
    private String nacionalidad;
    private String lugar;
    private String nombre;
    private String piel;
    private ArrayList<Familiar>arbol = new ArrayList();

    public Persona() {
    }

    public Persona(int edad, int id, String nacionalidad, String lugar, String nombre, String piel) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar = lugar;
        this.nombre = nombre;
        this.piel = piel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    

    public ArrayList<Familiar> getArbol() {
        return arbol;
    }

    public void setArbol(ArrayList<Familiar> arbol) {
        this.arbol = arbol;
    }
    
    
    
}
