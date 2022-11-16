package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e7;
/*
    EJERCICIO7.
    Utilizando el operador de decremento -- , obtén código equivalente a:
    class Unidad1{
        public static void main(String args[]){
            int x=4;
            int y;
            x=x-1;
            y=x*2;
            System.out.println("x: "+ x+ " y:"+y);
        }
    }
 */
public class Unidad1{
    public static void main(String args[]){
        int x=4;
        int y;

        y=--x*2;
        System.out.println("x: "+ x+ " y:"+y);
    }
}
