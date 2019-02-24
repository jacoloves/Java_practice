import java.io.*;

public class MakeHtml {
    public static void main(String[] args) {

        try {

            /*
            ファイル出力　その１
             */
            File file = new File("/Users/shotaro/Java_practice/Java_pra/src/main/java/test.txt");
            BufferedWriter fw = new BufferedWriter(new FileWriter(file));
            fw.write("<!DOCTYPE html>");
            fw.newLine();
            fw.write("<html>");
            fw.newLine();
            fw.write("<head>");
            fw.newLine();
            fw.write("<title>My Page</title>");
            fw.newLine();
            fw.write("</head>");
            fw.newLine();
            fw.write("<body>");
            fw.newLine();
            //fw.close();

            /*
            ファイル入力　その１
             */
            File file2 = new File("/Users/shotaro/Java_practice/Java_pra/src/main/java/hello.txt");
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String line;
            while ((line = br.readLine())!= null) {

                int flg = 0;

                //▲のとき
                if (line.indexOf("▲") != -1) {
                    line = line.replaceFirst("▲", "<h1>");
                    line = line + "</h1>";
                    flg++;
                }

                //▲のとき
                if (line.indexOf("●") != -1) {
                    line = line.replaceFirst("●", "<h2>");
                    line = line + "</h2>";
                    flg++;
                }

                //上記ケース以外
                if (flg == 0) {
                    line = "<p>" + line;
                    line = line + "</p>";
                }

                fw.write(line);
                fw.newLine();
            }
            br.close();

            /*
            ファイル出力　その２
             */
            fw.write("</head>");
            fw.newLine();
            fw.write("<body>");
            fw.newLine();

            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
