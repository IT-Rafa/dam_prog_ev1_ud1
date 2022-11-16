package es.itrafa.b5.prog_ev2_u1_b5_e4;

/*
    Ejercicio U1_B5_E4
    Escribe código equivalente al siguiente sin utilizar el operador ++
    class App{
        public static void main(String[] args){
            int x=3;
            int y;
            y=++x*2;
            System.out.println("x: "+ x+ " y:"+y);
        }
    }
 */
public class App {
    public static void main(String[] args) {
        int x = 3 +1;
        int y;
        y = x * 2;
        System.out.println("x: " + x + "; y: " + y);
    }
}
