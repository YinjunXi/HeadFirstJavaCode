package com.imooc;

import java.util.Arrays;

/**
 * Created by yangxi on 2017/5/9.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int[] scores = {89,-23,64,91,119,52,73};
        HelloWorld hello = new HelloWorld();
        int[] result = hello.getThreeOrder(scores);
        System.out.println("考试成绩的前三名为：");
        for (int score :
                result) {
            System.out.println(score);
        }
    }
    public int[] getThreeOrder(int[] scores) {
        int[] result = new int[3];
        int[] scoresArray = scores;
        Arrays.sort(scoresArray);
        int count = 0;
        for (int i = scoresArray.length-1; i  >= 0 ; i--) {
            if ((scoresArray[i] <= 100) && (scoresArray[i] >= 0)) {
                result[count] = scoresArray[i];
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        return  result;
    }


}
