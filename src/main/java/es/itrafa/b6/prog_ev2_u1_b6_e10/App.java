package es.itrafa.b6.prog_ev2_u1_b6_e10;
/*
    Ejercicio U1_B6_E10:
    Colocar a 0 un bit “apagar un bit”.
    Por ejemplo vamos a poner a 0 el 3º bit de 01010[1]01
    01010101 & 11111011 == 01010001
    Fíjate que en el segundo operando ponemos todos a unos menos el 3º bit.
    Este segundo operando en java debemos escribirlo como literal 0B11111011
    o simplemente generándolo con ~(1<<2)
    Demuestra lo anterior en un ejemplo java
 */
public class App {
    public static void main(String[] args){
        int bin = 0b01010101;
        int zeroOff =~(1<<2); // todo 1 menos 3 y al contrario
        // Creamos bin para ajustar 32 ceros
        String st = "";
        for(int i = 0; i<32; i++){
            st += "0";
        }
        System.out.println(String.format("%32s\n%32s", (st +
                Integer.toBinaryString(bin)).substring(Integer.toBinaryString(bin).length()), "&"));

        System.out.println(String.format("%32s", (st +
                Integer.toBinaryString(zeroOff)).substring(Integer.toBinaryString(zeroOff).length())));

        System.out.println(String.format("=\n%32s", (st +
                Integer.toBinaryString(bin & zeroOff)).substring(Integer.toBinaryString(bin & zeroOff).length())));

    }
}
