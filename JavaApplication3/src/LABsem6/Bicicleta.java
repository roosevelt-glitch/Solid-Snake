package LABsem6;

public class Bicicleta extends Vehiculo{
    protected boolean canasto;

    public Bicicleta(String marca, int año,boolean canasto) {
        super(marca, año);
        this.canasto = canasto;
    }
    
    @Override
     public String mostrarDetalles(){
         super.mostrarDetalles();
        return "\nMarca \t\t: " + marca + " " + "\nAño \t\t: " + año + "\nTiene Canasto \t\t: " + canasto + "\n";
    }
}













