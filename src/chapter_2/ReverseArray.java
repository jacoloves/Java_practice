package chapter_2;

import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i -1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("要素数は：");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++){
            System.out.printf("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("要素の並びを逆転しました。");
        for (int i = 0; i < num; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
