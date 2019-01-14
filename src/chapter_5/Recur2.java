package chapter_5;

import java.util.Scanner;

public class Recur2 {

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.printf("整数を入力せよ：");
        int x = a.nextInt();

        recur2(x);
    }
}
