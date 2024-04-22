/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.arrayx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lab-IoT
 */
public class ArrayExample {

    static List<Persona> personas = new ArrayList<>

    {
    }

    ;
    
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setDni("76543245");
        p.setNombre("David");
        p.setEdad(37);
        personas.add(p);
        p = new Persona();
        p.setDni("3456789");
        p.setNombre("Raul");
        p.setEdad(40);
        personas.add(p);

        System.out.println("DNI\t\tNombre\t\tEdad");
        for (Persona px : personas) {
            System.out.println(px.getDni() + "\t" + getNombre() + "\t" + px.getEdad())
        }
    }
}
