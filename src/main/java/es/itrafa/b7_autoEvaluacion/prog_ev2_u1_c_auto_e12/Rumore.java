package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e12;

/*

    EJERCICIO 12.
        En años anteriores el último ejercicio consistía en que cada alumno debía crear un
    enunciado cuya solución usará solo los recursos y conceptos vistos hasta el
    momento. Ya hay muchos y no lo haremos este año, pero por curiosidad queda aquí
    una selección de ejercicios. Algunos son geniales. Se respeta la redacción original, por
    supuesto(incluso las faltas de ortografía y tipográficas)

    De Alejandro Oubiña 2016/2017
    Jorge y Ana acaban de terminar su relación. El primer día de la ruptura les confían a sus dos
    mejores amigos lo sucedido. Sin embargo no son tan buenos amigos, porque al día siguiente,
    esos dos amigos les cuentan a otros dos amigos cada uno lo que ha ocurrido. Suponiendo que la
    cadena siga y que cada persona que lo sabe se lo cuenta a dos amigos cada día, cuántas
    personas lo sabrán al cabo de una semana?
    Ilústralo con una clase Java llamada “Rumore” que
    use operaciones a nivel de bit.

    La salida podría ser del estilo
        El primer día lo saben 4 "amigos".
        El segundo día lo saben 8 "amigos".
        El tercer día lo saben 16 "amigos".
        El cuarto día lo saben 32 "amigos".
        El quinto día lo saben 64 "amigos".
        El sexto día lo saben 128 "amigos".
        El séptimo día descans... digooo lo saben 256 "amigos".
    Mejor lo dejamos aquí, ya lo sabe todo el mundo.
 */
public class Rumore {
    public static void main(String[] args) {
        int x = 2;
        int max = 256;
        do {
            System.out.println("El primer día lo saben " + (x<<=1) +" \"amigos\".");
        }while (x<<1 < max);
        System.out.println("El séptimo día descans... digooo lo saben " + (x<<1) +" \"amigos\".");
        System.out.println("Mejor lo dejamos aquí, ya lo sabe todo el mundo.");
    }
}
