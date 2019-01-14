package chapter_5;

import java.util.Scanner;

public class Recur {

    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("整数を入力せよ：");
        int x = stdIn.nextInt();

        recur(x);
    }
}
