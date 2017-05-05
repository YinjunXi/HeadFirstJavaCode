package Practice;

/**
 * Created by yangxi on 2017/4/13.
 */
public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%,d",1000000000);
        System.out.println(s);

        System.out.printf("I have %,.2f bugs to fix",476578.0987);

        System.out.println();
        System.out.printf("%,6.1f",4442.000);
    }
}
