package LABsem6Ejercicio2;

public class Motor {
     protected String tipo;
    protected int potencia;
    
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    public String mostrarDetalles(){
        return "\nTipo \t\t: " + tipo + " " + "\nPotencia \t\t: " + potencia + "HP" + "\n";
    }
}



