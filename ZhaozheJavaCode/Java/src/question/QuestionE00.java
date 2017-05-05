package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/15.
 */
public class QuestionE00 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("0000");
        } else if (number > 0 && number < 9) {
            System.out.print("000");
            System.out.println(number);
        }else if (number >= 10 && number < 99) {
            System.out.print("00");
            System.out.println(number);
        }else if (number >= 100 && number < 999) {
            System.out.print("0");
            System.out.println(number);
        } else {
            System.out.println(number);
        }
    }
}
