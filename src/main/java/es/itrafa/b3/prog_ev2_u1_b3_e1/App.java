package es.itrafa.b3.prog_ev2_u1_b3_e1;
/*
    EJERCICIO U1_B3_E1.
    Cada tipo primitivo tiene asociada una clase Java. Aún no vimos lo que es una clase, pero para
    simplificar digamos por el momento que estas clases Java empaquetan para cada tipo primitivo
    un conjunto de utilidades. A estas clases se les conoce como Wrapper Classes (clases envoltorio)
    y a lo largo del curso entenderás el porqué de este nombre.
        Primitive Data Types    Wrapper Classes
            int             ->   Integer
            short           ->   Short
            long            ->   Long
            byte            ->   Byte
            float           ->   Float
            double          ->   Double
            char            ->   Character
            boolean         ->   Boolean

    Todas las clases excepto Boolean dan acceso al máximo y mínimo valor posible de cada tipo a
    través de las constantes MAX_VALUE y MIN_VALUE. Por ejemplo:
        jshell> Integer.MAX_VALUE
        $5 ==> 2147483647

    Se pide que escribas un programa que genere la siguiente tabla
        Tipo    Min.            Max.
        int     -2147483648     2147483647
        byte    -128            127
        short   -32768          32767
        float   1.4E-45         3.4028235E38
        double  4.9E-324        1.797693134862223157E308
    Completando el siguiente código
    class App{
        public static void main(String[] args){
        System.out.println("Tipo\tMin.\t\tMax.");
        System.out.println("int\t"+Integer.MIN_VALUE+"\t"+Integer.MAX_VALUE);
        ETC.

    Observa que excluimos de la tabla a Boolean que no tiene las constantes indicadas y a Character
    porque hasta el boletín que viene en el que estudiamos el operador de cast no entenderíamos
    bien la salida, ya que los valores están asociados a caracteres no imprimibles. Para alinear la
    tercera columna según el largo de la segunda a veces tendrás que usar un \t y a veces \t\t.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Tipo\tMin.\t\t\tMax.");
        System.out.println("int\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("float\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
    }
}