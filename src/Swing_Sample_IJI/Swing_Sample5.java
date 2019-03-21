package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;

public class Swing_Sample5 extends JFrame {

    public Swing_Sample5(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JTextField text = new JTextField("東京都港区赤坂", 25);
        text.setToolTipText("テキストを入力してください。");

        p.add(text);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Swing_Sample5 frame = new Swing_Sample5("タイトル");
        frame.setVisible(true);
    }
}
