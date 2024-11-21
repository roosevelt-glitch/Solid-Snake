/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class NewMain4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner (System.in);
        String[]nombres = new String[2];
        double[] notas = new double[2];
        StringBuilder reporte = new StringBuilder();
        reporte.append(String.format("%-15s %-8s\n","nombres", "notas"));
        reporte.append("------------------------------\n");
        for (int i=0; i < nombres.length; i++) {
            System.out.printf("Ingrese Nombre de alumno "+(i+1)+":");
            nombres[i]= lector.nextLine();
            System.out.printf("Ingrese nota: ");
            notas[i]= lector.nextDouble();
            lector.nextLine();
    }
        for( int i=0; i<nombres.length;i++){
            reporte.append(String.format("%-15s %-8.1f [%s]\n", nombres[i], notas[i], notas[i]>=12 ? "Aprobado": "Desaprobado"));
        }
        System.out.println(reporte.toString());
    }  
}
