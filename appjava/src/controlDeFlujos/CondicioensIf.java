package controlDeFlujos;

public class CondicioensIf {
    public static void main(String[] args) {
        int edad = 18;
        String movieClassification = "R18";

        boolean isWithAll = true;
        boolean isRestricted = movieClassification.contains("R");

        if(!isRestricted){
            System.out.println("Puede ver la pelicula");
        } else if (edad > 17) {
            System.out.println("Puedes ver la pelicula igual");
        } else if (isWithAll && movieClassification.contains("RP")){
            System.out.println("Puede ver la pelicula");
        } else {
            System.out.println("No se puede ver la pelicula");
        }
    }
}
