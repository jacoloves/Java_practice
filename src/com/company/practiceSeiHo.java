package com.company;

import java.util.Scanner;

public class practiceSeiHo {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;

        System.out.println("正方形を表示します。");

        System.out.printf("段数：");
        n = a.nextInt();

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
