/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2.logica;

/**
 *
 * @author alexm
 */
public class Supervisor extends Alumno{
    double sueldo;
    String telefono;

    public Supervisor(double sueldo, String telefono, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

  

    Supervisor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
}
