package es.itrafa.b6.prog_ev2_u1_b6_e6;
/*
    Ejercicio U1_B6_E6:
    Repite Ejercicio U1_B6_E3 con el operador condicional

    Ejercicio U1_B6_E3
        public static void main(String[] args){
            int x = 11;
            int y = 0;
            System.out.println("x = " + x + "; y = " + y );
            if(x*x > 100){
                System.out.println(x + " al cuadrado("+ x*x + ") es mayor que 100; y = " + ++y);
            }
        }
 */
public class App {
    public static void main(String[] args){
        int x = 11;
        int y = 0;
        System.out.println("x = " + x + "; y = " + y );
        System.out.println((x*x > 100)?(x + " al cuadrado("+ x*x + ") es mayor que 100; y = " + ++y):"");
    }
}
