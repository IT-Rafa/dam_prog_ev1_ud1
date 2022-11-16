package es.itrafa.b5.prog_ev2_u1_b5_e6;

/*
    Ejercicio U1_B5_E6
    prueba las siguientes expresiones true&&true, true&&false, false&&true Y false&&false,
    de forma que nuestro programa sea capaz de imprimir la tabla del AND con un aspecto similar
    al siguiente:
    C:\Users\Pilt>java Unidad1
    TABLA Operador AND

    x     y     resultado
    ---------------------
    true  true  true
    true  false false
    false true  false
    false false false
 */
/*
    SOLUTION:

 */
public class Unidad1 {
    public static void main(String[] args) {
        System.out.println("TABLA Operador AND\n");
        System.out.println("x     y     resultado");
        System.out.println("---------------------");
        System.out.println("true  true  " + (true && true));
        System.out.println("true  false " + (true && false));
        System.out.println("false true  " + (false && true));
        System.out.println("false false " + (false && false));
    }
}
