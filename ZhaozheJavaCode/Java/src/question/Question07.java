package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/18.
 */
public class Question07 {

    public static void main(String[] args) {

        int sec = 0;
        Scanner scanner = new Scanner(System.in);
        sec = scanner.nextInt();

        if (sec < 60) {
            System.out.print(sec);
            System.out.println(" 秒");
        } else if (sec >= 60 && sec <60*60) {

            int min = sec / 60;
            int remianSec = sec % 60;
            if (remianSec > 0) {
                min++;
            }

            System.out.print(min);
            System.out.println(" 分");
        } else if (sec >= 60 * 60 && sec <60*60*24) {

            int day = sec / (60*60);
            int remianSec = sec % (60*60);
            if (remianSec > 0) {
                day++;
            }

            System.out.print(day);
            System.out.println(" 天");
        } else if (sec >= 60 * 60 * 24 && sec <60*60*24 * 12) {

            int month = sec / (60*60*24);
            int remianSec = sec % (60*60*24);
            if (remianSec > 0) {
                month++;
            }

            System.out.print(month);
            System.out.println(" 月");
        }

    }
}
