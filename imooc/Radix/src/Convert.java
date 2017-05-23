/**
 * Created by yangxi on 2017/5/23.
 */
public class Convert {

    /**
     * 整型转字节数组
     * @param number
     * @return
     */
    public static byte[] int2bytes(int number) {
        byte[] bytes = new byte[4];
        for (int i  = 0; i < 4; i++) {
            bytes[i] = (byte) ((number >> i*8) & 0xff);
        }
        return bytes;
    }

    /**
     * 字节数组转整型
     * @param bytes
     * @return
     */
    public static int bytes2int(byte[] bytes) {
        int result = 0;
        for (int i = 0; i < bytes.length; i++) {
            result += (int)((bytes[i] & 0xff) << i*8);
        }
        return result;
    }

    public static void main(String[] args) {
        String des = "我爱北京天安门";
        byte[] bytes = des.getBytes();
        String des1 = new String(bytes);
        System.out.println(des1);

        int number = 2345;
        byte[] bytes1 = Convert.int2bytes(number);
        for (byte byt:bytes1
             ) {
            System.out.println(byt);
        }
        System.out.println(Convert.bytes2int(bytes1));
    }
}
