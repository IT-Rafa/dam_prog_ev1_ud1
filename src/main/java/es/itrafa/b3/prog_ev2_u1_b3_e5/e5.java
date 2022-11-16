package es.itrafa.b3.prog_ev2_u1_b3_e5;
/*
    EJERCICIO U1_B3_E5.
    Explica por qué la primera declaración de variable no da error de compilación y la segunda sí
    class App{
        public static void main(String[] args) {
            int miInt=128;
            byte miByte=128;
        }
    }
 */
/*
    SOLUTION: El valor 128 es superior al máximo de INT, que es 127
 */
public class e5 {
    public static void main(String[] args){
        int miInt=128;
        System.out.println("byte max = " + Byte.MAX_VALUE);
        // byte miByte=128; El valor es superior a byte == 127
    }
}
