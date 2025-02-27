package PC2;

public class Personal {
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected double unidadesProducidas;
    protected String afiliacion;
    protected double sueldobase;

    public Personal() {
    }

    public Personal(String nombres, String apellidos, double unidadesProducidas, String afiliacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.unidadesProducidas = unidadesProducidas;
        this.afiliacion = afiliacion;
    }
    
      public double descuentos(){
      if(afiliacion.equalsIgnoreCase("AFP")) {return sueldobase*0.17;}
      else if(afiliacion.equalsIgnoreCase("SNP")) {return sueldobase*0.8;}
      else return sueldobase*0.5;}
      
   public String mostrarInfo(){
        return "\nCodigo\t\t: "+codigo+"\nNombres \t\t: "+nombres+" "+"\nApellidos \t\t: "+apellidos
                + "\nAfiliacion\t\t: "+afiliacion+"\n";
    }

}
