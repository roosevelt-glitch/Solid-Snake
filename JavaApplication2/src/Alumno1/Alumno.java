/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno1;

import javax.swing.JOptionPane;

/**
 *
 * @author alexm
 */
public class Alumno {
    private String nombre;
    private String apellido, edad,dni;
    private String cadena;
    public void mostrarMenu(){
    int opcion =1;
    do {
        cadena=JOptionPane.showInputDialog(null,""
        +"1. Registrar Alumno\n"
        +"2. Mostrar Alumno\n"
        +"3. RegistarEspecialidad\n"
        +"4. Salir\n");
        if (cadena!=null && Evaluacion.isNum(cadena)){ //esto es para que detecte cuando ingresamos los numeros con el teclado
            opcion=Integer.parseInt(cadena);
            switch(opcion){
                case 1: 
                    RegistrarAlumno();
                    break;
                 case 2:
                     MostrarAlumno();
                     break;
                 case 3:
                     RegistrarEspecialidad();
                     break;
                 case 4:
                     JOptionPane.showMessageDialog(null, "Gracias por su atencion");
                     break;
                 default:
                     JOptionPane.showMessageDialog(null,"Opcion no disponible, vuelva a digitar");      
            }
        }
    }while(opcion!=4);
    }
    public void RegistrarAlumno(){
        nombre=JOptionPane.showInputDialog("ingrese nombre:\n");
        apellido=JOptionPane.showInputDialog("ingrese Apellido:\n");
        dni=JOptionPane.showInputDialog("ingrese DNI:\n");
        edad=JOptionPane.showInputDialog("ingrese edad:\n");
    }
    public void MostrarAlumno(){
        JOptionPane.showMessageDialog(null, "su nombre del alumo\n "+nombre);
        JOptionPane.showMessageDialog(null, "su apellido es\n "+apellido);
        JOptionPane.showMessageDialog(null, "su edad es \n "+edad);
        JOptionPane.showMessageDialog(null, "su dni es\n "+dni);
    }
    public void RegistrarEspecialidad(){
        String[] Programas ={
            "Ingenieria de sistemas","Tecno,Sistemas de Sistemas","Ingenieria en Mecatronica",
            "Ingenieria de Telecomunicaciones",
            "Tecno.Telecomunicaciones"
        };
        String resp =(String) JOptionPane.showInputDialog(null,
                "Seleccione un programa a cursar","Programa",JOptionPane.DEFAULT_OPTION,
                null, Programas,Programas[0]);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
