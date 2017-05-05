package question;

import java.util.Scanner;

/**
 * Created by yangxi on 2016/11/18.
 */
public class Question6 {

    public static void main(String[] args) {

        int[] array = new int[4];
        Scanner scanner = new Scanner(System.in);

        int x1 = 0;
        int y1 = 0;

        for(int i = 0;i < array.length;i++) {

            array[i] = scanner.nextInt();
        }

        x1 = array[2] - array[0];
        y1 = array[3] - array[1];

        System.out.print(x1);
        System.out.print(" ");
        System.out.println(y1);


    }


}
