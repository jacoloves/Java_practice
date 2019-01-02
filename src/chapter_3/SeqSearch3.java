package chapter_3;

import java.util.Scanner;

public class SeqSearch3 {

    static int seqSearch(int[] a, int n, int key){

        System.out.print("   |");
        for (int i = 0; i < n; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.printf("---+");
        for (int i = 0; i < n; i++){
            System.out.printf("----");
        }
        System.out.println();

        int cnt = 0;
        for(int i = 0; i < n; i++){

            System.out.printf("   |");

            for (int h = 0; h < n; h++){
                System.out.printf("   ");
                if(h == cnt){
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println("  ");
            cnt++;

//            if(i == cnt){
//                System.out.printf("*");
//            }else{
//                System.out.printf(" ");
//            }
//            System.out.println("  ");
//
//            cnt++;

            System.out.printf("  " + i + "|");

            for(int j = 0; j < n; j++){
                System.out.printf("%4d", a[j]);
            }
            System.out.println();

            if(a[i] == key){
                return i;
            }

            System.out.printf("   |");
            for(int k = 0; k < n; k++){
                System.out.printf("    ");
            }
            System.out.println();
        }

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
