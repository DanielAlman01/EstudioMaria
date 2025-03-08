package tiposBasicos;

public class DatosConvertir {
    public static void main(String[] args) {

        /**
         * CONVENCION IMPLICITA
         * Byte
         * Short
         * Int
         * Long
         * Float
         * Double
         */

        byte a = 1;
        float b = 15f;
        double c = a + b;

        System.out.println(c);

        // CONVENCION EXPLICITA
        int x = 15;
        double y = 15.015;
        int z = x + (int)y;

        System.out.println(z);

        String j = "1.1";
        int p = 2;
        double r = Double.parseDouble(j) + p;
        System.out.println(r);
    }
}


