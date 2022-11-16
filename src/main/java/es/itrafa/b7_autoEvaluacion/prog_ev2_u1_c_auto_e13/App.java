package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e13;
/*
    EJERCICIO 13.
    De un alumno del 16/17 no recuerdo su nombre
    La teoría de los 6 grados nos dice que cualquier ser humano está a seis personas de cualquier
    otro ser humano de la Tierra. La teoría explica que, de media, cada ser humano conoce a 100
    personas, así que si mueve a esas 100 personas, estas, a su vez, hablan con sus 100 personas
    respectivas, con lo cual quien inicia la cadena ya tiene, en segundo grado, 10000 contactos.
    Ilustra este fenómeno con un simple programa de Java.

    La salida de alumno es
        Yo conozco a 100 personas
        Esas 100 conocen a otras 100 personas cada una, así que en segundo grado tengo acceso a
        10000 personas.
        Esas 10000 conocen a otras 100 personas cada una, así que en tercer grado tengo acceso a
        1000000 personas
        Esas 1000000 conocen a otras 100 personas cada una, así que en cuarto grado tengo acceso
        a 100000000 personas
        Esas 100000000 conocen a otras 100 personas cada una, así que en quinto grado tengo acceso
        a 10000000000 personas
        Esas 10000000000 conocen a otras 100 personas cada una, así que en sexto grado tengo acceso
        a 1000000000000 personas
        ¡Enhorabuena! ¡Acabas de preguntarle la hora al presidente de los Estados Unidos!
 */
public class App {
    public static void main(String[] args){
        long personas = 100;
        long conocidos = 100;
        System.out.println("Yo conozco a "+ personas +" personas");

        while (personas < 1000000000000.0){
            System.out.println("Esas " + personas + " conocen a otras " + conocidos +
                    " personas cada una, así que,\n\t en segundo grado tengo acceso a " +
                    (personas *=conocidos) + " personas.");
        }
        System.out.println("¡Enhorabuena! ¡Acabas de preguntarle la hora al presidente" +
                " de los Estados Unidos!");

    }
}
