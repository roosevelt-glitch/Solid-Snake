
package Caso1;


public class Asistente {
    protected String nombre;
    protected String apellido;
    protected String especialidad;
    protected String afiliacion;

    public Asistente() {
    }

    public Asistente( String nombre, String apellido, String especialidad, String afiliacion) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.afiliacion = afiliacion;
    }
    public String mostrarDatos(){
        return """
               
               Codigo\t\t: 
               Nombres \t\t: """+nombre+" "+"\nApellidos \t\t: "+apellido
                + "\nEspecialidad\t\t: "+especialidad+"\n";
    }
    
}



