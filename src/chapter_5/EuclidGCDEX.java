package chapter_5;

import java.util.Scanner;

public class EuclidGCDEX {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("二つの整数の最大公約数を求めます。");

        System.out.printf("整数を入力せよ："); int x = stdIn.nextInt();
        System.out.printf("整数を入力せよ："); int y = stdIn.nextInt();

        System.out.println("最大公約数は" + gcdEx(x, y) + "です。");
    }

    private static int gcdEx(int x, int y) {
        int num1 = x;
        int num2 = y;
        int swap = 0;
        while (true){
            swap = num2;
            num2 = num1 % num2;
            num1 = swap;
            if (num2 == 0)
                break;
        }
        return num1;
    }
}
