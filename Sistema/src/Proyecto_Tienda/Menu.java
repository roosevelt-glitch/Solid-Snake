/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_Tienda;

import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingresar login = new Ingresar();
        login.ingresarUsuario();
        login.ingresarContraseña();
        login.validarDatos();  
        String capacidadStr = JOptionPane.showInputDialog("Ingrese la capacidad máxima del inventario:");
        int capacidad = Integer.parseInt(capacidadStr);

        Producto inventario = new Producto(capacidad);

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de opciones:\n" +
                    "1. Registrar producto\n" +
                    "2. Mostrar productos\n" +
                    "3. Eliminar producto\n" +
                    "4. Salir\n" +
                    "Ingrese una opción:");
            switch (opcion) {
                case "1":
                    inventario.registrarProducto();
                    break;
                case "2":
                    inventario.mostrarProductos();
                    break;
                case "3":
                    inventario.eliminarProducto();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
    }
    
    

