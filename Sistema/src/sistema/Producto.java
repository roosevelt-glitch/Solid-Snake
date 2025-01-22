/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author alexm
 */
public class Producto {
    private final int id;
    private double precio;
    private int cantidad;
    private final String nombreProducto;
    private final String descripcion;

    public Producto(int id, double precio, int cantidad, String nombreProducto, String descripcion) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    // Nuevo setter para el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
    

