package tiposBasicos;

public class DatosStrings {

    public static void main(String[] args) {
        String textLiteral = "Hola mundo"; //Strin literales
        String text = new String("Hola mundo");

        int cantidad = textLiteral.length();
        System.out.println(cantidad);

        String texto = textLiteral.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo")); // Saber si termine en la oracion pasada
        System.out.println(textLiteral.startsWith("Hola")); // Saber si comiensa por la palabras
        System.out.println(texto.contains("mun")); // Saber si contiene en su horacion el mun
        System.out.println(texto.indexOf("mu")); // Saber en que indice se encuentra la palabra de mu

        System.out.println(texto.toUpperCase()); // Toso lo convierte en mayuscula
        System.out.println(texto.toLowerCase()); // Toso lo convierte en minuscula

        String malo = "       Chanchito malo ";

        System.out.println(malo.trim()); // Quita toods los espacios
    }

}
