package LABsem6;

public class Coche extends Vehiculo{
      protected int puertas;

    public Coche(String marca,int año,int puertas) {
        super(marca, año);
        this.puertas = puertas;
    }
    
    @Override
     public String mostrarDetalles(){
        return "\nMarca \t\t: " + marca + " " + "\nAño \t\t: " + año + "\nPuertas \t\t: " + puertas + "\n";
    }
}




