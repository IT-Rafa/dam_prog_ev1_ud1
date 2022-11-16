package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e3;
/*
    EJERCICIO3.
    Averigua imprimiendo por pantalla
        ● que carácter pertenece a los siguientes códigos unicode (en decimal): 65 y 107.
        ● Cuáles son los códigos unicode de los siguientes caracteres: e,é, ñ, ?, y ¿.
    Lógicamente, el ejercicio debes realizarlo sin consultar una tabla unicode.
    Utiliza la relación char/int de java.
    la salida debe ser parecida a lo siguiente:
        carácter unicode en decimal 97: a
        carácter unicode en decimal 225: á
        carácter unicode e en decimal: 101
        carácter unicode é en decimal: 233
        carácter unicode ñ en decimal: 241
        carácter unicode ? en decimal: 63
        carácter unicode ¿ en decimal: 191
 */

public class Unidad1 {
    public static void main(String[] args) {
        System.out.println("carácter unicode en decimal 97  : " +  (char)97);
        System.out.println("carácter unicode en decimal 225 : " +  (char)225);
        System.out.println("carácter unicode 'e' en decimal : " +  (int)'e');
        System.out.println("carácter unicode 'é' en decimal : " +  (int)'é');
        System.out.println("carácter unicode 'ñ' en decimal : " +  (int)'ñ');
        System.out.println("carácter unicode '?' en decimal : " +  (int)'?');
        System.out.println("carácter unicode '¿' en decimal : " +  (int)'¿');


    }
}
