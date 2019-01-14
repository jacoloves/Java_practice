package chapter_5;

import java.util.Scanner;

public class HanoiX2 {

    private static String x_pos;
    private static String y_pos;

    static void move(int no, int x, int y) {



        if (no > 1)
            move(no - 1, x, 6 - x - y);

        if (x == 1) {
            x_pos = "A";
        }else if (x == 2) {
            x_pos = "B";
        }else if (x == 3) {
            x_pos = "C";
        }

        if (y == 1) {
            y_pos = "A";
        }else if (y == 2) {
            y_pos = "B";
        }else if (y == 3) {
            y_pos = "C";
        }

        System.out.println("円盤[" + no + "]を" + x_pos +"軸から" + y_pos +"軸へ移動");

        if (no > 1)
            move(no - 1, 6 - x- y, y);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ハノイの塔");
        System.out.print("円盤の枚数：");
        int n = stdIn.nextInt();

        move(n, 1, 3);
    }
}
