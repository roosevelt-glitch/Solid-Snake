/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Arrays;

/**
 *
 * @author alexm
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]nombre={"juan","ana","rosa"};
        int[]edad={19,25,18};
        int[]grado={5,5,4};
        double[]pc1={20,20,18};
        double[]pc2={17,15,16};
        double[]pc3={17,18,10};
        double[]ef={18,19,20};
        StringBuilder reporte = new StringBuilder();
        reporte.append(String.format("%-15s %-8s %-10s %-12s %-14s %-16s %-18s\n", "nombre", "Edad", "grado", "PC1", "PC2", "PC3", "EF"));
        reporte.append("------------------------------------------------------------------\n");
        double [][] notasOriginales = {
            {20,20,18}, //PC1
            {17,15,16},//PC2
            {17,18,10},//PC3
            {18,18,20}//EF
        };
        double [][] notas =Arrays.copyOf(notasOriginales, notasOriginales.length);
        double sumaTotal=0;
        int totalNotas=0;
        for(int i=0;i<nombre.length;i++) {
            reporte.append(String.format("%-15s %-8d %-10d %-12.2f %-14.2f %-16.2f %-18.2f\n",nombre[i],edad[i],grado[i],pc1[i],pc2[i],pc3[i],ef[i]));
        }
        System.out.println(reporte.toString());
    }
}

    

