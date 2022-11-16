package es.itrafa.b3.prog_ev2_u1_b3_e10;
/*
    EJERCICIO U1_B3_E10.
    Consulta una tabla Unicode (o ASCII) y consigue el mismo resultado que este código pero
    utilizando el código decimal del carácter A en lugar del literal char ‘A’
    class App{
        public static void main(String[] args){
            char miLetra_A='A';
            System.out.println(miLetra_A);
        }
    }
 */
/*
    SOLUTION: Código A = 65. Para usar el código podemos guardar el código directamente char letra_a = 65
 */
class App{
    public static void main(String[] args){
        char miLetra_A='A';
        int code = (int) miLetra_A;
        System.out.println("letra = " + miLetra_A);
        System.out.println("code = " + code);
        char letra = (char)code;
        System.out.println("letra = " + letra);
    }
}
