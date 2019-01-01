package chapter_3;

import java.util.Scanner;

public class SeqSeqrch {

    static int seqSearch(int[] a, int n, int key){
//        int i = 0;
//
////        while(true){
////            if(i == n)
////                return -1;
////            if(a[i] == key)
////                return i;
////
////            i++;
////        }
        for(int i = 0; i < n; i++)
            if(a[i] == key)
                return i;

            return -1;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.printf("探す値：");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1)
            System.out.println("その値の要素は存在しません。");
        else
            System.out.println("その値はx[" + idx + "]にあります。");
    }
}
