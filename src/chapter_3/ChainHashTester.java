package chapter_3;

import java.util.Scanner;

public class ChainHashTester {

    static Scanner stdIn = new Scanner(System.in);

    static class Data {
        static final  int NO = 1;
        static final  int NAME = 2;

        private Integer no;
        private String name;

        Integer keyCode() {
            return no;
        }

        public String toString() {
            return name;
        }

        void scanData(String guide, int sw){
            System.out.println(guide + "するデータを入力してください。");

            if((sw & NO) == NO){
                System.out.printf("番号：");
                no = stdIn.nextInt();
            }
            if ((sw & NAME) == NAME){
                System.out.printf("名前：");
                name = stdIn.next()
            }
        }
    }

    enum Menu {
        ADD(        "データ追加"),
        REMOVE(     "データ削除"),
        SEARCH(     "データ探索"),
        DUMP(       "全データ表示"),
        TERMINATE("終了");

        private final String message;

        static Menu MenuAt(int idx){
            for(Menu m : Menu.values())
                if(m.ordinal() == idx)
                    return m;
             return null;
        }

        Menu(String string){
            message = string;
        }

        String getMessage(){
            return message;
        }
    }

    static Menu SelectMenu() {
        int key;
        do{
            for(Menu m : Menu.values()){
                System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
                if((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal())
                    System.out.println();
            }
            System.out.printf(" : ");
            key = stdIn.nextInt();
        }while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu;
        Data data;
        Data temp = new Data();

        ChainHash<Integer, Data> hash = new ChainHash<Integer, Data>(13);

        do{
            switch (menu == SelectMenu()){
                case ADD :
                    data = new Data();
                    data.scanData("追加", Data.NO | Data.NAME);
                    hash.add(data.keyCode(), data);
                    break;

                case REMOVE :
                    temp.scanData("削除", Data.NO);
                    hash.remove(temp.keyCode());
                    break;

                case SEARCH :
                    temp.scanData("探索", Data.NO);
                    Data t = hash.search(temp.keyCode());
                    if(t != null)
                        System.out.println("そのキーを持つデータは" + t + "です。");
                    else
                        System.out.println("該当するデータはありません。");
                    break;

                case DUMP :
                    hash.dump();
                    break;
            }
        }while (menu != Menu.TERMINATE);
    }
}
