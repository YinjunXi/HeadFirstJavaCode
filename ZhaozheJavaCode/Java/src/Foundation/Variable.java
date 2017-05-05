package Foundation;

/**
 * Created by yangxi on 2016/11/3.
 */
public class Variable {
    public static void main(String[] args) {
        String name = "hello";
        double pi = 3.14;
        float a =  2.5f;
        int two = 2;

        System.out.println(name);
        System.out.println(pi);
        System.out.println(a);
        System.out.println(two);

        int b = 3;
        int c = b++;
        int d = ++b;

        System.out.println(c);
        System.out.println(d);

        double e = Math.random();
        System.out.println(e);



    }
}
