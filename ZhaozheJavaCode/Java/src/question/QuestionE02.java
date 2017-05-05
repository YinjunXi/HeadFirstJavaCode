package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/15.
 */
public class QuestionE02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        if (number == 0) {
            System.out.println("-----");
        } else if (number == 1) {
            System.out.println(".----");
        }else if (number == 2) {
            System.out.println("..---");
        }else if (number == 3) {
            System.out.println("...--");
        }else if (number == 4) {
            System.out.println("....-");
        }else if (number == 5) {
            System.out.println(".....");
        }else if (number == 6) {
            System.out.println("-....");
        }else if (number == 7) {
            System.out.println("--...");
        }else if (number == 8) {
            System.out.println("---..");
        }else if (number == 9) {
            System.out.println("----.");
        }
    }
}
