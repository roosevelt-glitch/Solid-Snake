package LABsem6Ejercicio2;


import java.util.ArrayList;
import java.util.Iterator;

public class Ejecucion2 {
    public static void main(String[] args) {
        Motor motor = new Motor("rotativo", 250);
        Coche coche = new Coche("Mazda RX7","rotativo",250);
        ArrayList<Motor>lista = new ArrayList<>();
        lista.add(coche);
        lista.add(motor);
        Iterator<Motor> iterador= lista.iterator();
        while(iterador.hasNext()){
            Motor est = iterador.next();
            System.out.println(est.mostrarDetalles());
        }
       
    }  
    }



    

