package LABsem6;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejecucion {
    public static void main(String[] args) {
        Coche toyota =new Coche("Toyota",2013,4);
        Bicicleta mont = new Bicicleta("Montañera",2015,true);
        Motocicleta moto = new Motocicleta("BMW",2018,2600);
        ArrayList<Vehiculo>lista = new ArrayList<>();
        lista.add(toyota);
        lista.add(mont);
        lista.add(moto);
        Iterator<Vehiculo> iterador= lista.iterator();
        while(iterador.hasNext()){
            Vehiculo est = iterador.next();
            System.out.println(est.mostrarDetalles());
        }
        
    } 
    }
    

