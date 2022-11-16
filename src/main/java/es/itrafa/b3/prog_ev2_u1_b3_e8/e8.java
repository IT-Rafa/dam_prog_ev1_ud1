package es.itrafa.b3.prog_ev2_u1_b3_e8;
/*
    EJERCICIO U1_B3_E8.
    Explica porqué no se imprime en la salida el carácter \ y el carácter n
    class App{
        public static void main(String[] args){
            System.out.println("si pongo \n no se imprime la barra y la n");
        }
    }
 */
/*
    SOLUTION: la barra \ indica secuencia de escape, y si es reconocida, como \n muestra el valor
        equivalente, que sería salto de línea. Para mostrar \, se añade otra barra igual, \\,
        para crear la secuencia \\ y que en pantalla se muestre \.
 */
class App{
    public static void main(String[] args){
        System.out.println("si pongo \n no se imprime la barra y la n");
    }
}
