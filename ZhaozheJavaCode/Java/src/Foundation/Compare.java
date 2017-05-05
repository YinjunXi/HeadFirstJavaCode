package Foundation;

/**
 * Created by yangxi on 2016/11/7.
 */
public class Compare {

    public static void main(String[] args) {

        boolean a = 3 > 5;
        boolean b = true;
        boolean c = 5 == 5;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        boolean d = a && b;
        System.out.println(d);
        boolean e = a || b;
        System.out.println(e);

        System.out.println(!b);

        boolean aa = true;
        boolean bb = true;
        boolean cc = false;
        boolean dd = false;

        boolean v = aa && bb && cc && (dd = true);

        System.out.println(dd);

    }
}
