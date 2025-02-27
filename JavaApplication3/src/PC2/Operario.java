package PC2;

import java.text.DecimalFormat;

public class Operario extends Personal{
    private String categoria;
    private String estudios;
     private int contador;

    public Operario(String categoria, String estudios, String nombres, String apellidos, double unidadesProducidas, String afiliacion) {
        super(nombres, apellidos, unidadesProducidas, afiliacion);
        this.categoria = categoria;
        this.estudios = estudios;
    }
    
        public double ingresos(){
      if(categoria.equalsIgnoreCase("Senior")) {return sueldobase=2000;}
      else return 2600;
  }
        public double bonificaciones(){
      if(estudios.equalsIgnoreCase("Basico")) {return sueldobase*0.19;}
      else return sueldobase*0.21;
}
    @Override
         public double descuentos(){
      if(afiliacion.equalsIgnoreCase("SNP")) {return sueldobase*0.8;}
      else return 0;}
          
         public String generarCodigo(){
        this.contador=1;
        String codigo = String.format("OPE%05d", contador);
        contador++;
        return codigo;
    }
         public double sueldo(){
        return ingresos()+bonificaciones()-descuentos();
    }
    @Override
       public String mostrarInfo(){
            DecimalFormat df=new DecimalFormat("###0.00");
        return "\nCodigo\t\t: "+generarCodigo()+"\nNombres \t\t: "+nombres+" "+"\nApellidos \t\t: "+apellidos
                + "\nAfiliacion\t\t: "+afiliacion+ "\nEstudios\t\t: "+estudios+"\nSueldo Bruto\t\t: "+ingresos()+"\nBonificaciones\t\t: "+bonificaciones()+"\nSueldo Neto\t\t: "+sueldo()+"\n";
    }
}