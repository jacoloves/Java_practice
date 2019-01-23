package chapter_6;

import java.util.Scanner;

public class BubbleSort3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void bubblesort3(int[] a, int n) {
        int cnt = 1;
        for (int i = 0; i < n - 1; i++){

            System.out.println("パス" + cnt + ":");
            for (int j = n - 1; j > i; j--) {

                for (int k = 0; k < n; k++) {
                    System.out.printf("%3d", a[k]);
                }
                System.out.println();

                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
            cnt++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("単純交換ソート（バブルソート）");
        System.out.printf("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.printf("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        bubblesort3(x, nx);

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}
