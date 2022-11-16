package es.itrafa.b3.prog_ev2_u1_b3_e2;
/*
    EJERCICIO U1_B3_E2.
    En el jshell crea una variable int i y luego asígnale el valor 08.
    Razona el error.
        jshell> int i
        i ==> 0
        jshell> i=0123
        i ==> 83

        jshell> i=08
          Error:
          ';' expected
          i=08
            ^
 */
/*
    SOLUCIÓN: 08 implica nº en base 8 y el dígito 8 no es posible
 */

public class e2 {
    public static void main(String[] args) {
        // int i = 08; // no octal
        int i = 07; // si octal
    }
}
