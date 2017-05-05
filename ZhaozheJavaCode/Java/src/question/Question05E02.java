package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/18.
 */
public class Question05E02 {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        int maxValue = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length ; i++) {

            numbers[i] = scanner.nextInt();
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println(maxValue);

    }
}
