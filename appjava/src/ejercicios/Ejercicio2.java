package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * DATOS DE LA PRUBA
     * Numeros son pares o impares
     * pueden ser divisibles por 3 y por 4
     * texto para decir que es divisible por ambos
     */

    public static void main(String[] args) {

        String mensaje = "";
        String numeroparimpar = "";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valo");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            numeroparimpar = "El numero es par";
        } else if (num % 1 == 0){
            numeroparimpar = "El numero es impar";
        }

        System.out.println(numeroparimpar);

        if (num % 3 == 0 && num % 4 == 0){
            mensaje = "El numero es divisible por 3 y por 4";
        } else if (num % 4 == 0 ){
            mensaje = "El valor es divisible por 4";
        } else if (num % 3 == 0){
            mensaje = "El numero es divisible por 3";
        }

        System.out.println(mensaje);
    }
}
