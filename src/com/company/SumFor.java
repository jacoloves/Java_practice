package com.company;
import java.util.Scanner;

public class SumFor {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");
        System.out.println("nの値：");
        int n = stdIn.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("1から"+n+"までの和は"+sum+"です。");
    }
}
