package es.itrafa.b5.prog_ev2_u1_b5_e3;

/*
    Ejercicio U1_B5_E3
    Escribe código equivalente al siguiente sin utilizar el operador
    unario ++, es decir incrementando de la forma x=x+1
    class App{
        public static void main(String[] args){
            int x=3;
            int y;
            y=x++*2;
            System.out.println("x: "+ x+ " y:"+y);
        }
    }
 */
public class App {
    public static void main(String[] args) {
        int x = 3;
        int y;
        y = x * 2;
        x = x + 1;
        System.out.println("x: " + x + "; y: " + y);
    }
}
