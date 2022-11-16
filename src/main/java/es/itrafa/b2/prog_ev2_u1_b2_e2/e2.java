package es.itrafa.b2.prog_ev2_u1_b2_e2;
/*
    Ejercicio U1_B2_E2:
    En este ejercicio tenemos que intercambiar el valor de dos variables.
    class IntercambioVariables{
        public static void main(String[] args){
        int x=10;
        int y=20;
        int z=0;
        System.out.println("ANTES. x vale "+ x + " y vale "+y );
        ……..instrucciones que realizan el intercambio de valores
        System.out.println("DESPUES. x vale "+ x + " y vale "+y );
        }
    }
    añadir instrucciones que intercambien los valores de x e y, pero de forma que la solución sea
    genérica para cualesquiera valores que contenga x e y en un momento dado. Para ello debes
    utilizar una tercera variable z.
 */
class IntercambioVariables{
    public static void main(String[] args){
        int x=10;
        int y=20;
        int z=0;
        System.out.println("ANTES. x vale "+ x + " y vale "+y );
        z = x;
        x = y;
        y = z;
        System.out.println("DESPUÉS. x vale "+ x + " y vale "+y );
    }
}
