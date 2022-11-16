package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e21;
/*
    Ejercicio 21:
    Lorena 2017/18
    crea un programa sin usar el operador % para comprobar si un número es múltiplo de 11.
    Nota:
    Ten en cuenta que un número es múltiplo de once cuando la suma de los números que están en
    posición par son iguales a la suma de los que están en la posición impar.
    Ejemplos de salida:
        // para 2356
        no es divisible por 11
        // para 2156
        es divisible por 11
 */
public class App {
    public static void main(String[] args){
        int n = 215633;
        String nSt = Integer.toString(n);
        System.out.println("El número " + nSt);

        int sumaPar = 0;
        int sumaImpar = 0;
        for(int i = 0; i < nSt.length(); i+=2){
            sumaPar += nSt.charAt(i);
            if(i+1 != nSt.length()){
                sumaImpar += nSt.charAt(i+1);
            }
        }
        System.out.println(sumaImpar == sumaPar ? "es divisible por 11":"no es divisible por 11");
    }
}
