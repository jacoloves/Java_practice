package com.company;


import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("nの値：");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        for(int i = 1; i <= n; i++){
            if(i == n){
                System.out.print(i +" = ");
            }else{
                System.out.print(i +" + ");
            }
        }

        System.out.println(sum);
    }

}
