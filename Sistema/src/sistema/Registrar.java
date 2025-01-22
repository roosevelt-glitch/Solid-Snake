/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author alexm
 */
public class Registrar {
    // Método para registrar un nuevo cliente
    public static Cliente registrarCliente(String nombre, String correo, String ruc) {
        return new Cliente(nombre, correo, ruc);
    }

    // Método para buscar un cliente por correo
    public static Cliente buscarClientePorCorreo(String correo) {
        // Para la demostración, vamos a retornar un cliente simulado.
        // En un caso real, este método buscaría el cliente en una base de datos.
        if (correo.equals("cliente@bodega.com")) {
            return new Cliente("Juan Pérez", "cliente@bodega.com", "1234567890");
        }
        return null;
    }
}