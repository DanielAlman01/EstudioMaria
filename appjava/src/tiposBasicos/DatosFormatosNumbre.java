package tiposBasicos;

import java.text.NumberFormat;
import java.util.Locale;

public class DatosFormatosNumbre {
    public static void main(String[] args) {

        Locale locale = Locale.forLanguageTag("es-CL");

        NumberFormat a = NumberFormat.getCurrencyInstance(locale);
        String result  = a.format(1099.02);
        System.out.println(result);

        NumberFormat numero = NumberFormat.getPercentInstance();
        System.out.println(numero.format(0.40   ));
    }
}
