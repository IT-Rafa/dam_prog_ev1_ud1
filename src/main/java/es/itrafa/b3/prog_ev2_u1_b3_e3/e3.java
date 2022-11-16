package es.itrafa.b3.prog_ev2_u1_b3_e3;

/*
    EJERCICIO U1_B3_E3.
    Utiliza calculadora para observar el valor de 17 en
    decimal/octal/hexadecimal/binario

 */
/*
    SOLUTION: Seleccionar calculadora Windows, elegir en menú izquierdo el Modo Programador.
        Seleccionar en modo decimal y poner 17
        Resultado:
            HEX     11
            DEC     17
            OCT     21
            BIN     0001 0001
 */
public class e3 {
    public static void main(String[] args) {
        int num = 17;

        System.out.println("Decimal = " + num);
        System.out.println("Binario = " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal = " + Integer.toHexString(num));
    }

}