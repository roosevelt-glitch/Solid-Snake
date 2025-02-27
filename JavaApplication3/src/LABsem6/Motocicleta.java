package LABsem6;

public class Motocicleta extends Vehiculo{
     protected int cilindrada;

    public Motocicleta(String marca, int año,int cilindrada) {
        super(marca, año);
        this.cilindrada = cilindrada;
    }
    
    @Override
     public String mostrarDetalles(){
         super.mostrarDetalles();
        return "\nMarca \t\t: " + marca + " " + "\nAño \t\t: " + año + "\nCilindrada \t\t: " + cilindrada + "\n";
    }
}










