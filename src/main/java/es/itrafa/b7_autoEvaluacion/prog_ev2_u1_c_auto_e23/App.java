package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e23;

/*
    Ejercicio 23:
    Rubén López Mera 2018-2019
    Vamos a comprar una nueva televisión para poner en el salón. Sabemos que la televisión que
    cabe en el mueble es de máximo 92 cm, pero las medidas de las televisiones vienen en pulgadas.
    Hemos visto en una tienda en una televisión de 38 pulgadas, pero no sabemos si cabe el mueble.
    Se pide realizar un programa para convertir las pulgadas a centímetros y notificar si la televisión
    cabe en el mueble si la televisión cabra en el mueble. Nota: 1 pulgada = 2,54 cm.
 */
public class App {
    public static void main(String[] args) {
        double pulgada = 2.54;
        double espacioCm = 92;
        double telePulgadas = 38;
        double cmTv = telePulgadas * pulgada;

        System.out.print("La television mide " + cmTv + "cm, por lo tanto ");

        System.out.println(telePulgadas >= espacioCm ? "NO cabe en su mueble de " + espacioCm + "cm" :
                "SÍ cabe en su mueble de " + espacioCm + "cm");
    }
}