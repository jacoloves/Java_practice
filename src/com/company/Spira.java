package com.company;

import java.util.Scanner;

public class Spira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.printf("数を入力してください:");
        n = scanner.nextInt();

        System.out.println(n +"段のピラミッドを出現させます。");
        spira(n);
        System.out.println("ついでに数字にピラミッドも表示");
        npira(n);
    }

    private static void npira(int n) {
        for(int i = 1; i <= n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.printf(" ");
            }
            for (int k = 1; k <= ((i - 1) * 2 + 1); k++){
                System.out.printf("%d", i % 10);
            }
            System.out.println();
        }
    }

    private static void spira(int n) {

        for(int i = 1; i <= n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.printf(" ");
            }
            for (int k = 1; k <= ((i - 1) * 2 + 1); k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
