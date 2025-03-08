package metodos;

public class Overloading {
    public static void main(String[] args) {
        int resultado = sumaNum(20, 20, 45);
        int resultado2 = sumaNum(20, 30);
        String test = sumaNum();
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(test);

    }

    static int sumaNum(int a, int b){
        return a + b;
    }

    static int sumaNum(int a, int b, int c){
        return a + b + c;
    }

    static String sumaNum(){
        return "Hola Mundo";
    }
}
