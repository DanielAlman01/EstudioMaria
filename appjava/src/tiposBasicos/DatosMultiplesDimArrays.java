package tiposBasicos;

import java.util.Arrays;

public class DatosMultiplesDimArrays {
    public static void main(String[] args){
        int[][] numeros = {{0, 1}, {2, 3}};
        String conversionNumeros = Arrays.deepToString(numeros);

        System.out.println(conversionNumeros);
    }
}
