package tiposBasicos;

import java.awt.*;

public class DatosReferenciasPrimitivos {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = point1;
        point2.x = 15;

        System.out.println(point1);
    }
}
