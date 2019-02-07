package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Sample2 extends JFrame implements ActionListener {


    JTextField text;

    public Swing_Sample2(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        text = new JTextField("住所", 20);
        text.select(0, 1);
        JButton button = new JButton("全て選択");
        button.addActionListener(this);

        p.add(text);
        p.add(button);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Swing_Sample2 frame = new Swing_Sample2("タイトル");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.requestFocusInWindow();
        text.selectAll();
    }
}
