package com.company;

import java.util.Scanner;

public class Sum3 {

    static int sumof(int a, int b){
        int pos;
        int last;
        int sum = 0;
        if(a > b){
            pos = b;
            last = a;
        }else{
            pos = a;
            last = b;
        }

        for(int i = pos; i <= last; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner stdInt = new Scanner(System.in);

        System.out.print("aの値:");
        int a = stdInt.nextInt();

        System.out.print("bの値:");
        int b = stdInt.nextInt();

        int sum = sumof(a, b);

        System.out.println("合計は"+sum);
    }
}
