package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Sample4 extends JFrame {

    JTextField text;

    public Swing_Sample4(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        text = new JTextField("東京都港区赤坂", 25);
        JButton buttonCut = new JButton("CUT");
        buttonCut.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        text.cut();
                    }
                }
        );

        JButton buttonCopy = new JButton("COPY");
        buttonCopy.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        text.copy();
                    }
                }
        );

        JButton buttonPaste = new JButton("PASTE");
        buttonPaste.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        text.paste();
                    }
                }
        );

        p.add(text);
        p.add(buttonCut);
        p.add(buttonCopy);
        p.add(buttonPaste);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Swing_Sample4 frame = new Swing_Sample4("タイトル");
        frame.setVisible(true);
    }
}
