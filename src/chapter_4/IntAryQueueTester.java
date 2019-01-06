package chapter_4;

import java.util.Scanner;

public class IntAryQueueTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntAryQueue s = new IntAryQueue(100);

        while (true){
            System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());

            System.out.printf("(1)エンキュー (2)デキュー (3)ピーク (4)ダンプ (0)終了：");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x = 0;
            switch (menu){
                case 1:
                    System.out.printf("データ：");
                    x = stdIn.nextInt();
                    try{
                        s.enque(x);
                    }catch (IntAryQueue.OverflowIntAryQueueException e){
                        System.out.println("キューが満杯です。");
                    }
                    break;

                case 2:
                    try{
                        x = s.deque();
                        System.out.println("デキューしたデータは" + x + "です。");
                    }catch (IntAryQueue.EmptyIntAryQueueException e){
                        System.out.printf("キューが空です。");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("ピークしたデータは" + x + "です。");
                    }catch (IntAryQueue.EmptyIntAryQueueException e){
                        System.out.println("キューが空です。");
                    }
                    break;

                case  4:
                    s.dump();
                    break;
            }
        }
    }
}
