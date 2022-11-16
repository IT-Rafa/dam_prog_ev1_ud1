package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e15;
/*
    Ejercicio 15:
        RUTH alumno del 16/17
        Empleando operadores, a nivel de bits, se pide que conviertas un
        número entero positivo a su correspondiente negativo.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.print("Introduce nº entero: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String st = "";
        for(int i = 0; i<32; i++){
            st += "0";
        }

        System.out.println("El número es el:   " + n);
        System.out.println(String.format("En binario es el:  %32s", (st +
                Integer.toBinaryString(n)).substring(Integer.toBinaryString(n).length())));
        int neg = ~n + 1;
        System.out.println("El negativo es el: " + neg);
        System.out.println(String.format("En binario es el:  %32s", (st +
                Integer.toBinaryString(neg)).substring(Integer.toBinaryString(neg).length())));
    }
}
