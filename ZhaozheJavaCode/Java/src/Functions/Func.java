package Functions;

/**
 * Created by yangxi on 2016/11/21.
 */
public class Func {

    public static void main(String[] args) {
        new Func().run();
    }

    public void run() {

        printStar();

        printNumber(8);

        int a1 = 5;
        int b1 = 6;
        System.out.println(sum(a1,b1));


    }

    // 不带参数无返回值
    public void printStar(){

        System.out.println("* * * * *");
    }

    //一个参数无返回值
    public void printNumber(int a) {

        System.out.println(a);
    }

    //两个参数一个返回值
    public  int sum(int a,int b) {

        return a + b;
    }



}
