package com.company;

public class Max4{
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        if(d > max){
            max = d;
        }

        return max;
    }

    public static void main(String[] args){
        int a = 12;
        int b = 34;
        int c = 54;
        int d = 123;

        int max = max4(a, b, c, d);

        System.out.println("最大値は" + max + "です。");
    }
}
