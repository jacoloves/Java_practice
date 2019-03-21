public class SelectGreeting {
    public static void main(String[] args) {
        String[] message;
        message = new String[3];

        /*
        メッセージに値を挿入している
         */
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    message[0] = "おはよう！";
                    break;
                case 1:
                    message[1] = "こんにちは！";
                    break;
                case 2:
                    message[2] = "こんばんは！";
            }
        }

        /*
        引数が入力されない
         */
        if (args.length != 1) {
            System.out.println("使い方：java Select Greeting 番号");
            System.exit(0);
        }

        //型変換
        int num = Integer.parseInt(args[0]);

        /*
        引数分岐
         */

        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0〜" + message.length + "の範囲で指定してください。.");
        }


    }
}