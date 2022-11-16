package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e11;

/*
    EJERCICIO 11.
    Utilizando operaciones de nivel de bit imprime las potencias de 2 en decimal y
    en binario con un aspecto similar al siguiente:

    1 en binario    1
    2 en binario    10
    4 en binario    100
    8 en binario    1000
    16 en binario   10000
    32 en binario   100000
    64 en binario   1000000
    etc.
 */
public class App {
    public static void main(String[] arg) {
        int max = 64;
        int x = 1;
        while (x <= max) {
            System.out.println(x + " en binario\t" + Integer.toBinaryString(x));
            x <<= 1;
        }
        System.out.println("etc.");
    }
}
