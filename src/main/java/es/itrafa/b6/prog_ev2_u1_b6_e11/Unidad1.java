package es.itrafa.b6.prog_ev2_u1_b6_e11;

/*
    Ejercicio U1_B6_E11:
    De  forma similar al ejemplo comprueba el funcionamiento de %=, >>=
    y |= produciendo la siguiente salida:
    E:\Programacion>java Unidad1
        Valor inicial de i: 10
        Valor de i tras i%=3: 1
        Valor de i tras i>>=1: 0
        Valor de i tras i|=1: 1
 */
public class Unidad1 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Valor inicial de i    : " + i);
        i %= 3;
        System.out.println("Valor de i tras i%=3  : " + i);
        i >>= 1;
        System.out.println("Valor de i tras i>>=1 : " + i);
        i |= 1;
        System.out.println("Valor de i tras i|=1  : " + i);
    }
}
