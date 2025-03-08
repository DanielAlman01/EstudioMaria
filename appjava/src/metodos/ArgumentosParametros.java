package metodos;

public class ArgumentosParametros {
    public static void main(String[] args) {
      miMetodo("Daniel", 19);
    }

    static void miMetodo(String nombre, int edad){
        System.out.println("Hola mundo " + nombre + ", tu edad es de: " + edad);
    }
}
