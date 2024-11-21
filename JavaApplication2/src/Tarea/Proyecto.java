/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author alexm
 */
public class Proyecto {
    private int codigo;
    private String nombre;
    private double presupuesto;
    private int numeroIntegrantes;

    public Proyecto(int codigo, String nombre, double presupuesto, int numeroIntegrantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }
    @Override
    public String toString(){
        return "Proyecto{" +
                "codigo=" + codigo +
                ", nombre=' " + nombre + '\''+
                ", presupuesto=" + presupuesto + 
                ", numeroInterrogantes=" + numeroIntegrantes +
                "}\n";
              
    }

}
