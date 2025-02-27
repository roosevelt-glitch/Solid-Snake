package Caso1;
import java.text.DecimalFormat;
public class AsistenteAdministrativa extends Asistente{
    protected String estudios;
    private double sueldobase;
    private int contador;

    public AsistenteAdministrativa(String estudios, String nombre, String apellido, String especialidad, String afiliacion) {
        super( nombre, apellido, especialidad, afiliacion);
        this.estudios = estudios;
        this.sueldobase = sueldobase;
    }
    public String generarCodigo(){
        this.contador=1;
             String codigo = String.format("AA%05d", contador);
        contador++;
        return codigo;
    }
    public double ingresos(){
        if(estudios.equalsIgnoreCase("Diplomado")) return sueldobase=4200;
        else return 3200;
    }
    public double bonificaciones(){
        if (especialidad.equalsIgnoreCase("Recursos Humanos")) return ingresos()*0.15;
        else return ingresos()*0.2;
    }
      public double descuentos(){
    if (afiliacion.equalsIgnoreCase("Essalud")) return ingresos()*0.5;
    return 0;
}
        public double sueldo(){
        return ingresos()+bonificaciones()-descuentos();
    }
    @Override
        public String mostrarDatos(){
            DecimalFormat df = new DecimalFormat("###0.000");
        return """
               ASISTENTE ADMINISTRATIVA: 
               
               Codigo\t\t: """ +generarCodigo()+"\nNombres \t\t: "+nombre+" "+"\nApellidos \t\t: "+apellido
                + "\nEspecialidad\t\t: "+especialidad+ "\nEstudios\t\t: "+estudios+"\nSueldo Base\t\t: "+ingresos()+"\nBonificaciones\t\t: "+
                bonificaciones()+ "\nDescuentos por Afiliacion\t\t: "+descuentos()+"\nSueldo neto\t\t: "+sueldo()+"\n";
    }
}

