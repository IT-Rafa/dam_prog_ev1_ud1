package es.itrafa.b4.prog_ev2_u1_b4_e2;
/*
    Ejercicio U1_B4_E2:
    imprimir los códigos enteros de los siguientes caracteres: A B C a b c 1 2 3 .
    Observa que los números asignados tienen cierta lógica entre sí.
    Por ejemplo, entre las letras mayúsculas los códigos se van asignando por orden
    alfabético, idem para las minúsculas y para los números se les van también
    asignando códigos con lógica (el código de ‘2’, es el siguiente al de ‘1’ etc.)

    Código entero del caracter 'A': 65
    Código entero del caracter 'B': 66
    Código entero del caracter 'C': 67
    Código entero del caracter 'a': 97
    Código entero del caracter 'b': 98
    Código entero del caracter 'c': 99
    Código entero del caracter '1': 49
    Código entero del caracter '2': 50
    Código entero del caracter '3': 51
    L:\Programación
 */
public class App {
    public static void main(String[] args){
        // A B C a b c 1 2 3
        System.out.println("Letra 'A': " + (int)'A');
        System.out.println("Letra 'B': " + (int)'B');
        System.out.println("Letra 'C': " + (int)'C');
        System.out.println("Letra 'a': " + (int)'a');
        System.out.println("Letra 'b': " + (int)'b');
        System.out.println("Letra 'c': " + (int)'c');
        System.out.println("Letra '1': " + (int)'1');
        System.out.println("Letra '2': " + (int)'2');
        System.out.println("Letra '3': " + (int)'3');



    }
}
