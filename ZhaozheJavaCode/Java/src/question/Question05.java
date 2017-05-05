package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/15.
 */
public class Question05 {

    public static void main(String[] args) {

        int maxValue = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > maxValue) {
            maxValue = num;
        }

        num = scanner.nextInt();
        if (num > maxValue) {
            maxValue = num;
        }

        num = scanner.nextInt();
        if (num > maxValue) {
            maxValue = num;
        }

        System.out.println(maxValue);

    }
}
