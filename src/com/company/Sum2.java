package com.company;

import java.util.Scanner;

public class Sum2 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値:");
        int n = stdIn.nextInt();

        int sum = (1 + n) * (n / 2);

        System.out.println("合計は"+sum);
    }
}
