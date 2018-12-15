package com.company;
import java.util.Scanner;

public class JudgeSign {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数を入力せよ：");
        int n = stdIn.nextInt();

        if(n > 0){
            System.out.println("それは正です。");
        }else if(n < 0){
            System.out.println("それは負です。");
        }else{
            System.out.println("それは0です。");
        }
    }

}
