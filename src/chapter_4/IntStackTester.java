package chapter_4;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(100);

        while(true){
            System.out.println("現在のデータ数：" + s.size() + " / " + s.capacity());
            System.out.print("(1)プッシュ (2)ポップ (3)ピーク (4)ダンプ (5)クリア (6)空かどうか確認 (7)一杯かどうか確認 (8)値を検索 (0)終了：");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu){
                case 1:
                    System.out.printf("データ：");
                    x = stdIn.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("スタックが満杯です。");
                    }
                    break;

                case 2:
                    try{
                        x = s.pop();
                        System.out.println("ポップしたデータは" + x + "です。");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 3:
                    try{
                        x = s.peek();
                        System.out.println("ピークしたデータは" + x + "です。");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    s.clear();
                    System.out.println("スタックをクリアしました。");
                    break;

                case 6:
                    if(s.isEmpty()){
                        System.out.println("スタックは空です。");
                    }else {
                        System.out.println("スタックは空ではありません。");
                    }

                case 7:
                    if(s.isFull()){
                        System.out.println("スタックは一杯です。");
                    }else{
                        System.out.println("スタックは一杯ではありません。");
                    }

                case 8:
                    System.out.printf("探索する値：");
                    int a = stdIn.nextInt();
                    int b = s.indexOf(a);
                    if(b == -1){
                        System.out.println("検索した値は見つかりませんでした。");
                    }else {
                        System.out.println("検索した値の場所はx[" + b + "]です。");
                    }
            }
        }
    }
}
