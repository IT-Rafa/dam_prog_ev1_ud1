package es.itrafa.b3.prog_ev2_u1_b3_e4;
/*
    EJERCICIO U1_B3_E4.
    Explica porqué el siguiente código da error de compilación
    class App{
        public static void main(String[] args) {
            int miVar=2147483648;
        }
    }
 */
/*
    SOLUTION: el número supera el valor máximo de Int
 */
public class e4 {
     public static void main(String[] args) {
        System.out.println("Integer max = " + Integer.MAX_VALUE);
         System.out.println("2147483648");

     }
}
