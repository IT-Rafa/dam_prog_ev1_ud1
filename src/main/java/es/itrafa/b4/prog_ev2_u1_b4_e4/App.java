package es.itrafa.b4.prog_ev2_u1_b4_e4;
/*
    Ejercicio U1_B4_E4:
    Haz un programa que produzca una tabla con  valores int de
    127 a 130 convertidos a byte. Razona el resultado.
    La salida será similar a…
    int 127 se pasa a byte y es 127
    int 128 se pasa a byte y es -128
    int 129 se pasa a byte y es -127
    int 130 se pasa a byte y es -126
 */
/*
    SOLUTION: Máximo valor de byte es 127, con lo cual sale ok. El resto se le suma 1, y
        se mueven todos los dígitos a la izquierda, de manera que un 1 pasa a ser el primer
        dígito, y al estar en complemento a 2, se convierte en negativo, con el valor del
        dígito menor de byte:
         122 = 0111 1111; +1 = 1000 0000
         123 = 1000 0000
 */
public class App {
    public static void main(String [] Args){
        int i = 127;
        System.out.println("max byte= " + Byte.MAX_VALUE);
        System.out.println("int " + i + " se pasa a byte y es " + (byte)i);
        System.out.println("int " + ++i + " se pasa a byte y es " + (byte)i);
        System.out.println("int " + ++i + " se pasa a byte y es " + (byte)i);
        System.out.println("int " + ++i + " se pasa a byte y es " + (byte)i);

    }
}
