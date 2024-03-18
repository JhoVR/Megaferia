/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author jregalado
 */
public class Stand {
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, float precio) {
        this.id = id;
        this.precio = precio;
        editoriales = new ArrayList<Editorial>();
    }
    
    
}
