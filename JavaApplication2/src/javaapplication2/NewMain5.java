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
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StringBuilder sb= new StringBuilder();
       String[] nombres = {"jose","maria","luna","nataly"};
       Arrays.sort(nombres);
       for (String palabra:nombres) {
       sb.append(palabra).append(" ");
       }
       
        System.out.println(sb.toString());
       
        // TODO code application logic here
    }
    
}
