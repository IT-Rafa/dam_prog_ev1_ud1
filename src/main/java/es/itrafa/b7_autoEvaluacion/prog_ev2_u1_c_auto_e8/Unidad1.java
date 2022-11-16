package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e8;
/*
    EJERCICIO8.
    Utilizando los operadores de asignación combinados += -= /= *= escribe un código equivalente
    al siguiente:
    class Unidad1{
        public static void main(String args[]){
            int a=10;
            System.out.println(a);
            a=a/2;
            System.out.println(a);
            a=a+3;
            System.out.println(a);
            a=a*2;
            System.out.println(a);
            a=a-2;
            System.out.println(a);
        }
    }
 */
public class Unidad1{
    public static void main(String args[]){
        int a=10;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a+=3;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a-=2;
        System.out.println(a);
    }
}
