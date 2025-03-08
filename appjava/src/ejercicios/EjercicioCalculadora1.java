package ejercicios;

import java.util.Scanner;

public class EjercicioCalculadora1 {
    public static void main(String[] args) {
        /**
         * Crear una calculadora que reciba
         * 2 numeros y luego imprima el resultado
         * de la suma de estos dos números
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("********** CALCULADORA DE JAVA **********");
        System.out.println("Ingresa el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numero es: " + suma);
    }
}
