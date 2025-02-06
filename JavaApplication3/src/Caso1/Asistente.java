/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author alexm
 */
public class Asistente { 
    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected String especialidad;
    protected String afiliacion;

    public Asistente() {
    }

    public Asistente(String codigo, String nombre, String apellido, String especialidad, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.afiliacion = afiliacion;
    }
    
  
    
    public String mostrarDatos(){
        return "\nCodigo\t\t: "+codigo+"\nNombres \t\t: "+nombre+" "+"\nApellidos \t\t: "+apellido
                + "\nEspecialidad\t\t: "+especialidad+"\n";
    }
    
}
