package com.company;

import java.util.Scanner;

public class SumForPos2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, m;

        System.out.println("値を入力せよ");

        System.out.print("aの値：");
        n = stdIn.nextInt();

        do{
            System.out.print("bの値：");
            m = stdIn.nextInt();
            if(n >= m){
                System.out.println("aより大きな値を入力せよ！");
            }
        } while (n >= m);

        System.out.println("b - aは"+(m - n)+"です。");
    }
}
