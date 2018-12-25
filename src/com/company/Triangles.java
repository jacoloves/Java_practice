package com.company;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.printf("段数は：");
        n = scanner.nextInt();

        System.out.println("左下直角三角形を表示する。");
        triangleLB(n);

        System.out.println("左上三角形を表示する。");
        triangleLU(n);


    }

    private static void triangleLU(int n) {
        for(int i = 0; i < n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    private static void triangleLB(int n) {

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
