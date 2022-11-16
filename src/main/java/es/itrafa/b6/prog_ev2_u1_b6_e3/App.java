package es.itrafa.b6.prog_ev2_u1_b6_e3;

/*
    Ejercicio U1_B6_E3:
    Si el valor de x al cuadrado es mayor que 100 aumenta el valor de la variable y en 1 y lo
    imprime, en caso contrario no se hace nada.
 */
public class App {
    public static void main(String[] args){
        int x = 11;
        int y = 0;
        System.out.println("x = " + x + "; y = " + y );
        if(x*x > 100){
            System.out.println(x + " al cuadrado("+ x*x + ") es mayor que 100; y = " + ++y);
        }
    }
}
