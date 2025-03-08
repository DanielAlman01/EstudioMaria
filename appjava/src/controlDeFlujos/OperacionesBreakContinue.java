package controlDeFlujos;

import java.util.Scanner;

public class OperacionesBreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true){
            System.out.println("Ingrese un comando");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("salir")){
                break;
            }
            if (input.equals("continuar")){
                continue;
            }
        }
        System.out.println("Termino el loop");
    }
}
