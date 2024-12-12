/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.chimboanaluisa.compras;

import ec.edu.espoch.chimboanaluisa.Clientes;
import ec.edu.espoch.chimboanaluisa.Libros;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Compras {

    private Clientes clientes;
    private Libros[] libros;

    public Compras(Clientes clientes, Libros[]libros) {
        this.clientes = clientes;
        this.libros = libros;
    }

    public void mostrarResumen() {
        System.out.println("Cliente: " + clientes.getNombre() + " (ID: " + clientes.getId() + ")");
        double total = 0;
        for (Libros libro : libros) {
            libro.mostrarDetalles();
            total += libro.calcularPrecioConIVA();
        }
        System.out.println("Total a pagar (con IVA): $" + total);
    }
}

    

  

