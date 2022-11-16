package es.itrafa.b6.prog_ev2_u1_b6_e5;
/*
    Ejercicio U1_B6_E5:
    Repite Ejercicio U1_B6_E2 con el operador condicional

    Ejercicio U1_B6_E2
        public static void main(String[] args){
            int x = 6;
            int y = 10;

            if(y % x == 0){
                System.out.println(x + " es múltiplo de " + y);
            }else{
                System.out.println(x + " no es múltiplo de " + y);
            }
        }
 */
public class App {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println((y % x == 0)? (x + " es múltiplo de " + y): (x + " no es múltiplo de " + y));
    }
}
