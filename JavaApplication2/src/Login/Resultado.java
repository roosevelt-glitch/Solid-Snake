/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Login;

/**
 *
 * @author alexm
 */
public class Resultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingresar login = new Ingresar();
        login.ingresarUsuario();
        login.ingresarContraseña();
        login.validarDatos();  
    }
}
