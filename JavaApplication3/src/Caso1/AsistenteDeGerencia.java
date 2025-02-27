package Caso1;

import java.text.DecimalFormat;

public class AsistenteDeGerencia extends Asistente{
    private String categoria;
    private int experiencia;
    private int movi;
    private double sueldobase;
    private int contador;
    
    public AsistenteDeGerencia(String categoria, String afiliacion, String nombre, String apellido, String especialidad) {
        super(nombre, apellido, especialidad, afiliacion);
        this.categoria = categoria;
        this.experiencia = experiencia;
        this.sueldobase = sueldobase; 
    }
    
    public double descuentos(){
    if (afiliacion.equalsIgnoreCase("AFP y Essalud")) return ingresos()*0.17+ingresos()*0.5;
    else return 0;
}
  public double ingresos(){
      if(especialidad.equalsIgnoreCase("Recursos Humanos")&& categoria.equalsIgnoreCase("A")) {return sueldobase=6000;}
      else if(especialidad.equalsIgnoreCase("Gestion de Archivos")&& categoria.equalsIgnoreCase("B")) {return sueldobase=7000;}
      else if(especialidad.equalsIgnoreCase("Recursos Humanos")&& categoria.equalsIgnoreCase("B")) {return sueldobase=5000;}
      else return 8000;
  }
    public double movilidad(){
        if (experiencia<8) return movi=700;
        else if (experiencia>=8) return movi=400;
        return 0;
    }
       public String generarCodigo(){
        this.contador=1;
             String codigo = String.format("AG%05d", contador);
        contador++;
        return codigo;
    }
    
    public double sueldo(){
        return ingresos()-descuentos()+movilidad();
    }
    @Override
      public String mostrarDatos(){
            DecimalFormat df = new DecimalFormat("###0.000");
        return """
               ASISTENTE DE GERENCIA: 
               
               Codigo\t\t: """+generarCodigo()+"\nNombres \t\t: "+nombre+" "+"\nApellidos \t\t: "+apellido
                + "\nEspecialidad\t\t: "+especialidad+"\nSueldo Base\t\t: "+ingresos()+ "\nDescuentos por Afiliacion\t\t: "+descuentos()+
                "\nMovilidad\t\t: "+movilidad()+"\nSueldo neto\t\t: "+sueldo()+"\n";
    }
}
