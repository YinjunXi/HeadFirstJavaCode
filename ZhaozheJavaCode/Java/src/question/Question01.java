package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/8.
 */
public class Question01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 1000;
        int b = num % 1000 / 100;
        int c = num % 100 / 10;
        int d = num % 10;
        if (num >= 0 && num < 9) {

            System.out.println(d);
        } else if (num >= 10 && num < 99) {

            System.out.println(c);
            System.out.println(d);
        } else if (num >= 100 && num < 999){
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else if (num >= 1000 && num < 9999){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
        else {
            System.out.println("数值太大");
        }

    }
}
