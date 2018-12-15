package com.company;

public class MIn4 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b < min){
            min = b;
        }

        if(c < min){
            min = c;
        }

        if(d < min){
            min = d;
        }

        return min;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c = 3;
        int d = 2;

        int min = min4(a, b, c, d);

        System.out.println("最小値は"+ min +"です。");
    }
}
