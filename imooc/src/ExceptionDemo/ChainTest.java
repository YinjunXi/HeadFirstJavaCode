package ExceptionDemo;

/**
 * Created by yangxi on 2017/5/11.
 */
public class ChainTest {
    public static void main(String[] args) {
        ChainTest test = new ChainTest();
        try {
            test.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws DrunkException {
        throw  new DrunkException("喝车别开酒！");
    }

    public  void  test2() {
        try {
            test1();
        }catch (DrunkException e) {
            RuntimeException newEx = new RuntimeException("司机一滴酒，亲人两行泪");
            newEx.initCause(e);
            throw  newEx;
        }
    }
}
