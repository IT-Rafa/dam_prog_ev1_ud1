package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e17;

/*
    Ejercicio 17:
    SAUL alumno del 16/17
    La criptografía siempre ha sido muy importante a lo largo de la historia. Se pide que crees una
    implementación sencilla del cifrado XOR, en el cual codificaremos un carácter con base en un
    código de cifrado, que en este caso será numérico (un entero).

    Ejemplo de salida al cifrar el caracter x usando como código de cifrado el valor 28:
    El caracter x cifrado es:b
 */
public class App {
    public static void main(String []args) {
        char c = 'x';
        int cod = 26;
        char caracterCifrado = (char) (c ^ cod);

        System.out.println("El carácter " + c + " cifrado es: " + caracterCifrado);
        System.out.println("El carácter " + caracterCifrado + " descifrado es: " +
                (char) (caracterCifrado ^ cod));
    }
}
