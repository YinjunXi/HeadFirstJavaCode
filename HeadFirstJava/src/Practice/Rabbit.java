package Practice;

import java.util.Scanner;

/**
 * Created by yangxi on 2017/4/28.
 */
public class Rabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入兔子的寿命M");
        int m = scanner.nextInt();
        System.out.println("输入兔子成年所需月数N");
        int n = scanner.nextInt();
        System.out.println("输入月份T");
        int t = scanner.nextInt();

        int number = 0;
        System.out.printf("%d,%d,%d",m,n,t);

        // 
        if (t < n-1) {
            number = 1;
        }
    }

}
