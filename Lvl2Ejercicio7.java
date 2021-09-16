
public class Lvl2Ejercicio7 {
    static String fizzBuzzFuncion(int n1, int n2){
        int x=2*n1%2;
        int y=3*n2%3;
        String msj="";
        if (x==0 && y==0) {
           msj=n1+","+"Fizz"+","+"Buzz"+","+n2; 
        } else {
            msj=n1+","+"Fizz"+","+"Buzz"+","+n2+"FizzBuzz"+((n1+n2)%(n1+n2));
        }
        return msj;
}
    public static void main(String[] args) {
     System.out.println(fizzBuzzFuncion(1,7));
    }
}
