/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.megaferia.Editorial;

/**
 *
 * @author jregalado
 */
public class Gerente extends Persona{
    private Editorial editorial;

    public Gerente(Editorial editorial, String nombre, int cedula) {
        super(nombre, cedula);
        this.editorial = editorial;
    }
    
}
