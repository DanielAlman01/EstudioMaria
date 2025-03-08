package controlDeFlujos;

import java.util.Locale;
import java.util.Scanner;

public class AplicacionTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("exit")){
            System.out.println("Ingresa comando: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        System.out.println("Termino el programa");
    }
}
