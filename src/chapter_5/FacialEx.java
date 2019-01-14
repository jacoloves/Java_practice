package chapter_5;

import java.util.Scanner;

public class FacialEx {


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("整数を入力せよ：");
        int x = stdIn.nextInt();

        System.out.println(x + "の階乗は" + factorialEx(x) + "です。");

    }

    private static int factorialEx(int x) {
        int num = 1;
        for (int i = x; i > 0; i--) {
            num *= i;
        }

        return num;
    }
}
