package es.itrafa.b7_autoEvaluacion.prog_ev2_u1_c_auto_e18;
/*
Ejercicio 18:
    BRAIS Alumno del 16/17
    Calculadora de subnet teniendo la ip y la máscara. Ejemplo 172.16.0.1/16
    IP & Mask = SUBNET
    Nota del profesor: este ejercicio está muy bien, pero evidentemente, solo lo entenderán y
    aprovecharán aquellos alumnos que conocen el concepto de dirección IP, máscara y subred.
    La dirección IP la almacena en 4 variables int a las que aplica el & con la parte de máscara que
    le corresponde. Su salida tiene el siguiente aspecto, lógicamente la subnet es lo que calcula el
    programa a partir de IP y MASK.

    SUBNET CALCULATOR
    IP:     172.16.0.1
    MASK:   255.255.0.0
    SUBNET: 172.16.0.0
 */

public class App {
    public static void main(String[] args) {
        String ip = "172.16.122.122/22";
        int[] ipPart = new int[4];

        String[] parts = ip.split("\\.");
        int bar = parts[3].indexOf("/");

        ipPart[0] = Integer.parseUnsignedInt(parts[0]);
        ipPart[1] = Integer.parseUnsignedInt(parts[1]);
        ipPart[2] = Integer.parseUnsignedInt(parts[2]);
        ipPart[3] = Integer.parseUnsignedInt(parts[3].substring(0, bar));
        int cidr = Integer.parseUnsignedInt(parts[3].substring(bar + 1));

        String bin = "";
        for (int i = 0; i < 8; i++) {
            bin += "0";
        }

        int[] mask = {255, 255, 255, 255};
        if (cidr >= 32) {

        } else if (cidr >= 24) {
            mask[3] = 255 - (int) Math.pow(2, 32 - cidr) + 1;

        } else if (cidr >= 16) {
            mask[3] = 0;
            mask[2] = 255 - (int) Math.pow(2, 24 - cidr) + 1;

        } else if (cidr >= 8) {
            mask[3] = 0;
            mask[2] = 0;
            mask[1] = 255 - (int) Math.pow(2, 16 - cidr) + 1;
        } else if (cidr >= 0) {
            mask[3] = 0;
            mask[2] = 0;
            mask[1] = 0;
            mask[0] = 255 - (int) Math.pow(2, 8 - cidr) + 1;
        }

        System.out.println("SUBNET CALCULATOR");

        System.out.println(String.format("IP CON CIDR:  %s", ip));

        System.out.print("IP BINARIO:   ");
        for (int i = 0; i < 4; i++) {
            System.out.print(String.format("%s",
                    (bin + Integer.toBinaryString(ipPart[i])).
                            substring(Integer.toBinaryString(ipPart[i]).length())));
            if (i != 3) {
                System.out.print(".");
            } else {
                System.out.println();
            }
        }

        System.out.println(String.format("MASK:         %d.%d.%d.%d",
                mask[0], mask[1], mask[2], mask[3]));

        System.out.print(String.format("MASK BINARIO: "));
        for (int i = 0; i < 4; i++) {
            System.out.print(String.format("%s",
                    (bin + Integer.toBinaryString(mask[i])).
                            substring(Integer.toBinaryString(mask[i]).length())));
            if (i != 3) {
                System.out.print(".");
            } else {
                System.out.print("\n");
            }
        }

        System.out.print("DIR RED:      ");
        for (int i = 0; i < 4; i++) {
            String ipSt = String.format("%s",
                    (bin + Integer.toBinaryString(ipPart[i])).
                            substring(Integer.toBinaryString(ipPart[i]).length()));
            String maskSt = String.format("%s",
                    (bin + Integer.toBinaryString(mask[i])).
                            substring(Integer.toBinaryString(mask[i]).length()));

            for (int j = 0; j < ipSt.length(); j++) {
                if (maskSt.charAt(j) == '1') {
                    System.out.print("" + ipSt.charAt(j));
                } else {
                    System.out.print("0");

                }
            }
            if (i != 3) {
                System.out.print(".");
            } else {
                System.out.print("\n");
            }
        }

        System.out.print("HOST EN RED:  ");
        for (int i = 0; i < 4; i++) {
            String ipSt = String.format("%s",
                    (bin + Integer.toBinaryString(ipPart[i])).
                            substring(Integer.toBinaryString(ipPart[i]).length()));
            String maskSt = String.format("%s",
                    (bin + Integer.toBinaryString(mask[i])).
                            substring(Integer.toBinaryString(mask[i]).length()));

            for (int j = 0; j < ipSt.length(); j++) {
                if (maskSt.charAt(j) == '0') {
                    System.out.print("" + ipSt.charAt(j));
                } else {
                    System.out.print("0");

                }
            }
            if (i != 3) {
                System.out.print(".");
            } else {
                System.out.print("\n");
            }
        }

    }
}
