/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author alexm
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] puntajes = {20,15,19,17};
        int total = 0;
        float promedio;
        
        for (int i = 0; i< puntajes.length; i++){
            total += puntajes[i];
        }
        
        promedio = (float) total / puntajes.length;
        System.out.printf("Total: %d\nPromedio: %f", total, promedio);
    }
    
}
