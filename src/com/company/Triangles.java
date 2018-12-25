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

        System.out.println("右上直角三角形を表示する");
        triangleRU(n);

        System.out.println("右下直角三角形を表示する");
        triangleRB(n);


    }

    private static void triangleRB(int n) {
        for (int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.printf(" ");
            }
            for (int k = 1; k < i + 1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    private static void triangleRU(int n) {
        for (int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.printf(" ");
            }
            for (int k = n - i; k >= 1; k--){
                System.out.printf("*");
            }
            System.out.println();
        }
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
