/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author alexm
 */
public class GestorProyecto {
    private static final int MAXIMO_PROYECTOS = 10;
    private static Proyecto[] proyectos = new Proyecto[MAXIMO_PROYECTOS];
    private static int numeroProyectos=0;
    
    void agregar(Proyecto nuevoProyecto){
        if (numeroProyectos < proyectos.length){
            proyectos[numeroProyectos++] = nuevoProyecto;
        }
    }
    void insertar(Proyecto nuevoProyecto,int posicion){
        if (posicion < numeroProyectos && numeroProyectos < proyectos.length){
            if (posicion == numeroProyectos -1) {
                proyectos[numeroProyectos++] = nuevoProyecto;
            } else {
                for (int i= numeroProyectos; i> posicion; i--){
                    proyectos[i] = proyectos[i-1];
                }
                proyectos[posicion] = nuevoProyecto;
                numeroProyectos++;
            }
        }
    }
    public static Proyecto buscar(int codigo){
        for (int i=0; i< numeroProyectos; i++){
            if (proyectos[i].getCodigo() == codigo)
                return proyectos[i];
        }
        return null;
    }
   public static Proyecto buscar(String nombre){
       for (int i=0; i< numeroProyectos; i++){
           if (proyectos[i].getNombre().equalsIgnoreCase(nombre)){
               return proyectos[i];
           }
       }
        return null;
   }
}
