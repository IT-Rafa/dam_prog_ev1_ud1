package es.itrafa.b6.prog_ev2_u1_b6_e8;
/*
    Ejercicio U1_B6_E8:
    A la operación “and” también se le llama multiplicación lógica. Observa la diferencia
    entre multiplicación lógica y aritmética
        class Unidad1{
            public static void main(String[] args){
                int x = 4;
                int y =5;
                System.out.println("x:"+ x +" y:"+ y);
                System.out.println("Multiplicación lógica: "+ (x&y));
                System.out.println("Multiplicación aritmética: "+ (x*y));
            }
        }
    Mejora la salida utilizando Integer.toBinaryString() para obtener algo parecido a lo
    siguiente
        E:\Programacion>java Unidad1
        x:4  y:5
        Multiplicación lógica: 100 and 101 = 100
        Multiplicación aritmética: 100 * 101 = 10100
 */
public class App{
    public static void main(String[] args){
        int x = 4;
        int y =5;
        System.out.println("x:"+ x +" y:"+ y);
        System.out.println("Multiplicación lógica: "+
                Integer.toBinaryString(x) + " and " + Integer.toBinaryString(y) +
                " = " + Integer.toBinaryString(x&y));
        System.out.println("Multiplicación aritmética: "+
                Integer.toBinaryString(x) + " * " + Integer.toBinaryString(y) +
                " = " + Integer.toBinaryString(x*y));
    }
}
