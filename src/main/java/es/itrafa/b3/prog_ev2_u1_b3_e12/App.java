package es.itrafa.b3.prog_ev2_u1_b3_e12;
/*
    EJERCICIO U1_B3_E12.
    Indica que tipo de literal es cada uno de los siguientes
    178
    2L
    077L
    0xBAACL
    37.266D
    87.363F
    'c'
    '\t'
    true
    false
    '\u00E1'
    "hola"
 */
/*
    178     : int
    2L      : long
    077L    : long (octal)
    0xBAACL : long (hex)
    37.266D : double
    87.363F : float
    'c'     : char
    '\t'    : char
    true    : boolean
    false   : boolean
    '\u00E1': char
    "hola"  : String
 */
public class App {
    public static void main(String[] Args){
        System.out.println(String.format("%d", 178));
        System.out.println(String.format("%d", 2L));
        System.out.println(String.format("Octal:%o - Hex:%d", 077L, 077L));
        System.out.println(String.format("Hexadecimal:%x - Hex:%d", 0xBAACL, 0xBAACL));
        System.out.println(String.format("%f", 37.266D));
        System.out.println(String.format("%f", 87.363F));
        System.out.println(String.format("%c", 'c'));
        System.out.println(String.format("%c", '\t'));
        System.out.println(String.format("%b", true));
        System.out.println(String.format("%b", false));
        System.out.println(String.format("%c", '\u00E1'));
        System.out.println(String.format("%s", "hola"));

    }
}
