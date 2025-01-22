/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author alexm
 */
public class Empleado {
    private final String nombre;
    private final String cargo;
    private final String correo;
    private final List<String> boletaAcciones;  // Registro de las acciones realizadas

    public Empleado(String nombre, String cargo, String correo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.correo = correo;
        this.boletaAcciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCorreo() {
        return correo;
    }

    // Función para gestionar inventario
    public void gestionarInventario(Producto producto, String accion, int cantidad) {
        if (accion.equalsIgnoreCase("agregar")) {
            boletaAcciones.add("Producto agregado: " + producto.getNombreProducto() + " | Cantidad: " + cantidad);
            System.out.println("Producto agregado: " + producto.getNombreProducto() + " | Cantidad: " + cantidad);
            producto.setCantidad(producto.getCantidad() + cantidad); // Aumentamos la cantidad
        } else if (accion.equalsIgnoreCase("eliminar")) {
            if (producto.getCantidad() >= cantidad) {
                boletaAcciones.add("Producto eliminado: " + producto.getNombreProducto() + " | Cantidad: " + cantidad);
                System.out.println("Producto eliminado: " + producto.getNombreProducto() + " | Cantidad: " + cantidad);
                producto.setCantidad(producto.getCantidad() - cantidad); // Reducimos la cantidad
            } else {
                boletaAcciones.add("Intento de eliminar más cantidad de la disponible: " + producto.getNombreProducto());
                System.out.println("Intento de eliminar más cantidad de la disponible: " + producto.getNombreProducto());
            }
        } else if (accion.equalsIgnoreCase("modificar")) {
            boletaAcciones.add("Producto modificado: " + producto.getNombreProducto() + " | Nueva cantidad: " + cantidad);
            System.out.println("Producto modificado: " + producto.getNombreProducto() + " | Nueva cantidad: " + cantidad);
            producto.setCantidad(cantidad); // Modificamos la cantidad al nuevo valor
        }
    }

    // Método para imprimir la boleta con las acciones realizadas
    public void imprimirBoleta() {
        StringBuilder boleta = new StringBuilder("----- BOLETA DE ACCIONES DE INVENTARIO -----\n");
        boleta.append("Empleado: ").append(nombre).append("\n");
        boleta.append("Cargo: ").append(cargo).append("\n");
        boleta.append("Correo: ").append(correo).append("\n");
        boleta.append("====================================\n");
        if (boletaAcciones.isEmpty()) {
            boleta.append("No se realizaron modificaciones al inventario.");
        } else {
            for (String accion : boletaAcciones) {
                boleta.append(accion).append("\n");
            }
        }
        boleta.append("====================================\n");
        System.out.println(boleta.toString());  // También imprimimos en consola, pero puede ser reemplazado por un JOptionPane si prefieres.
        JOptionPane.showMessageDialog(null, boleta.toString());  // Mostramos la boleta en una ventana
    }
}
    

