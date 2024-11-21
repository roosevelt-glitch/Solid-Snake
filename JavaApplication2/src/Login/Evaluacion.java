/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Evaluacion {
    public static boolean isNum(String cadena){
    try{
         int opcion=Integer.parseInt(cadena);
        return true;
    }catch(NumberFormatException error){
        JOptionPane.showMessageDialog(null, "ingrese un numero valido");
        return false;
    }
        
    }        
}

