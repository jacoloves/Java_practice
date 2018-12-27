package chapter_2;

import java.util.Scanner;

public class MaxOfArray {

    static int maxof(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
         return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("身長の最大値を求めます。");
        System.out.println("人数は：");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("height[" +i+ "]:");
            height[i] = stdIn.nextInt();
        }

        System.out.println("最大値は" + maxof(height) +"です。");
    }
}
