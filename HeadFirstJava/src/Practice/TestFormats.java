package Practice;

/**
 * Created by yangxi on 2017/3/28.
 */
public class TestFormats {
    public static void main(String[] args) {
        // 将数字以带逗号的形式格式化
        String s = String.format("%,d",1000000000);
        System.out.println(s);
    }
}
