package es.itrafa.b6.prog_ev2_u1_b6_e7;
/*
    Ejercicio U1_B6_E7:
    Imprime la tabla del 4 haciendo los cálculos con un operador de desplazamiento,
    teniendo en cuenta que multiplicar por 4 es equivalente a desplazar a la izquierda dos
    posiciones. Ejemplo de salida
    truco: para hacer el cálculo con << piensa mejor en 1*4, 2*4, 3*4,4*4,etc.
 */
public class App {
    public static void main(String[] args){
        System.out.println("TABLA DEL 4");
        System.out.println("-----------");

        for(int i=1; i<=10; i++){
            System.out.println("  4 x " + i + " = "+ (i<<2));
        }
    }
}
