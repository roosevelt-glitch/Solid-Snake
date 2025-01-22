/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de los actores
        Empleado empleado1 = new Empleado("Carlos López", "Gestor de Inventario", "carlos@bodega.com");
        Proveedor proveedor1 = new Proveedor("Proveedor ABC", "proveedor@abc.com");

        // Crear algunos productos iniciales
        Producto producto1 = new Producto(101, 25.50, 100, "Leche", "Leche entera 1L");
        Producto producto2 = new Producto(102, 15.75, 50, "Pan", "Pan de trigo");
        Producto producto3 = new Producto(103, 5.30, 200, "Galletas", "Galletas de chocolate");

        // Agregar productos al inventario (Proveedor)
        proveedor1.agregarProducto(producto1);
        proveedor1.agregarProducto(producto2);
        proveedor1.agregarProducto(producto3);

        // Simulación de inicio de sesión
        boolean sessionActive = false;
        Cliente clienteActual = null;
        Empleado empleadoActual = null;
        Proveedor proveedorActual = null;

        String[] options = {"Cliente", "Empleado", "Proveedor"};
        int tipoUsuario = JOptionPane.showOptionDialog(null, "Bienvenido a la bodega Purina \n¿Eres Cliente, Empleado o Proveedor?", "Selección de usuario",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (tipoUsuario == 0) {  // Cliente
            String[] opcionesCliente = {"Iniciar sesión", "Registrarse"};
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Cliente",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesCliente, opcionesCliente[0]);

        
            if (opcion == 0) {  // Iniciar sesión
                String correo = JOptionPane.showInputDialog("Ingrese su correo:");
                clienteActual = Registrar.buscarClientePorCorreo(correo);
                if (clienteActual != null) {
                    sessionActive = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
            } else if (opcion == 1) {  // Registrarse
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                String correo = JOptionPane.showInputDialog("Ingrese su correo:");
                String ruc = JOptionPane.showInputDialog("Ingrese su RUC:");
                clienteActual = Registrar.registrarCliente(nombre, correo, ruc);
                sessionActive = true;
            }
        } else if (tipoUsuario == 1) {  // Empleado
            String correo = JOptionPane.showInputDialog("Ingrese su correo de empleado:");
            if (correo.equals("carlos@bodega.com")) {  // Verificación simple del correo
                empleadoActual = empleado1;
                sessionActive = true;
                JOptionPane.showMessageDialog(null, "Sesión iniciada como empleado: " + empleadoActual.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            }
        } else if (tipoUsuario == 2) {  // Proveedor
            String correo = JOptionPane.showInputDialog("Ingrese su correo de proveedor:");
            if (correo.equals("proveedor@abc.com")) {  // Verificación simple del correo
                proveedorActual = proveedor1;
                sessionActive = true;
            } else {
                JOptionPane.showMessageDialog(null, "Proveedor no encontrado.");
            }
        }

        while (sessionActive) {
            String menu = "";
            if (tipoUsuario == 0) {  // Cliente
                menu = "1. Realizar compra\n2. Salir";
            } else if (tipoUsuario == 1) {  // Empleado
                menu = "1. Gestionar inventario\n2. Salir";
            } else if (tipoUsuario == 2) {  // Proveedor
                menu = "1. Modificar precio de productos\n2. Salir";
            }

            String opcionString = JOptionPane.showInputDialog("Seleccione una opción:\n" + menu);

            if (opcionString != null) {
                int opcion = Integer.parseInt(opcionString);

                switch (opcion) {
                    case 1:
                        if (tipoUsuario == 2) {  // Proveedor
                            // Modificar precio de productos
                            StringBuilder productosDisponibles = new StringBuilder("Seleccione un producto para modificar su precio:\n");
                            int index = 1;
                            for (Producto p : proveedor1.getProductos()) {
                                productosDisponibles.append(index).append(". ").append(p.getNombreProducto()).append(" - Precio: ").append(p.getPrecio()).append("\n");
                                index++;
                            }
                            String productoSeleccionadoString = JOptionPane.showInputDialog(productosDisponibles.toString());

                            int productoSeleccionado = Integer.parseInt(productoSeleccionadoString);
                            Producto productoModificar = proveedor1.getProductos()[productoSeleccionado - 1];

                            String nuevoPrecioString = JOptionPane.showInputDialog("Ingrese el nuevo precio para " + productoModificar.getNombreProducto() + ":");
                            double nuevoPrecio = Double.parseDouble(nuevoPrecioString);

                            proveedorActual.modificarPrecioProducto(productoModificar, nuevoPrecio);
                            proveedorActual.imprimirBoleta(); // Muestra la boleta después de la modificación
                        }
                        break;
                    case 2:
                        // Salir de la sesión
                        sessionActive = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            }
        }
    }
}
    
    

