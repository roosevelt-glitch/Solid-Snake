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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        StringBuilder sb= new StringBuilder();
        int[] contadores = {33,45,65,32,41,38,11};
        Arrays.sort(contadores);
        for (int contador : contadores) {
            sb.append(contador).append(" ");
        }
        System.out.println(sb);
    }
    
}
