package es.itrafa.b3.prog_ev2_u1_b3_e11;
/*
    EJERCICIO U1_B3_E11.
    Escribe un programa que almacene en variables y luego imprima por pantalla,
    4 características de una persona: Su nombre completo, su sexo, su edad y su peso.
    Elige para cada variable el tipo de dato más económico en bits.
    Obtén una salida similar a la siguiente:
    D:\programacion> java App
    nombre: Juán López Salvado
    sexo: v
    edad: 49
    peso: 70.8
 */
public class App {
    public static void main(String[] args){
        String nombre = "Juán López Salvado";
        char sexo = 'v';
        short edad = 49;
        float peso = 70.8f;
        System.out.println(String.format("name: %s",nombre));
        System.out.println(String.format("sexo: %c",sexo));
        System.out.println(String.format("edad: %d",edad));
        System.out.println(String.format("peso: %1$.1f",peso));
    }
}
