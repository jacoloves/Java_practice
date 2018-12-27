package chapter_2;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray2 {

    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();


        System.out.println("身長の最大値を求めます。");
        System.out.printf("人数は次のようになってます");
        int num = rand.nextInt(10);

        System.out.println(num+"人");

        int[] height = new int[num];

        System.out.println("身長は次のようになっています。");

        for(int i = 0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]:" + height[i]);
        }

        System.out.println("最大値は" + maxOf(height) + "です。");
    }
}
