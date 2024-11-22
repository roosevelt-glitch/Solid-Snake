/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica;

/**
 *
 * @author alexm
 */
public class PruebaAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("rock.png","rock",12,15,20,10);
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getPractica1());
        System.out.println(alumno1.getPractica2());
        System.out.println(alumno1.getPractica3());
        System.out.println(alumno1.getExamenfinal());
        StringBuilder reporte = new StringBuilder();
        reporte.append(String.format("%-15s %-8s %-10s %-12s %-14s","nombre","practica1","practica2","practica3","examenfinal"));
        
    }
    
}
