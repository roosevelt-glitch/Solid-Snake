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
public class NewMain8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = {{5,4,7},{1,3,8},{2,9,6}};
        int [] vector = new int [9];
        int indice =0;
        
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j< matriz.length;j++){
                vector[indice++]=matriz[i][j];
            }
        }
        Arrays.sort(vector);
        indice = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length;j++){
                matriz[i][j] = vector[indice++];
            }
        }
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println(matriz[i][j] + " ");
    }
            System.out.println();
}
    }
    }