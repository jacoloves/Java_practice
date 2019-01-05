package chapter_4;

import java.util.Scanner;

public class IntStackX2Tester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStackX2 s = new IntStackX2(10);

        while (true){
            System.out.println("現在のデータ数：" + "A:" + s.size(IntStackX2.AorB.StackA) + "B:" + s.size(IntStackX2.AorB.StackB));
            System.out.printf("(1)Aにプッシュ (2)Aからポップ (3)Aからピーク (4)Aをダンプ (5)Aから探索 (6)Aを空にする\n" +
                    "(7)Bにプッシュ (8)Bからポップ (9)Bからピーク (10)Bをダンプ (11)Bから探索 (12)Bを空にする\n" +
                    "(13)情報開示 (0)終了：");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int n, x = 0;
            switch (menu){
                case 1:
                    System.out.printf("データ");
                    x = stdIn.nextInt();
                    try{
                        s.push(IntStackX2.AorB.StackA, x);
                    }catch (IntStackX2.OverflowIntStackX2Exception e){
                        System.out.println("スタックが満杯です。");
                    }
                    break;

                case  2:
                    try{
                        x = s.pop(IntStackX2.AorB.StackA);
                        System.out.println("ポップしたデータは"+ x + "です。");
                    }catch (IntStackX2.EmptyIntStackX2Expention e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 3:
                    try{
                        x = s.peek(IntStackX2.AorB.StackA);
                        System.out.println("ピークしたデータは"+ x + "です。");
                    }catch (IntStackX2.EmptyIntStackX2Expention e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 4:
                    s.dump(IntStackX2.AorB.StackA);
                    break;

                case  5:
                    System.out.printf("探索するデータ：");
                    x = stdIn.nextInt();
                    n = s.indexOf(IntStackX2.AorB.StackA, x);
                    if(n >= 0)
                        System.out.println("頂上から" + (s.size(IntStackX2.AorB.StackA) - n) + "番目に存在します。");
                    else
                        System.out.println("そのデータはありません。");
                    break;

                case 6:
                    s.clear(IntStackX2.AorB.StackA);
                    break;

                case 7:
                    System.out.printf("データ：");
                    x = stdIn.nextInt();
                    try{
                        s.push(IntStackX2.AorB.StackB, x);
                    }catch(IntStackX2.OverflowIntStackX2Exception e){
                        System.out.println("スタックが満杯です。");
                    }
                    break;

                case  8:
                    try{
                        x = s.pop(IntStackX2.AorB.StackB);
                        System.out.println("ポップしたデータは"+ x + "です。");
                    }catch (IntStackX2.EmptyIntStackX2Expention e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 9:
                    try{
                        x = s.peek(IntStackX2.AorB.StackB);
                        System.out.println("ピークしたデータは"+ x + "です。");
                    }catch (IntStackX2.EmptyIntStackX2Expention e){
                        System.out.println("スタックが空です。");
                    }
                    break;

                case 10:
                    s.dump(IntStackX2.AorB.StackB);
                    break;

                case  11:
                    System.out.printf("探索するデータ：");
                    x = stdIn.nextInt();
                    n = s.indexOf(IntStackX2.AorB.StackB, x);
                    if(n >= 0)
                        System.out.println("頂上から" + (s.size(IntStackX2.AorB.StackB) - n) + "番目に存在します。");
                    else
                        System.out.println("そのデータはありません。");
                    break;

                case 12:
                    s.clear(IntStackX2.AorB.StackB);
                    break;

                case 13:
                    System.out.println("容量：" + s.capacity());
                    System.out.println("Aのデータ量：" + s.size(IntStackX2.AorB.StackA));
                    System.out.println("Bのデータ量：" + s.size(IntStackX2.AorB.StackB));
                    System.out.println("Aは空" + (s.isEmpty(IntStackX2.AorB.StackA) ? "です。" : "ではありません。"));
                    System.out.println("Bは空" + (s.isEmpty(IntStackX2.AorB.StackB) ? "です。" : "ではありません。"));
                    System.out.println("満杯" + (s.isFull() ? "です。" : "ではありません。"));
                    break;
            }
        }
    }
}
