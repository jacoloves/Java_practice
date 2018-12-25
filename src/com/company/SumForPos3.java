package com.company;

import java.util.Scanner;

public class SumForPos3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, m;
        int cnt = 0;

        System.out.println("数字を入力してください。");

        do {
            n = stdIn.nextInt();
        }while (n < 0);

        do {
            n = n / 10;
            cnt++;
        }while (n > 0);

        System.out.println("その数は"+cnt+"桁です。");


    }
}
