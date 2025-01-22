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
public class Proveedor {
    private final String nombre;
    private final String correo;
    private final List<Producto> productos;
    private final List<String> boletaAcciones; // Para registrar las acciones del proveedor

    public Proveedor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productos = new ArrayList<>();
        this.boletaAcciones = new ArrayList<>();
    }

    // Método para modificar el precio de un producto
    public void modificarPrecioProducto(Producto producto, double nuevoPrecio) {
        producto.setPrecio(nuevoPrecio);
        boletaAcciones.add("Precio modificado: " + producto.getNombreProducto() + " | Nuevo Precio: " + nuevoPrecio);
    }

    // Método para imprimir la boleta de acciones del proveedor
    public void imprimirBoleta() {
        StringBuilder boleta = new StringBuilder("----- BOLETA DE ACCIONES DEL PROVEEDOR -----\n");
        boleta.append("Proveedor: ").append(nombre).append("\n");
        boleta.append("Correo: ").append(correo).append("\n");
        boleta.append("====================================\n");
        if (boletaAcciones.isEmpty()) {
            boleta.append("No se realizaron modificaciones en el inventario.");
        } else {
            for (String accion : boletaAcciones) {
                boleta.append(accion).append("\n");
            }
        }
        boleta.append("====================================\n");
        System.out.println(boleta.toString());
        JOptionPane.showMessageDialog(null, boleta.toString());
    }

    // Getter para los productos del proveedor
    public Producto[] getProductos() {
        return productos.toArray(new Producto[0]);
    }
    
    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    // Método para agregar un producto (solo cuando se cree un proveedor)
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
}
