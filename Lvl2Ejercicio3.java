import java.util.ArrayList;
import java.util.Collections;

public class Lvl2Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<>();

        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(8);
        cartas.add(9);
        cartas.add(10);
        cartas.add(11);
        cartas.add(12);
        cartas.add(13);
        cartas.add(14);
        System.out.println("=======Cartas Ascendentes========");
        Collections.sort(cartas);
        for (Integer cartaAsc : cartas) {
            
            System.out.print(cartaAsc+" ");
            
        }
        System.out.println("=======Cartas Descendentes========");
        Collections.reverse(cartas);
        for (Integer cartaDes : cartas) {
            
            System.out.print(cartaDes+" ");
            
        }
    }
}
