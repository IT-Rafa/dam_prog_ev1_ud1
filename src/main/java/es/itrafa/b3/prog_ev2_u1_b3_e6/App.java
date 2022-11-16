package es.itrafa.b3.prog_ev2_u1_b3_e6;
/*
    EJERCICIO U1_B3_E6.
    Explica por qué la primera declaración da error de compilación y la segunda no
    class App{
        public static void main(String[] args) {
            float miFloat=10.0;
            double miDouble=10.0;
        }
    }
 */
class App{
    public static void main(String[] args) {
        float miFloat=(float)10.0; // 10.0 es double y no puede guardarse en float sin convertir
        double miDouble=10.0;
    }
}
