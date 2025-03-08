package tiposBasicos;

public class CaracteresEscape {
    public static void main(String[] args){
        String texto = "Hola \"mundo\""; // Escapar los caracteres
        String texto2 = "Hola \nmundo"; // Salto de linea
        String texto3 = "Hola \tmundo"; // Tabulacion

        System.out.println(texto);
        System.out.println(texto2);
        System.out.println(texto3);
    }
}
