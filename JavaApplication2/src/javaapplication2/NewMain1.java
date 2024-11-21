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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            StringBuilder sb= new StringBuilder();
        char[] frase = {'y','o',' ','a','m','o',};
        Arrays.sort(frase);
        for (char letra : frase) {
            sb.append(letra).append(" ");
        }
        System.out.println(sb);
    }
}
