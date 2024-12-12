/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.chimboanaluisa;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Clientes {
private String nombre;
private String id;

public Clientes(String nombre, String id){
this.nombre=nombre;
this.id=id;

}
    public String getNombre(){
        return nombre;
    }

    public String getId() {
        return id;
    }
}

