
package Clase02;

import java.text.DecimalFormat;


public class EmpleadoPermanente extends Empleado{
    double sueldobase;
    String afiliacion;

    public EmpleadoPermanente(String dni,String apellidos,String nombres,double sueldobase, String afiliacion) {
        super(dni, apellidos, nombres);
        this.sueldobase = sueldobase;
        this.afiliacion = afiliacion;
    }
public double ingresos(){return sueldobase;}

public double descuentos(){
    if (afiliacion.equalsIgnoreCase("AFP")) return sueldobase*0.15;
    else return sueldobase*0.11;
}

public double sueldo(){ return ingresos()-descuentos();}

    @Override
    public String mostrarInfo(){
    DecimalFormat df = new DecimalFormat("###0.000");
    return "EMPLEADO PERMANENTE: \n"+super.mostrarInfo()+
                "Ingresos\t\t: "+df.format(ingresos())+"\n"+
                "Descuentos\t\t: "+df.format(descuentos())+"\n"+
                "Sueldo Neto\t\t: "+df.format(sueldo())+"\n";
    }
}
