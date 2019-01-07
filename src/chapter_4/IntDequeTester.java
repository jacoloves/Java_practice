package chapter_4;

import java.util.Scanner;

public class IntDequeTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntDeque s = new IntDeque(10);

        while(true){
            System.out.println("現在のデータ数：" + s.size() + "/" + s.capacity());
            System.out.print("(1)先頭にエンキュー (2)先頭からデキュー (3)先頭からピーク (4)末尾にエンキュー (5)末尾からデキュー (6)末尾からピーク (7)ダンプ (8)探索 (0)終了：");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x = 0, idx;

            switch (menu) {
                case 1:
                    System.out.printf("データ：");
                    x = stdIn.nextInt();
                    try {
                        s.enqueFront(x);
                    } catch (IntDeque.OverflowIntDequeException e) {
                        System.out.println("キューが満杯です。");
                    }
                    break;

                case 2:
                    try {
                        x = s.dequeFront();
                        System.out.println("デキューしたデータは" + x + "です。");
                    } catch (IntDeque.EmptyIntDequeException e){
                        System.out.println("キューが空です。");
                    }
                    break;

                case 3:
                    try {
                        x = s.peekFront();
                        System.out.println("ピークしたデータは" + x + "です。");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("キューが空です。");
                    }
                    break;

                case 4:
                    System.out.printf("データ：");
                    x = stdIn.nextInt();
                    try {
                        s.enqueRear(x);
                    } catch (IntDeque.OverflowIntDequeException e) {
                        System.out.println("キューが満杯です。");
                    }
                    break;

                case 5:
                    try {
                        x = s.dequeRear();
                        System.out.println("デキューしたデータは" + x + "です。");
                    } catch (IntDeque.EmptyIntDequeException e) {
                        System.out.println("キューが空です。");
                    }
                    break;

                case 6:
                    try {
                        x = s.peekRear();
                        System.out.println("ピークしたデータは" + x + "　です。");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("キューが空です。");
                    }
                    break;

                case 7:
                    s.dump();
                    break;

                case 8:
                    System.out.printf("探索するデータ：");
                    x = stdIn.nextInt();
                    idx = s.search(x);
                    if (idx != -1)
                        System.out.println("そのデータは" + idx + "番目に存在します。");
                    else
                        System.out.println("そのデータは存在しません。");
                    break;
            }
        }
    }
}
