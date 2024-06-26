/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import core.person.Autor;
import core.megaferia.Editorial;
import java.util.ArrayList;

/**
 *
 * @author jregalado
 */
public class LibroDigital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(boolean hasHipervinculo, ArrayList<String> hipervinculos, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }

    
    
    
}
