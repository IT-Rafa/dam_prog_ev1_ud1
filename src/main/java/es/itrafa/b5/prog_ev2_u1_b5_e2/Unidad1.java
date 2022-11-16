package es.itrafa.b5.prog_ev2_u1_b5_e2;
/*
    Ejercicio U1_B5_E2.
    Dados unos segundos iniciales (500000 en el ejemplo) los distribuimos
    en días, horas, minutos y segundos como en el ejemplo que sigue:
        C:\Users\niinjashyper\programacion>java Unidad1
        500000 segundos = 5 días, 18 horas, 53 minutos y 20 segundos
 */
public class Unidad1 {


    public static void main(String[] args){
        int segsMin = 60;
        int segsHora = 60 * segsMin;
        int segsDia = 24 * segsHora;

        int segsTotal = 500000;
        int dias = segsTotal / segsDia;

        int horasRest =  segsTotal % segsDia;
        int horas = horasRest / segsHora;

        int minutosRest = horasRest % segsHora;
        int minutos = minutosRest / segsMin;

        int segs = minutosRest % segsMin;

        System.out.println(segsTotal + " segundos = " +
                dias + " días, "+ horas + " horas, " + minutos + " minutos y "+ segs + " segundos");
    }
}
