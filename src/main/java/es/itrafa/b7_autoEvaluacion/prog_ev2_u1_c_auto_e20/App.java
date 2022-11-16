package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e20;

/*
    Ejercicio 20:
    Borja 2017/18
    Haz con el operador condicional una forma de comparar a la gente que esté aprobada y la gente
    que esté suspensa, y que además con el or les diga a la gente que tenga aprobado les mande un
    mensaje por su nota.

    C:\Users\A17BorjaMA\Downloads>java T1_20
    Aprobado con un 9
     Felicidades tienes un sobresaliente

    C:\Users\A17BorjaMA\Downloads>java T1_20
        Aprobado con un 6
     Felicidades tienes un bien esfuérzate un poco más

 */
public class App {
    public static void main(String[] args) {
        int nota = 7;

        String msg = (nota < 5) ? "Lo siento. Has suspendido con nota " + nota :
                (nota <= 6) ? "Felicidades tienes un suficiente con nota " + nota + ". Esfuérzate un poco más" :
                        (nota <= 7) ? "Felicidades tienes un bien con nota " + nota + ". Esfuérzate un poco más" :
                                (nota <= 8) ? "Felicidades tienes un notable con nota " + nota + ". Esfuérzate un poco más" :
                                        (nota <= 10) ? "Felicidades tienes un sobresaliente con nota " + nota :
                                                "nota " + nota + " mal puesta";

        System.out.println(msg);
    }
}
