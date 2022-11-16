package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e10;

/*
    EJERCICIO 10.
    El siguiente ejemplo imprime una tabla de verdad del operador &&. Observa que se ha utilizado
    el carácter tabulador para practicar el concepto de secuencia de escape aunque podríamos
    conseguir el columnado simplemente usando espacios en blanco. Se pide, hacer un código
    similar, pero para el operador ||(or lógico).
        class Unidad1{
            public static void main(String args[]){
                System.out.println("falso \t&&\tfalso \t=\t" +(false&&false) );
                System.out.println("falso \t&&\tverdadero\t=\t" +(false&&true) );
                System.out.println("verdadero\t&&\tfalso \t=\t" +(true&&false) );
                System.out.println("verdadero\t&&\tverdadero\t=\t" +(true&&true) );
            }
        }

    Debes reparar en que en este código “falso” y “verdadero” son Strings, en cambio,
    false y true son literales booleanos.
 */
public class Unidad1 {
    public static void main(String args[]) {
        System.out.println("falso    \t||\tfalso    \t=\t" + (false || false));
        System.out.println("falso    \t||\tverdadero\t=\t" + (false || true));
        System.out.println("verdadero\t||\tfalso    \t=\t" + (true || false));
        System.out.println("verdadero\t||\tverdadero\t=\t" + (true || true));
    }
}
