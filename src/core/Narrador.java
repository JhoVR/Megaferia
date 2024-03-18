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
public class Narrador extends Persona{
    private ArrayList<Libro> libros;

    public Narrador(ArrayList<Libro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = libros;
    }
    
    
}
