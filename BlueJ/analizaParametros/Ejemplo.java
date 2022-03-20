
import java.awt.Point;

public class Ejemplo
{
    public static void modifica(StringBuffer sb) {
        sb.append("****");
        System.out.println(sb);
    }
    public static void modifica(String s) {
        s=s+"xxxx";
       System.out.println(s);
    }
    public static void modifica(Point p) {
        p.x++;
    }
    public static void modifica(int n) {
        n++;
        System.out.println(n);
    }

}
