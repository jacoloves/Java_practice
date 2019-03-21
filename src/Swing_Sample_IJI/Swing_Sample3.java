package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;

public class Swing_Sample3 extends JFrame {

    public Swing_Sample3(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JTextField text1 = new JTextField("東京都港区赤坂", 20);
        JTextField text2 = new JTextField("東京都港区赤坂", 20);
        text2.setEditable(false);
        JTextField text3 = new JTextField("東京都港区赤坂", 20);
        text3.setEnabled(false);

        p.add(text1);
        p.add(text2);
        p.add(text3);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Swing_Sample3 frame = new Swing_Sample3("タイトル");
        frame.setVisible(true);
    }
}
