package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;

public class Swing_Sample6 extends JFrame {

    public Swing_Sample6(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JPasswordField pass1 = new JPasswordField(20);
        JPasswordField pass2 = new JPasswordField("初期値の設定");

        p.add(pass1);
        p.add(pass2);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Swing_Sample6 frame = new Swing_Sample6("タイトル");
        frame.setVisible(true);
    }
}
