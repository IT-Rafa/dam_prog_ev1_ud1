package es.itrafa.b6.prog_ev2_u1_b6_e4;
import java.util.Scanner;
/*
    Ejercicio U1_B6_E4:
    Repite Ejercicio U1_B6_E1 con el operador condicional

    Ejercicio U1_B6_E1
        public static void main(String[] args){
            System.out.print("Introduce nº para comprobar si es par: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if(n % 2 == 0){
                System.out.println(n + " es par");
            }else{
                System.out.println(n + " no es par");
            }
        }
 */
public class App {
    public static void main(String[] args){
        System.out.print("Introduce nº para comprobar si es par: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println((n % 2 == 0)?(n + " es par"):(n + " no es par"));
    }
}
