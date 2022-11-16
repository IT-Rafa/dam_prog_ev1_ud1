package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e19;

/*
    Ejercicio 19:
    Miguel 2015/16
    Tras una larga investigación, hemos concluido en que un pelin es igual a 2 gramos (hablando en
    unidades de peso). Genera una salida similar a la siguiente:

    En una cucharilla de azúcar hay 1.0 pelines
    En sal en el salero de mi casa 1000 g hay: 500 pelines
    En camión arena (1 tonelada): 500000 pelines
    peso en kg de chinos en int(1 chino 60 kg): -184378624
    peso en kg de chinos en long(1 chino 60 kg): 81420000000
    peso en gramos de chinos en long(1 chino 60 kg): 81420000000000
    peso en pelines de chinos en long(1 chino 60 kg): 40710000000000

 */
public class App {
    public static void main(String[] args) {
        byte pelin = 2;
        double azucarp = 2.0;
        int azucar = (int)azucarp / pelin;
        int salerop = 1000;
        int salero = salerop / pelin;
        int arenap = 1000000;
        int arena = arenap / pelin;
        int chinop = 60;
        int chinosEnChina = 1_357_000_000;

        System.out.println("En una cucharilla de azúcar hay " + azucar + " pelines");
        System.out.println("En sal en el salero de mi casa " + salerop + " g hay: " + salero + " pelines");
        System.out.println("En camión arena (1 tonelada): " + arena + " pelines");
        System.out.println("peso en kg de chinos en int(1 chino " + chinop + " kg): " + chinop * chinosEnChina);
        System.out.println("peso en kg de chinos en long(1 chino " + chinop + " kg): " + (long)chinop * chinosEnChina);
        System.out.println("peso en gramos de chinos en long(1 chino " + chinop + " kg): " + (long)chinop * chinosEnChina * 1000);
        System.out.println("peso en pelines de chinos en long(1 chino " + chinop + " kg): " + (long)chinop * chinosEnChina/pelin);
    }
}
