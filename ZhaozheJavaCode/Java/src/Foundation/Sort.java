package Foundation;

/**
 * Created by yangxi on 2016/11/17.
 */
public class Sort {

    public static void main(String[] args) {

        //1、选择排序

        int[] array = {4,3,7,2,1,5,6};

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;
            //寻找最小值
            for (int j = i+1;j < array.length;j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            //交换两个数的值
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        //输出结果
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();

    }
}
