package es.itrafa.b4.prog_ev2_u1_b4_e3;
/*
    Ejercicio U1_B4_E3:
    class App{
        public static void main(String[] args){
            System.out.println("Código entero del caracter 'A': "+ (int)'A');
            System.out.println("Código entero del caracter 'B': "+ (int)'B');
            System.out.println("Código entero del caracter 'B': "+ ('A'+1));
            System.out.println("Código entero del caracter 'B': "+ (char)('A'+1));
        }
    }
    A la vista del código anterior responde a las siguientes preguntas:
        1. La instrucción 2º y 3º hacen lo mismo, imprimen el código entero asociado al carácter ‘B’
            ¿Por qué la 2ª necesita (int) y la 3ª no?.
        2. ¿Por qué la última instrucción imprime el carácter ‘B’?
 */

/*
    1º La 2º convierte el char 'B' a int, la 3º la conversión se hace al sumar 1 al char
    2º Suma 1 al char 'A', que se convierte en int, y luego se convierte en char con ese valor, que es la B
 */
public class App{
    public static void main(String[] args){
        System.out.println("Código entero del caracter 'A': "+ (int)'A');
        System.out.println("Código entero del caracter 'B': "+ (int)'B');
        System.out.println("Código entero del caracter 'B': "+ ('A'+1));
        System.out.println("Código entero del caracter 'B': "+ (char)('A'+1));
    }
}
