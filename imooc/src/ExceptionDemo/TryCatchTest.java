package ExceptionDemo;

/**
 * Created by yangxi on 2017/5/11.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tct = new TryCatchTest();
        // int result = tct.test();
        // System.out.println("test() 方法执行完毕，返回值为：" + result);
        // int result2 = tct.test2();
        // System.out.println("test() 执行完毕");
        int result3 = tct.test3();
        System.out.println("我想大声告诉你，test3（）执行完了，结果是：" + result3);
    }

    public int test(){
        int devider = 10;
        int result = 100;
        try {
            while (devider > -1) {
                devider--;
                result = result + 100 / devider;
            }
            return  result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return -1;
        }
    }
    public int test2(){
        int devider = 10;
        int result = 100;
        try {
            while (devider > -1) {
                devider--;
                result = result + 100 / devider;
            }
            return  result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环抛出异常了");
            return result = 999;
        } finally {
            System.out.println("这是 finally！！哈哈！！");
            System.out.println("我是result，我的值是：" + result);
        }
    }

    public int test3() {
        int devider = 10;
        int result = 100;
        try {
            while (devider > -1) {
                devider--;
                result = result + 100 / devider;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环抛出异常了");
        } finally {
            System.out.println("这是 finally！！哈哈！！");
        }
        System.out.println("我是test3，我运行完了，表想我");
        return result;
    }


}
