package Foundation;

/**
 * Created by yangxi on 2016/11/29.
 */
public class HelloWorld {

    public static  void  main(String[] args) {

        System.out.println("hello world");

        // 分支语句
        int number = -15;
        if (number > 0) {
            System.out.println("number == " + number + " 是正数");
        } else{
            System.out.println("number == " + number + " 是负数");
        }

        int x = 100;
        int y = 50;
        String result = x >= y? "x大于y" : "x小于y";
        System.out.println(result);

        int weekday = 7;
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;  //可以省略不写
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("亲，没有这一天！");
        }

        int num = 0;
        while (num < 10)
        {
            // Do something
            System.out.println(num);
            num ++;
        }

        int num1 = 1;
        do {
            System.out.println(num1);
            num1 ++;
        } while (num1 < 11);


    }

}
