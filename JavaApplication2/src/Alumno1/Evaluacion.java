/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno1;

/**
 *
 * @author alexm
 */
public class Evaluacion {
public static boolean isNum(String cadena){
    try{
        int numero=Integer.parseInt(cadena);
        return true;
    }catch(NumberFormatException error){
        System.out.println(error);
        return false;
    }
}    
}
