package chapter_5;

import java.util.Scanner;

public class HanoiN {
    static void move(int no, int x, int y) {
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];
        int ptr = 0;
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("[%d]を%d軸から%d軸へ移動\n", no, x, y);

            if (sw == 1 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                x = 6 - x - y;
                if (++sw == 2) sw = 0;
                continue;
            }

            do {
                if (ptr-- == 0)
                    return;
                x = xstk[ptr];
                y = ystk[ptr];
                sw = sstk[ptr] + 1;
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ハノイの塔");
        System.out.printf("円盤の枚数：");
        int n = stdIn.nextInt();

        move(n, 1, 3);
    }
}
