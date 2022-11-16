package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e5;
/*
    EJERCICIO 5.
    El siguiente programa presenta errores de compilación. Corrígelo utilizando el operador de cast
    class Unidad1{
        public static void main(String args[]){
            int i;
            float f;
            char c;
            i=65.3;
            f=65.3;
            c=65.3;
            System.out.println(i+" "+f+" "+c+" "+(int)c);
        }
    }
 */
public class Unidad1{
    public static void main(String args[]){
        int i;
        float f;
        char c;
        i=(int)65.3;
        f=(float)65.3;
        c=(char)65.3;
        System.out.println(i+" "+f+" "+c+" "+(int)c);
    }
}