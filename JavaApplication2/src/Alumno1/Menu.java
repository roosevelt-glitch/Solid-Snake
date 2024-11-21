/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Alumno1;

/**
 *
 * @author alexm
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno=new Alumno();
        alumno.mostrarMenu();
        alumno.RegistrarAlumno();
        alumno.MostrarAlumno();
        alumno.RegistrarEspecialidad();
        // alumno1.salir();
    }
    
}
