package LABsem6Ejercicio2;

public class Coche extends Motor{
    protected String marca;
    public Coche(String marca, String tipo, int potencia) {
        super(tipo, potencia);
        this.marca = marca;
    }
    @Override
    public String mostrarDetalles(){
        return"\nMarca \t\t: " + marca + " "  + "\n";
    } 
}





