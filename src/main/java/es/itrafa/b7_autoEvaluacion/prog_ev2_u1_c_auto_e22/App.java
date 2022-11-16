package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e22;
/*
    Ejercicio 22:
    Juan Bodelo 2018-2019
    Debido a las numerosas situaciones de overbooking que se producen en vuelos de
    Londres a Mallorca, debido a la cantidad guiris que van a emborracharse allí como si
    no hubiera un mañana, la compañía Ryanair decide vender los billetes en la entrada al
    avión, como si fuera un autobús. Para asegurarse de que la venta de billetes no
    supere el aforo, nos encarga un programa que lo haga. El programa debe funcionar de
    la siguiente manera:
        • El avión tiene un aforo concreto. Si el número de guiris es menor al aforo, el
            programa imprime por pantalla un aviso de que caben más guiris.
        • En caso de que el número de guiris es igual al aforo, imprime por pantalla un
            aviso de que el aforo está completo.
        • En caso de que el número de guiris supera el aforo, imprime por pantalla un
            aviso de que hay que sacar guiris del avión.
    Utiliza el operador condicional para resolverlo.
 */
public class App {
    public static void main(String[] args){
        int aforo = 20;
        int enAvion = 21;
        String msg = (enAvion < aforo) ? "no completo":
                (enAvion == aforo) ? "aforo completado":
                        "aforo superado por " + (enAvion - aforo) + " persona(s)";
        System.out.println(msg);
    }
}
