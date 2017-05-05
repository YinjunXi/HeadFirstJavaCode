package Foundation;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/7.
 */
public class Condition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 60) {
            System.out.println("老年票");
        } else if ( age  > 22) {
            System.out.println("成年票");
        } else if (age > 8) {
            System.out.println("儿童票");
        } else {
            System.out.println("免票");
        }

    }

}
