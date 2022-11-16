package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e4;

/*
    EJERCICIO4.
    Tengo una variable x inicializada. El resto del código comprueba si x es par en cuyo caso la
    incrementa en 1 e imprime su nuevo valor, y en caso contrario imprime “sin cambios”.
    Es obligatorio escribir el programa con el operador condicional.
 */
public class App {
    public static void main(String[] args) {
        int num = 4;
        System.out.println((num % 2 == 0) ? ++num : "sin cambios");
    }

}
