/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto_Tienda;


import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Producto {
    private final String[][] productos;
    private int contadorId;
    private int indice;

    // Constructor
    public Producto(int capacidad) {
        productos = new String[capacidad][4]; // Arreglo bidimensional [capacidad][4]
        contadorId = 1; // Para asignar IDs únicos
        indice = 0; // Índice para el próximo registro
    }

    // Método para registrar un producto
    public void registrarProducto() {
        if (indice >= productos.length) {
            JOptionPane.showMessageDialog(null, "No se pueden registrar más productos. Capacidad completa.");
            return;
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String precio = JOptionPane.showInputDialog("Ingrese el precio del producto:");
        String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad del producto:");

        productos[indice][0] = String.valueOf(contadorId); // ID
        productos[indice][1] = nombre; // Nombre
        productos[indice][2] = precio; // Precio
        productos[indice][3] = cantidad; // Cantidad

        JOptionPane.showMessageDialog(null, "Producto registrado con éxito:\n" +
                mostrarProducto(productos[indice])); 
        contadorId++;
        indice++;
    }

    // Método para mostrar todos los productos
    public void mostrarProductos() {
        if (indice == 0) {
            JOptionPane.showMessageDialog(null, "No hay productos registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("Lista de productos:\nID | Nombre | Precio | Cantidad\n");
        for (int i = 0; i < indice; i++) {
            sb.append(mostrarProducto(productos[i])).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    // Método para buscar un producto por su ID
    public int buscarProducto(int id) {
        for (int i = 0; i < indice; i++) {
            if (Integer.parseInt(productos[i][0]) == id) {
                return i;
            }
        }
        return -1;
    }

    // Método para eliminar un producto por su ID
    public void eliminarProducto() {
        String idStr = JOptionPane.showInputDialog("Ingrese el ID del producto a eliminar:");
        int id = Integer.parseInt(idStr);

        int posicion = buscarProducto(id);
        if (posicion != -1) {
            // Desplazar los productos hacia atrás para mantener el arreglo compacto
            for (int i = posicion; i < indice - 1; i++) {
                productos[i] = productos[i + 1];
            }
            productos[indice - 1] = null; // Limpiar el último registro
            indice--;
            JOptionPane.showMessageDialog(null, "Producto con ID " + id + " eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un producto con ID " + id + ".");
        }
    }

    // Método auxiliar para mostrar un producto como cadena
    private String mostrarProducto(String[] producto) {
        return String.format("%-3s | %-10s | %-7s | %-8s", 
                producto[0], producto[1], producto[2], producto[3]);
    }
    
}
