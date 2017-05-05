package Foundation;

/**
 * Created by yangxi on 2016/11/17.
 */
public class Stars {
    public static void main(String[] args) {

        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < 5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("倒序");

        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < 5-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
