package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e24;
/*
    Ejercicio 24: María Serafín 2018-2019
    Te has hecho rico minando bitcoins y le debes dinero a tu amigo. Estás dispuesto a devolvérselo
    siempre y cuando lo que te pida no supere los 127 €, que no te hiciste rico regalando dinero. Si
    no estás dispuesto a pagárselo dale la vuelta a la situación intentando que sea él quien te deba
    dinero a ti. (Utilizando la misma variable, tampoco hay que ser rastrero que es tu amigo y a este
    paso te van a quedar pocos.)
 */
public class App {
    public static void main(String[] args){
        int max = 127;
        int devolucion = 127;

        System.out.println("¿Puedes devolverme los "+ max +" ahora que te va bien? Ando un poco justo este mes");
                System.out.println(max>devolucion? "En realidad te debo "+ (byte)max+", así que eres tu quien me debe dinero a mí":
                        "¡Claro que sí amigo mío!");
    }
}
