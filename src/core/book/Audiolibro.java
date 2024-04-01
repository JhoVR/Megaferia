/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import core.person.Autor;
import core.megaferia.Editorial;
import core.person.Narrador;
import java.util.ArrayList;

/**
 *
 * @author jregalado
 */
public class Audiolibro extends Libro{
    private int duracion;
    private Narrador narrador;

    public Audiolibro(int duracion, Narrador narrador, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
    }
    
    
}
