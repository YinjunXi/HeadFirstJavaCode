package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/15.
 */
public class QuestionE0 {

    public static void main(String[] args) {

        //保留两位小数带四舍五入
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int value = (int)(number);
        int one = (int)(number*10)%10;
        int two = (int)(number*100)%10;
        int three = (int)(number*1000)%10;
        if (three >= 5) {
            two++;
            if (two >= 10) {
                one++;
                two = two - 10;
                if (one >= 10) {
                    value ++;
                    one = one - 10;
                }
            }
        }
        double newNumber =  (double) value + (double)one/10.0 + (double)two/100.0;
        System.out.println(newNumber);


    }
}
