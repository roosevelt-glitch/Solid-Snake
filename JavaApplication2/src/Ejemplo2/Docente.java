/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

/**
 *
 * @author alexm
 */
public class Docente {
        private String codigo; // Código único para cada docente
    private String nombre;
    private String categoria;
    private String estudiosPostgrado;
    private int horasClase;
    private static final double DESCUENTO_SALUD = 0.03; // 3% de descuento por salud

    // Variable estática para generar códigos
    private static int contadorCodigo = 1;

    // Constructor
    public Docente(String nombre, String categoria, String estudiosPostgrado, int horasClase) {
        this.codigo = String.format("DOC%03d", contadorCodigo++); // Generar código único
        this.nombre = nombre;
        this.categoria = categoria;
        this.estudiosPostgrado = estudiosPostgrado;
        this.horasClase = horasClase;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEstudiosPostgrado() {
        return estudiosPostgrado;
    }

    public int getHorasClase() {
        return horasClase;
    }

    // Métodos para cálculos (sin cambios)
    public double calcularPagoPorHora() {
        switch (categoria) {
            case "Principal":
                return 25.00;
            case "Asociado":
                return 18.00;
            case "Auxiliar":
                return 15.00;
            default:
                return 0.0;
        }
    }

    public double calcularBonificacion() {
        switch (categoria) {
            case "Principal":
                return estudiosPostgrado.equals("Doctorado") ? 0.20 : 0.17;
            case "Asociado":
                return estudiosPostgrado.equals("Doctorado") ? 0.15 : 0.10;
            case "Auxiliar":
                return estudiosPostgrado.equals("Doctorado") ? 0.12 : 0.08;
            default:
                return 0.0;
        }
    }

    public double calcularPagoParcial() {
        return horasClase * calcularPagoPorHora();
    }

    public double calcularSueldoFinal() {
        double pagoParcial = calcularPagoParcial();
        double bonificacion = pagoParcial * calcularBonificacion();
        double descuento = pagoParcial * DESCUENTO_SALUD;
        return pagoParcial + bonificacion - descuento;
    }
    
}
