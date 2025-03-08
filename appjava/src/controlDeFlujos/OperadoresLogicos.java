package controlDeFlujos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a || b;
        boolean d = a && b;

        System.out.println(c);
        System.out.println(d);

        boolean x = !a;

        System.out.println(x);

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremiun = true;
        boolean isOn = true;

        String coupon = "chanchito_feliz";

        boolean promo = coupon.equals("ultimate_java") || coupon.equals("chanchito_feliz");
        System.out.println(promo);

        boolean canPurchase = isAdult && isActive;
    }
}
