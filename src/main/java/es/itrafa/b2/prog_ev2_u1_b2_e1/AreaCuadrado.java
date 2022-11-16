package es.itrafa.b2.prog_ev2_u1_b2_e1;
/*
    Ejercicio U1_B2_E1:
    En una clase AreaCuadrado escribe un programa que guarde en una variable entera
    la longitud del lado de un cuadrado, con dicha variable calcule el área del
    cuadrado y almacene este valor en otra variable. Imprime por pantalla el valor
    de esta última variable.
 */
public class AreaCuadrado {
    public static void main(String[] args) {
        int longCuadrado = 4;

        int area = longCuadrado * longCuadrado;
        System.out.println("El área del cuadrado(lado=" + longCuadrado + ") es " + area);
    }
}