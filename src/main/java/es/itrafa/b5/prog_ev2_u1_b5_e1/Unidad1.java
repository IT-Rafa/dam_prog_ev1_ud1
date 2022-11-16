package es.itrafa.b5.prog_ev2_u1_b5_e1;

/*
 * Ejercicio U1_B5_E1
 * Calcula la IMC de una persona cuyo peso y altura los tenemos almacenados en sus respectivas
 * variables. La fórmula que calcula el IMC es:
 *  IMC = peso(kg) / (altura^2)(m)
 * El programa imprime el IMC del peso y altura almacenados según la tabla de valores ICM.
 * Un ejemplo de salida:
 *       L:\Programacion>java Unidad1
 *       peso: 71.5
 *       altura: 1.67
 *       IMC: 25.637348
 *
 *      TABLA IMC
 *      Delgado: <18.5
 *      Normal: entre 18.5 y 24.9
 *      Sobrepeso: entre 25 y 29.9
 *      Obeso: 30 o más
 */
public class Unidad1 {
    public static void main(String[] args){
        float peso = 71.5f;
        float altura = 1.67f;

        System.out.println("peso: " + peso);
        System.out.println("altura: " + altura);
        System.out.println("IMC: " + peso / (altura * altura));
        System.out.println("\n\nTABLA IMC");
        System.out.println("Delgado: <18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
    }
}
