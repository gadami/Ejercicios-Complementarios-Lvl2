import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Lvl2Ejercicio6
 */
class Empleados{
    private String nombreApellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

 Empleados(String nombreApellido, int dni, int horasTrabajadas, int valorPorHora){
     this.nombreApellido= nombreApellido;
     this.dni=dni;
     this.horasTrabajadas= horasTrabajadas;
     this.valorPorHora=valorPorHora;
    
 }
 public String getNombreApellido(){
     return nombreApellido;
 }
 public int getdni(){
    return dni;
 }
public int getHorasTrabajadas(){
    return horasTrabajadas;
}
public int getValorPorHora(){
    return valorPorHora;
}
 public int getSueldo(){
     return horasTrabajadas*valorPorHora;

 }
}
public class Lvl2Ejercicio6 {

    public static void main(String[] args) {
    Set<Empleados> empleado = new HashSet<>();
    Empleados empleado1= new Empleados("Gabriel David", 24980510, 16, 350);
    empleado.add(empleado1);
    Empleados empleado2= new Empleados("jose Asturias", 32650020, 15, 350);
    empleado.add(empleado2);
    Empleados empleado3= new Empleados("Gimena Caprito", 41620310, 12, 350);
    empleado.add(empleado3);

    System.out.println("Lista de Empleados:");

   for (Empleados empleados : empleado) {
       System.out.println("Apellido y nombre: "+empleados.getNombreApellido()+" DNI. "+empleados.getdni()+" Hrs Trab:"
       +empleados.getHorasTrabajadas()+" Valor xHora:"+empleados.getValorPorHora());
   }
   System.out.println("=========Listados por DNIS Y SUELDOS============");

   //Map<Integer, Integer> dniSueldo = new HashMap<>();
   //dniSueldo.put(empleado1.getdni(),empleado1.getSueldo());
   for (Empleados empleados : empleado) {
       System.out.println("DNI: "+empleados.getdni()+" sueldo:$"+empleados.getSueldo());
   }//ACLARACION: CREO QUE DE ESTA FORMA SE RESOLVIO LO QUE PEDIA EL EJERCICIO(mostrar ciertos datos), ME PARECIO LA SOLUCION MAS RAPIDA!
    }
    
}
