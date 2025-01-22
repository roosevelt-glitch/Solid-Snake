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
public class Resolviendo_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] nombre ={"platano","mandarina","cafe","dulce","chocolate","atun","papaya","galleta","helado","mani",};
        double[] codigo ={123,456,789,963,852,741,159,357,785,125,965};
        double[] precio ={15,10,25,4,2,6,7,13,19,17};
        double[] cantidad= new double[10];
        StringBuilder reporte = new StringBuilder();
        reporte.append(String.format( "%-18s %-8s %-10s %-12s\n", "nombre","codigo","precio","cantidad"));
        reporte.append("-------------------------------------------------------\n");
       for (int i=0; i<cantidad.length;i++){
           System.out.println("Ingrese la cantidad de producto que desea comprar: ");
           cantidad[i]=lector.nextDouble();
           reporte.append(String.format( "%-18s %-8s %-10s %-12s\n", nombre[i],codigo[i],precio[i],cantidad[i]));
           lector.nextLine();
       }
       
        System.out.println(reporte.toString());
        

    }
    
}
