/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author alexm
 */
public class Alumno {
    private String foto;
    private String nombre;
    private int practica1, practica2, practica3,examenfinal;

    public Alumno(String foto, String nombre, int practica1, int practica2, int practica3, int examenfinal) {
        this.foto = foto;
        this.nombre = nombre;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.examenfinal = examenfinal;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPractica1() {
        return practica1;
    }

    public void setPractica1(int practica1) {
        this.practica1 = practica1;
    }

    public int getPractica2() {
        return practica2;
    }

    public void setPractica2(int practica2) {
        this.practica2 = practica2;
    }

    public int getPractica3() {
        return practica3;
    }

    public void setPractica3(int practica3) {
        this.practica3 = practica3;
    }

    public int getExamenfinal() {
        return examenfinal;
    }

    public void setExamenfinal(int examenfinal) {
        this.examenfinal = examenfinal;
    }
    
    
}
