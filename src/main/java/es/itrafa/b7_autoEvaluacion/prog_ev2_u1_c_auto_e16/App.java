package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e16;

import java.util.Scanner;

/*
    Ejercicio 16:
    JOAQUIN alumno 16/17
    Nota del profesor:
    no le hizo enunciado. Lo hizo con propósito de trabajar a nivel de bits, pero no lo hace
    (no usa operadores de bit).
    Pero resulta interesante observar cómo razona los complemento a1 y a2 con aritmética entera.
    El enunciado podría ser “dado un número positivo de tipo byte calcula con aritmética decimal
    su ca1 y su ca2 e imprímelos”
    Ejemplo de salida
    El número 12 se escribe en binario de esta manera: 1100
    El número 12 se escribe en complemento a1 de esta manera: 11111111111111111111111111110011
    El número 12 se escribe en complemento a2 de esta manera: 11111111111111111111111111110100
 */
public class App {
    public static void main(String[] args) {
        System.out.print("Introduce nº entero: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String st = "";
        for (int i = 0; i < 32; i++) {
            st += "0";
        }

        System.out.println(String.format(
                "El número %d se escribe en binario de esta manera:        %32s",
                n, (st + Integer.toBinaryString(n)).
                        substring(Integer.toBinaryString(n).length())));
        System.out.println(String.format(
                "El número %d se escribe en complemento a1 de esta manera: %32s",
                n, (st + Integer.toBinaryString(~n)).
                        substring(Integer.toBinaryString(~n).length())));
        System.out.println(String.format(
                "El número %d se escribe en complemento a2 de esta manera: %32s",
                n, (st + Integer.toBinaryString((~n)+1)).
                        substring(Integer.toBinaryString((~n)+1).length())));
    }
}
