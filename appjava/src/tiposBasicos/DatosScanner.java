package tiposBasicos;

import java.util.Scanner;

public class DatosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String valor = scanner.nextLine();
         int numero = scanner.nextInt();
        System.out.println("Hola mundo");
        System.out.println(numero);
        System.out.println(valor);
    }
}
