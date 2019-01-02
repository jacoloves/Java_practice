package chapter_3;

import java.util.Scanner;

public class BinSearch2 {

    static int binSearch2(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        System.out.printf("   |");
        for(int i = 0; i < n; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.printf("---+");
        for(int j = 0; j < n; j++){
            System.out.printf("----");
        }
        System.out.println("--");


        do{
            int pc = (pl + pr) / 2;
            System.out.printf("   |");
            for(int i = 0; i < n; i++){
                if(i == pl){
                    System.out.printf(" <- ");
                }else if(i == pc){
                    System.out.printf("   +");
                }else if(i == pr){
                    System.out.printf("  ->");
                }else{
                    System.out.printf("    ");
                }
            }
            System.out.println("  ");

            System.out.printf("  " + pc + "|");
            for(int i = 0; i < n; i++){
                System.out.printf("%4d", a[i]);
            }
            System.out.println("  ");

            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

            System.out.printf("   |");
            for(int i = 0; i < n; i++){
                System.out.printf("    ");
            }
            System.out.println("  ");
        }while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("昇順に入力してください。");

        System.out.printf("x[0]:");
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.printf("x[" + i + "]:");
                x[i] = stdIn.nextInt();
            }while (x[i] < x[i - 1]);
        }
        System.out.printf("探す値：");
        int ky = stdIn.nextInt();

        int idx = binSearch2(x, num, ky);

        if(idx == -1)
            System.out.println("その値の要素は存在しません。");
        else
            System.out.println("その値はx[" + idx + "]にあります。");
    }
}
