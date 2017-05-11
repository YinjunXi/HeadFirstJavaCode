package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by yangxi on 2017/5/11.
 */
public class Divide {
    public static void main(String[] args) {
        Divide divide = new Divide();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入第一个数：");
            int one = scanner.nextInt();
            System.out.println("请输入第二个数：");
            int two = scanner.nextInt();
            System.out.println("两数相除的结果为：" + one/two);
        } catch (InputMismatchException e) {
            System.out.println("你应该输入整数");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0！");
        } catch (Exception e) {
            System.out.println("我是不知名异常");
        } finally {
            System.out.println("finally game over");
        }
        System.out.println("程序结束啦");

    }

    public double divide(double a,double b) {
        return a / b;
    }
}

