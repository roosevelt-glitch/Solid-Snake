package LABsem6Ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejecucion3 {
public static void main(String[] args) {
        Animal animales = new Perro();
        Animal anim = new Gato();
        Animal ani = new Vaca();
        ArrayList<Animal>lista = new ArrayList<>();
        lista.add(animales);
        lista.add(anim);
        lista.add(ani);
        Iterator<Animal> iterador= lista.iterator();
        while(iterador.hasNext()){
            Animal est = iterador.next();
            System.out.println(est.hacerSonido());
        }
}
}



