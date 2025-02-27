package LABsem6;

public class Vehiculo {
     protected String marca;
    protected int año;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }
    
    public String mostrarDetalles(){
        return "\nMarca \t\t: " + marca + " " + "\nAño \t\t: " + año + "\n";
    }  
}
