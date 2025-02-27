package PC2;

import java.text.DecimalFormat;

public class Trabajador extends Personal{
    private String TipoContrato;
    private String categoria;
   
    private int contador;

    public Trabajador(String TipoContrato, String categoria, String nombres, String apellidos, double unidadesProducidas, String afiliacion) {
        super(nombres, apellidos, unidadesProducidas, afiliacion);
        this.TipoContrato = TipoContrato;
        this.categoria = categoria;
       
    }
     public String generarCodigo(){
        this.contador=1;
        String codigo = String.format("TRAB%05d", contador);
        contador++;
        return codigo;
    }
      public double ingresos(){
      if(TipoContrato.equalsIgnoreCase("Contratado")&& categoria.equalsIgnoreCase("A")) {return sueldobase=2320;}
      else if(TipoContrato.equalsIgnoreCase("Estable")&& categoria.equalsIgnoreCase("B")) {return sueldobase=3920;}
      else if(TipoContrato.equalsIgnoreCase("Contratado")&& categoria.equalsIgnoreCase("B")) {return sueldobase=3300;}
      else return 4450;
  }
     
    public double bonificaciones(){
        if (unidadesProducidas<=180){
            return ingresos()*0.04;
                    }else 
                return ingresos()*0.08;
        }
     
       public double sueldo(){
        return ingresos()+bonificaciones()-descuentos();
    }
    @Override
       public String mostrarInfo(){
            DecimalFormat df=new DecimalFormat("###0.00");
        return "\nCodigo\t\t: "+generarCodigo()+"\nNombres \t\t: "+nombres+" "+"\nApellidos \t\t: "+apellidos
                + "\nAfiliacion\t\t: "+afiliacion+"\nSueldo Bruto\t\t: "+ingresos()+"\nBonificaciones\t\t: "+bonificaciones()+"\nSueldo Neto\t\t: "+sueldo()+"\n";
    }
    
}
