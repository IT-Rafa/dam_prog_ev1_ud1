package es.itrafa.b5.prog_ev2_u1_b5_e5;

/*
    Ejercicio U1_B5_E5
    Comprueba si ++x*y es equivalente o no a (++x)*y. Idem respecto a ++(x*y)
    Al probar estas situaciones debes también detectar un error de compilación en la última
    expresión
 */
/*
    SOLUTION:
    Las 2 primeras son iguales, ya que el paréntesis solo refuerza que ++ va antes de *, que ya es
        por defecto+
    La 3º no funciona por qué ++ espera el nombre de una variable y no un valor, que es en lo que se
        convierte (x*y) -> 1*2 = 2
 */
public class App {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("++x * y = " + (++x * y));
        x = 1;
        System.out.println("(++x) * y = " + ((++x) * y));
        x = 1;
       // System.out.println("++(x*y) = " + (++(x*y));
    }
}
