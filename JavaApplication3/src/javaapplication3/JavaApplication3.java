/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector=new Scanner (System.in);
        int cantidadAlumnos=1;
        int cantidadnotas=3;
        String[]nombres = new String[cantidadAlumnos];
        double[][] notas = new double[cantidadAlumnos][cantidadnotas];
        for (int i=0; i < cantidadAlumnos; i++) {
            System.out.printf("Ingrese su Nombre: ");
            nombres[i]= lector.nextLine();
            double suma=0;
            for ( int n=0; n< cantidadnotas;n++) {
            System.out.printf("Ingrese notas " + (n+1)+":");
            notas[i][n]= lector.nextDouble();
            suma += notas[i][n];
           }
            lector.nextLine();

            double promedio = suma / cantidadnotas;
            System.out.printf("El promedio de %s es:  %.2f\n",nombres[i], promedio);
            
            String estado = (promedio>=12 )? "Aprobado": "Desaprobado";
            System.out.printf("%-16s %s\n", nombres[i],estado);
            lector.nextLine();
             
        }
        
            
 }
        // TODO code application logic here
    }
    



