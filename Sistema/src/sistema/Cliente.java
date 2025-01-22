/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Cliente {
    private String nombre;
    private String correo;
    private String ruc;
    private final  List<Compra> compras;  // Lista para almacenar las compras

    public Cliente(String nombre, String correo, String ruc) {
        this.nombre = nombre;
        this.correo = correo;
        this.ruc = ruc;
        this.compras = new ArrayList<>();
    }

    // Método para realizar una compra
    public void realizarCompra(Producto producto, int cantidad) {
        Compra compra = new Compra(producto, cantidad);
        compras.add(compra);  // Guardar la compra en la lista de compras
    }
    

    // Mostrar boleta de compras
    public void imprimirBoleta() {
        double total = 0;
        StringBuilder boleta = new StringBuilder();

        // Titulo de la boleta
        boleta.append("**************************************************\n");
        boleta.append("               BODEGA PURINA\n");
        boleta.append("**************************************************\n");

        // Datos del cliente
        boleta.append("Cliente: ").append(nombre).append("\n");
        boleta.append("Correo: ").append(correo).append("\n");
        boleta.append("RUC: ").append(ruc).append("\n");

        // Fecha y hora de la compra
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        boleta.append("Fecha de compra: ").append(sdf.format(new Date())).append("\n");

        boleta.append("\n**************************************************\n");
        boleta.append("Producto\t\tCantidad\tPrecio Unit.\tSubtotal\n");
        boleta.append("**************************************************\n");

        // Detalle de los productos comprados
        for (Compra compra : compras) {
            double subtotal = compra.getProducto().getPrecio() * compra.getCantidad();
            boleta.append(compra.getProducto().getNombreProducto()).append("\t\t")
                   .append(compra.getCantidad()).append("\t\t")
                   .append(String.format("%.2f", compra.getProducto().getPrecio())).append("\t\t")
                   .append(String.format("%.2f", subtotal)).append("\n");
            total += subtotal;
        }

        boleta.append("**************************************************\n");
        boleta.append("Total: \t\t\t\t\t\t\t\t").append(String.format("%.2f", total)).append("\n");
        boleta.append("**************************************************\n");
        boleta.append("Gracias por su compra.\n");

        // Mostrar la boleta con todos los detalles
        JOptionPane.showMessageDialog(null, boleta.toString());
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    // Clase interna para representar una compra
    private class Compra {
        private final Producto producto;
        private final int cantidad;

        public Compra(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public Producto getProducto() {
            return producto;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}
    

