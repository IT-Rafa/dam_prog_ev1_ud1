package es.itrafa.b6.prog_ev2_u1_b6_e1;
import java.util.Scanner;
/*
    Ejercicio U1_B6_E1:
    Determinar si el valor de una variable x es par o impar. Nos ayudamos para averiguarlo
    del operador %. Un número es par si es divisible entre 2, es decir, si al dividirlo entre
    dos obtenemos de resto 0.
 */
public class App {
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
}
