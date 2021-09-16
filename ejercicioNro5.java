import java.util.ArrayList;

public class ejercicioNro5 {

    public static void main(String[] args) {
        ArrayList<Integer> horas_trabajadas = new ArrayList<>();
        ArrayList<Integer> valorPorHora = new ArrayList<>();
        
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);

        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        
        int totalFinal=(horas_trabajadas.get(0)*valorPorHora.get(0))+(horas_trabajadas.get(1)*valorPorHora.get(1))
        +(horas_trabajadas.get(2)*valorPorHora.get(2))+(horas_trabajadas.get(3)*valorPorHora.get(3))
        +(horas_trabajadas.get(4)*valorPorHora.get(4));

        System.out.println(horas_trabajadas.get(0)*valorPorHora.get(0)+","+horas_trabajadas.get(1)*valorPorHora.get(1)
        +","+horas_trabajadas.get(2)*valorPorHora.get(2)+","+horas_trabajadas.get(3)*valorPorHora.get(3)
        +","+horas_trabajadas.get(4)*valorPorHora.get(4));

        System.out.println("Total Final: $"+totalFinal);
       
    }
    
}
