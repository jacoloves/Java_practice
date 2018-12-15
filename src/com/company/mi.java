package com.company;

public class mi {

    static int min3(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }

        if(c < min){
            min = c;
        }

        return min;
    }

    public static void main(String args[])
    {
        int a = 3;
        int b = 4;
        int c = 0;

        int min = min3(a, b, c);

        System.out.println("最小値は"+ min +"です。");
    }
}
