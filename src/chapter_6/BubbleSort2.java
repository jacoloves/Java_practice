package chapter_6;

import java.util.Scanner;

public class BubbleSort2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void bubbleSort2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
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

        bubbleSort2(x, nx);

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
