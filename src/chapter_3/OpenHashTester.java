package chapter_3;

import java.util.Scanner;

public class OpenHashTester {

    static Scanner stdIn = new Scanner(System.in);

    static class Data {
        static final int NO = 1;
        static final int NAME = 2;

        private Integer no;
        private String name;

        Integer KeyCode(){
            return no;
        }

        public String toString(){
            return name;
        }

        void scanData(String guide, int sw){
            System.out.println(guide + "するデータを入力してください。");
            if((sw & NO) == NO){
                System.out.printf("番号：");
                no = stdIn.nextInt();
            }
            if((sw & NAME) == NAME){
                System.out.printf("名前：");
                name = stdIn.next();
            }
        }
    }

    enum Menu{
        ADD(        "データ追加"),
        REMOVE(        "データ削除"),
        SEARCH(        "データ探索"),
        DUMP(        "全データ表示"),
        TERMINATE("終了");


    }
}
