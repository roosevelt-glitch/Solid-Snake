/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.logica;

/**
 *
 * @author alexm
 */
public class Alumno {
    //atributos o carateristicas de este alumno
    private int id;
    private String nombre;
    private String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    //creando medoto 1. modificador de acceso (public), 2. tipo de dato(void)
    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }
    
}
