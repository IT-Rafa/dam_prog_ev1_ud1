package es.itrafa.b6.prog_ev2_u1_b6_e9;

/*
    Ejercicio U1_B6_E9:
    poner un bit a 1 “encender un bit”
    numeroAModificarBit | máscara
    La máscara será un número cuyos bits son todos 0 excepto el de la posición que
    queremos colocar un 1 en el número a modificar
    Ejemplo:
    queremos “encender” en 10000001 el 6º bit a 1
    Lo de “6º bit” se refiere empezando por la derecha, también podíamos decir el bit 5 si
    pensamos que el primer bit por la derecha es el 0
    10000001 | 00100000 =10100001
 */
public class App {
    public static void main(String[] args) {
        int x = 0b10000001;
        int mask = 1 << 5;
        int x2 = x | mask;
        System.out.println(
                String.format("x:    %8s", ("00000000" +
                        Integer.toBinaryString(x)).substring(Integer.toBinaryString(x).length())));
        System.out.println(
                String.format("mask: %8s", ("00000000" +
                        Integer.toBinaryString(mask)).substring(Integer.toBinaryString(mask).length())));
        System.out.println(
                String.format("x2:   %8s", ("00000000" +
                        Integer.toBinaryString(x2)).substring(Integer.toBinaryString(x2).length())));
    }
}
