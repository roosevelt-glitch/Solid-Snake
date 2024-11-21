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
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char[] letras = { 'z','a','s'};
     char[] letras2= { 'z', 'r','s'};
     boolean iguales = Arrays.equals(letras, letras2);
        System.out.println(iguales ? "son iguales" : "son diferentes");
    }
    
}
