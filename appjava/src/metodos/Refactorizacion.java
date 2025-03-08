package metodos;

import java.util.Scanner;

public class Refactorizacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int a = 0;
        int b = 0;

        terminar: while (true){
            opcionesResultdos();
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int resultado = calculadora(scanner);
                    System.out.println("La respuesta de la suma es de: " + resultado);
                    break;
                case 2:
                    hackearNasa();
                    break;
                case 3:
                    break terminar;
                default:
                    System.out.println("Ingrese un numero dentro del rango");
                    break;
            }
        }

    }
    static void opcionesResultdos(){
        System.out.println("Ingresa opcion que deseas");
        System.out.println("1. Calculadora");
        System.out.println("2. Hackear la nasa");
        System.out.println("3. Salir");
    }

    static int calculadora(Scanner scanner){
        System.out.println("Inhresa el primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b = scanner.nextInt();

        return a + b;
    }

    static void hackearNasa(){
        System.out.println("Hackeando la NASA");
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
    }
}
