package chapter_2;

import java.util.Scanner;

public class sumOf {

    static int sumOf(int[] a){
        int sum = 0;

        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.printf("要素数：");
        int num = a.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("x[" + i + "] : ");
            x[i] = a.nextInt();
        }

        int ans = sumOf(x);

        System.out.println("合計値は" + ans + "です。");
    }
}
