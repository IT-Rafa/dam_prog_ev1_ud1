package es.itrafa.b6.prog_ev2_u1_b6_e2;
/*
    Ejercicio U1_B6_E2:
    Tenemos almacenados dos números enteros almacenados en variables x e y. Queremos
    averiguar si x es múltiplo de y. De nuevo, ayúdate del operador módulo.
 */
public class App {
    public static void main(String[] args){
        int x = 6;
        int y = 10;

        if(y % x == 0){
            System.out.println(x + " es múltiplo de " + y);
        }else{
            System.out.println(x + " no es múltiplo de " + y);
        }
    }

}
