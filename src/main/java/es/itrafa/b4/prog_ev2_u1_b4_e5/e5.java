package es.itrafa.b4.prog_ev2_u1_b4_e5;
/*
    Ejercicio U1_B4_E5:
    Todos sabemos que 32767+1 es 32. Entonces, ¿por qué obtenemos -32768 en el siguiente código?
    class App{
        public static void main(String[] args){
            short sx = 32767;
            short sy = 1;
            short sz = (short)(sx + sy);
            System.out.println(" sz vale " + sz );
        }
    }
    run:
    sz vale -32768
 */
/*
    SOLUTION: El valor máximo de short es 32767; si le sumamos uno, lo que lo convierte a int,
        y después lo pasamos a byte, siendo en complemento a 2, el primer valor es un uno y el resto 0,
        con lo que será el valor mínimo de short, que es 32767
 */
class App{
    public static void main(String[] args){
        short sx = 32767;
        short sy = 1;
        short sz = (short)(sx + sy);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println(" sz vale " + sz );
    }
}
