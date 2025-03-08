package tiposBasicos;

public class DatosClaseMath {
    public static void main(String[] args) {
        int a = Math.abs(-15);
        double b = Math.ceil(12.2);
        double c = Math.floor(12.2);
        int d = Math.max(14, 20);
        int f = Math.min(14, 20);
        float g = Math.round(10.30f);
        double h = Math.random();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println((int)(h * 100));
    }
}
