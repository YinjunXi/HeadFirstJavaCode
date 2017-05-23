/**
 * Created by yangxi on 2017/5/23.
 */
public class RadixDemo {
    public static void main(String[] args) {
        int number = 112;
        System.out.println("二进制：" + Integer.toBinaryString(number));
        System.out.println("八进制：" + Integer.toOctalString(number));
        System.out.println("十六进制：" + Integer.toHexString(number));

        System.out.println(Integer.parseInt("11",2));
        System.out.println(Integer.parseInt("11",8));
        System.out.println(Integer.parseInt("11",16));

    }
}
