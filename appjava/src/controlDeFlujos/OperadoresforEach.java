package controlDeFlujos;

public class OperadoresforEach {
    public static void main(String[] args) {
        String[] personajes = {"Daniel", "David", "Papa"};

        //for (int i = 0; i < personajes.length; i++){
        //    System.out.println(personajes[i]);
        //}
        for (String personaje: personajes){
            System.out.println(personaje);
        }
    }
}
