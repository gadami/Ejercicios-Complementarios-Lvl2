import java.util.ArrayList;
import java.util.List;

public class Lvl2Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Pedro");
        alumnos.add("Pablo");
        alumnos.add("Santiago");
        alumnos.add("Lucas");
        alumnos.add("Mateo");
        alumnos.add("Tadeo");
        alumnos.add("Isaias");
        alumnos.add("Felipe");
        alumnos.add("Bartolome");
        alumnos.add("juan");
        alumnos.add("Andres");
        alumnos.add("Simon");


        List<String> visualBasic = alumnos.subList(0, 4);
        List<String> java = alumnos.subList(4, 8);
        List<String> python = alumnos.subList(8, 12);

        System.out.println("Alumnos Curso Visual Basic 6:"+visualBasic);
        System.out.println("Alumnos Curso Java:"+java);
        System.out.println("Alumnos Curso Python:"+python);
    }
    
}
