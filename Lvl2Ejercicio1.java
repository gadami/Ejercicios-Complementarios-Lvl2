import java.util.ArrayList;

public class Lvl2Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudad = new ArrayList<String>();

        ciudad.add("Bariloche");
        ciudad.add("Córdoba");
        ciudad.add("Resistencia");
        int cont=0;

        System.out.println("Ranking de ciudades favoritas:");
        for (String e : ciudad) {
           cont++;
           System.out.println("#"+cont+" "+e);
       }
    }
    }
    

