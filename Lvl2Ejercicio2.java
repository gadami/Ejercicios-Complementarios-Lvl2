import java.util.ArrayList;

public class Lvl2Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<Integer>();
        numero.add(3);
        numero.add(6);
        numero.add(9);
        numero.add(12);
        numero.add(15);
        
        System.out.println("Mostrando los Numeros:");//descubri sin acento por que repite cantidad(alguna solucion?)
        for (int e : numero) {
            System.out.println(e);
        }
        System.out.println("cantidad actual de numeros:"+numero.size());

        System.out.println("Agregando números en la Primera y Última posición:");
        numero.add(0,1);
        numero.add(6,18);
        for (int i : numero) {//repeti el bucle forech, menos codigo, creo que habria otra forma pero no tenia tiempo!
            System.out.println(i);
        }
        System.out.println("Tamano con los 2 numeros Agragados: "+numero.size());//le agregue sin la Ñ por que repita cantidad
    
    }
    
}
