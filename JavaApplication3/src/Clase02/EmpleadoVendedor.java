/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase02;

import java.text.DecimalFormat;

/**
 *
 * @author alexm
 */
public class EmpleadoVendedor extends Empleado{
    double montovendido;
    double tasacomision;

    

   public EmpleadoVendedor( String dni,String nombres,String apellidos,double montovendido, double tasacomision ) {
        super(dni, apellidos, nombres);
        this.montovendido = montovendido;
        this.tasacomision = tasacomision;
    }
    public double ingresos(){
        return montovendido*tasacomision;
    }
    public double bonificaciones(){
        if (montovendido<1000){
            return 0;
        }else if (montovendido<5000){
                return ingresos()*0.05;
                    }else 
                return ingresos()*0.10;
        }
    public double descuentos(){
        if (ingresos()<1000){
            return ingresos()*0.11;
        }else 
            return ingresos()*0.15;
    }
    public double sueldo(){
        return ingresos()+bonificaciones()-descuentos();
    }
    @Override
    public String mostrarInfo(){
        DecimalFormat df=new DecimalFormat("###0.00");
        return "EMPLEADO PERMANENTE: \n"+super.mostrarInfo()+
                "Ingresos\t\t: "+df.format(ingresos())+"\n"+
                "Bonificaciones\t\t: "+df.format(bonificaciones())+"\n"+
                "Descuentos\t\t: "+df.format(descuentos())+"\n"+
                "Sueldo Neto\t\t: "+df.format(sueldo())+"\n";
    }
}
