package chapter_5;

import java.util.Scanner;

public class RecurX1 {
    static void recur(int n) {
        while (n > 1) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.printf("整数を入力せよ：");
        int x = a.nextInt();

        recur(x);
    }


}
