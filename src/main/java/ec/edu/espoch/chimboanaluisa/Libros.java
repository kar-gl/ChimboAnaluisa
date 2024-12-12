/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.chimboanaluisa;

import ec.edu.espoch.chimboanaluisa.libro.Genero;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Libros {
    private String titulo;
    private String autor;
    private double precio;
    private Genero genero;
    
    public Libros(String titulo,String autor,double precio,Genero genero){
    this.titulo= titulo;
    this.autor=autor;
    this.precio=precio;
    this.genero=genero;
    }
    public double calcularIVA() {
        return precio * 0.12; 
    }
 public double calcularPrecioConIVA() {
        return precio + calcularIVA(); 
    }
   
 public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("Precio sin IVA: $" + precio);
        System.out.println("Precio con IVA: $" + calcularPrecioConIVA());
    }
}

    
