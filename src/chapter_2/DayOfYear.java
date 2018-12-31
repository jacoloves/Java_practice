package chapter_2;

import java.util.Scanner;

public class DayOfYear {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    };

    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i = 1; i < m; i++)
            days += mdays[isLeap(y)][i -1];
        return days;
    }

    static int dayOfYear2(int y, int m, int d){

        int j = 1;

        while(j < m){
            d += mdays[isLeap(y)][j - 1];
            j++;
        }
        return d;
    }

    static int leftDayOfYear(int y, int m, int d){
        int days = d;
        int zan_days = 0;

        for(int i = 1; i < m; i++)
            days += mdays[isLeap(y)][i -1];

        for(int i = 1; i < 12; i++)
            zan_days += mdays[isLeap(y)][i - 1];

        int ans = zan_days - days;

        return ans;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("年内の経過日数を求めます。");

        do {
            System.out.print("年："); int year = stdIn.nextInt();
            System.out.print("月："); int month = stdIn.nextInt();
            System.out.print("日："); int day = stdIn.nextInt();

            System.out.printf("年内で%d日目です。\n", dayOfYear2(year, month, day));
            System.out.printf("年内の残り日数は%d日です。\n", leftDayOfYear(year, month, day));


            System.out.printf("もう一度しますか（1.・・・はい/0・・・いいえ）：");
            retry = stdIn.nextInt();
        }while (retry == 1);
    }
}
