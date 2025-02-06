/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase02;

/**
 *
 * @author alexm
 */
public class Empleado {
     protected String dni;
    protected String apellidos;
    protected String nombres;
    
    public Empleado(){
    }

    public Empleado(String dni, String apellidos, String nombres) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }
    
    public String mostrarInfo(){
        return "\nNombres \t\t: "+nombres+" "+"\nApellidos \t\t: "+apellidos
                + "\nD.N.I. \t\t: "+dni+"\n";
    }
}

