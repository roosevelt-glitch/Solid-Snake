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
public class Ingresar {
        private String usuario;
    private String contraseña;
    private final String USUARIO_VALIDO = "admin";
    private final String CONTRASEÑA_VALIDA ="123";
        public void ingresarUsuario(){
        usuario=JOptionPane.showInputDialog("Ingrese su Usuario:\n");
        if (usuario == null || usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuario no puede estar vacio");
        } 
    }
    public void ingresarContraseña(){
        contraseña=JOptionPane.showInputDialog("Ingrese su Contraseña:\n");
         if (contraseña == null || contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "Contraseña no puede estar vacio");
        } 
}
    public void validarDatos(){
        if (USUARIO_VALIDO.equals(usuario) && CONTRASEÑA_VALIDA.equals(contraseña)){
            JOptionPane.showMessageDialog(null, "Datos validos. Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña incorrectos");
        }
    } 
}
