package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e1;
/*
    EJERCICIO1.
    Una unidad astronómica, abreviadamente se escribe como ua y es la distancia media entre la Tierra y el
    Sol, equivalente a 149 597 870 km. Se usa para expresar de forma cómoda las distancias entre el Sol y
    los planetas del sistema solar. La distancia expresada en ua del sol a la tierra se toma como referencia y
    es de 1.00ua. Del Sol a Plutón es 39.44ua. Calcula cuántos km separan a Plutón del Sol. Para observar
    que double es más preciso que float haz el cálculo con las dos aritméticas de forma que obtengamos la
    siguiente salida.
    km del Sol a Plutón utilizando float: 5.90014E9
    km del Sol a Plutón utilizando double: 5.900139992799999E9
 */
public class App {
    public static void main(String[] args){
        int UA = 149597870;
        float solToPlutonInUA_f = 39.44f;
        double solToPlutonInUA_d = 39.44;

        System.out.println("km del Sol a Plutón utilizando float : " + UA * solToPlutonInUA_f);
        System.out.println("km del Sol a Plutón utilizando double: " + UA * solToPlutonInUA_d);

    }
}
