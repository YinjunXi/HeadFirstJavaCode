package Foundation;

/**
 * Created by yangxi on 2016/11/17.
 */
public class BubbleSort {

    public static void main(String[] args) {

        //2、冒泡排序
        int[] array2 = {9,8,7,6,5};

        //输出数组
        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i]);
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < array2.length-1; i++) {

            //每次排序后，都把最大的值放到了最后一个
            for (int j = 0; j < array2.length-1-i; j++) {

                if (array2[j+1] < array2[j]) {
                    int  temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;
                }
            }

            //输出每次冒泡的结果
            System.out.print("第 ");
            System.out.print(i);
            System.out.print(" 次冒泡 ");

            for (int k = 0; k < array2.length; k++) {

                System.out.print(array2[k]);
                System.out.print(" ");
            }
            System.out.println();


        }


    }
}
