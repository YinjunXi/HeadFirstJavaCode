package Foundation;

/**
 * Created by yangxi on 2016/11/17.
 */
public class Arr2 {

    public static void main(String[] args) {

        //二维数组
        int [][]  array = new int[2][3];
        int[][] array1 = {{1,2,3},{4,5,6}};

        //数组的遍历
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {

                System.out.println(array1[i][j]);
            }
        }


    }
}
