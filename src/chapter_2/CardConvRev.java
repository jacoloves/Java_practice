package chapter_2;

import java.util.Scanner;

public class CardConvRev {

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(r + " | " + x);
        System.out.println("  +-----");
        int x2 = x;
        do{
//            System.out.printf(r + " | %3d", x);
//            System.out.println("   ・・・" + (x % r));
//            System.out.println("  +-----");
            d[digits++] = dchar.charAt(x % r);
            x /= r;
            if(x != 0){
                System.out.printf(r + " | %3d", x);
                System.out.println("   ・・・" + (x2 % r));
                System.out.println("  +-----");
            }else if(x == 0){
                System.out.printf("   %3d", x);
                System.out.println("    ・・・" + (x2 % r));
            }
            x2 /= r;


        }while(x != 0);

        return digits;
    }

    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while(x != 0);

        for(int i = 0; i < digits; i++){
            char tmp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = tmp;
        }

        return digits;


    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10進数を基数変換します");
        do {
            do {
                System.out.printf("変換する非負の整数：");
                no = stdIn.nextInt();
            }while (no < 0);

            do {
                System.out.printf("何進数に変換しますか（2-36）");
                cd = stdIn.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.printf(cd + "進数では");
            for (int i = dno-1; i >= 0; i--)
                System.out.print(cno[i]);
            System.out.println("です。");

            System.out.printf("もう一度しますか（1・・・はい/0・・・いいえ）：");
            retry = stdIn.nextInt();
        }while (retry == 1);
    }
}
