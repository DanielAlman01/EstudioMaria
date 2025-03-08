package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int a = 0;
        int b = 0;

        terminar: while (true){

            System.out.println("Ingresa opcion que deseas");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear la nasa");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Inhresa el primer numero");
                    a = scanner.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b = scanner.nextInt();

                    int c = a + b;

                    System.out.println("La respuesta de la suma es de: " + c);
                    break;
                case 2:
                    System.out.println("Hackeando la NASA");
                    System.out.println("#");
                    System.out.println("##");
                    System.out.println("###");
                    System.out.println("####");
                    break;
                case 3:
                    break terminar;
                default:
                    System.out.println("Ingrese un numero dentro del rango");
                    break;
            }
        }





    }
}
