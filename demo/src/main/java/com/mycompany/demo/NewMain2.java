/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demo;

import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresar puntuacion: ");
        p= lector.nextInt();
        int puntuacion = 12;
        switch (puntuacion){
            case 0,1,2,3,4:
                System.out.println("Descartado");
                break;
            case 5:
                System.out.println("en suspenso");
                break;
            case 6:
                System.out.println("aceptable");
                break;
            case 7,8:
                System.out.println("notable");
                break;
            case 9,10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("error");
                break;
        }
        
        
        }
        // TODO code application logic here
    }
    

