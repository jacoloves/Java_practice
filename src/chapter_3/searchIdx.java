package chapter_3;

import java.util.Scanner;

public class searchIdx {

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                idx[cnt] = a[i];
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for(int i = 0; i < num; i++){
            System.out.printf("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.printf("探す値：");
        int ky = stdIn.nextInt();

        int idx = searchIdx(x, num, ky, y);

        System.out.println("一致する要素数は" + idx + "個です。");
    }
}
