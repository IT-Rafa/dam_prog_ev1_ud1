package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e14;

/*
    Ejercicio 14:
    GONZALO GOMEZ RIAL alumno del 16/17
    Recientes estudios (inventados personalmente por mí) han descubierto una forma de fabricar
    hilos de tela de araña, un material más resistente que el acero.
    Dichos hilos tienen la capacidad de soportar grandes cantidades de peso, un hilo de 0,5 cm
    es capaz de soportar alrededor de 1200 kg.
    (nota: la capacidad de soportar el peso es directamente proporcional al grosor,
    1 cm =2400 kg).
    Además, para fabricar un hilo de 0,001 cm necesitamos la increíble cantidad de 15.000
    arañas de jardín.
    El circo Luna al enterarse de eso ha decidido hacer un pedido de este fabuloso hilo para asi
    poder hacer una representación de la famosa canción infantil de los elefantes balanceándose en
    la tela de una araña. Teniendo en cuenta que el circo cuenta con 15 elefantes de 5300 kg de
    media en su poder, ¿Cuál será el grosor del hilo y cuantas arañas necesitaremos para fabricar
    dicho hilo?
 */
public class e14 {
    public static void main(String[] args) {
        // Un hilo de 0,5 cm es capaz de soportar alrededor de 1200 kg.
        // 0,001 cm necesitamos la increíble cantidad de 15.000 arañas de jardín.
        // 15 elefantes de 5300

        // Grosor hilo para 15 * 5300 y arañas usadas para cada hilo
        int pesoElef = 5300;
        int totElefs = 15;
        int pesoTotElefs = pesoElef * totElefs;
        int kgPorCm = 1200 * 2;
        double hiloAra = 0.001;
        int arañasPorHilo = 15000;

        double hilosPorTotElef = (double)pesoTotElefs / kgPorCm;

        System.out.println("Grosor hilo para " + totElefs + " elefantes a " + pesoElef + " kg" +
        " ("+ pesoTotElefs + " kg) son " + hilosPorTotElef + " cm");
        System.out.println("Precisamos " + hilosPorTotElef / hiloAra *  arañasPorHilo + " arañas para crear los hilos");
    }
}
