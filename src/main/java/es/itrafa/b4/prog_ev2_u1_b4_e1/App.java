package es.itrafa.b4.prog_ev2_u1_b4_e1;
/*
    Ejercicio U1_B4_E1:
    Escribe un programa que compruebe en la tabla anterior la fila de la
    tabla anterior referente a char
                Boolean byte short char int long float double
        char    no      cast cast       si  si   si    si
    Por ejemplo para el caracter ‘a’:
    No se puede hacer cast a boolean
    Downcasting a byte 97
    Downcasting a short 97
    Downcasting a int 97
    Downcasting a long 97
    Downcasting a float 97.0
    Downcasting a double 97.0
 */
/*
    SOLUTION: No lo pillo muy bien, pero intentaremos convertir el caracter 'a' a cada tipo
 */
public class App{
    public static void main(String[] args){
        char theChar ='a';

        //  boolean bl=(boolean) c; no convert char to boolean
        byte b = (byte) theChar;
        short s=(short)theChar;
        int i=(int)theChar;
        long l=(long)theChar;
        float f = (float) theChar;
        double d = (double) theChar;

        System.out.println("           Boolean byte short char int long float double");
        System.out.println("char 'a':  NO      " +
                b + "   " +
                s + "    " +
                theChar + "    " +
                i + "  " +
                l + "   " +
                f + "  " +
                d);

    }
}