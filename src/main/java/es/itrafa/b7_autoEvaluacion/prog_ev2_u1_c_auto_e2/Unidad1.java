package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e2;
/*
    EJERCICIO2.
    Queremos calcular cuántos kilómetros tiene un año luz teniendo en cuenta los siguientes datos:
        a. Un año luz son los kilómetros que recorre la luz en un año.
        b. la velocidad de la luz en km/s, redondeando, es 300000 km/s
        c. Un año, redondeando, tiene 365 días.

    Escribimos el siguiente código
        class Unidad1{
            public static void main(String[] args) {
                final int VELOCIDAD_LUZ=300000;
                final int SEGUNDOS_UN_AÑO=365*24*60*60;
                int añoLuz=SEGUNDOS_UN_AÑO*VELOCIDAD_LUZ;
                System.out.println("UN AÑO LUZ TIENE " +añoLuz+"km.");
            }
        }
    y obtenemos la siguiente salida:
    UN AÑO LUZ TIENE -1012953088km.
    Se pide:
        ● explica por qué el código anterior produce una salida incorrecta.
        ● Reforma el código anterior para obtener el resultado correcto
 */
/*
    SOLUTION: Al hacer la multiplicación de SEGUNDOS_UN_AÑO*VELOCIDAD_LUZ da un valor superior
        al máximo de Integer (2147483647) y el valor queda con los números restantes menos los
        eliminados a la izquierda. Para solucionarlo se debe convertir uno de los valores a long,
        para que la división de un resultado long, y guardarla en variable long
 */
public class Unidad1{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        final int VELOCIDAD_LUZ=300000;
        final int SEGUNDOS_UN_AÑO=365*24*60*60;
        long añoLuz= (long)SEGUNDOS_UN_AÑO*VELOCIDAD_LUZ;
        System.out.println("UN AÑO LUZ TIENE " +añoLuz+" km.");
    }
}
