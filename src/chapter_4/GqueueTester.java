package chapter_4;

import java.util.Scanner;

public class GqueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Gqueue<String> s = new Gqueue<String>(100);

        while (true){
            System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());

            System.out.printf("(1)エンキュー (2)デキュー (3)ピーク (4)ダンプ (0)終了：");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            String x;
            switch (menu) {
                case 1:
                    System.out.printf("データ：");
                    x = stdIn.next();
                    try {
                        s.enque(x);

                    }catch (Gqueue.OverflowGQueueException e){
                        System.out.println("キューが満杯です。");
                    }
                    break;

                case 2:
                    try {
                        x = s.deque();
                        System.out.println("デキューしたデータは" + x + "です。");
                    }catch (Gqueue.EmptyGQueueException e){
                        System.out.println("キューが空です。");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("ピークしたデータは" + x + "です。");
                    }catch (Gqueue.EmptyGQueueException e){
                        System.out.println("キューが空です。");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
