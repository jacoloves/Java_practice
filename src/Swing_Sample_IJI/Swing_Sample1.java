package Swing_Sample_IJI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Sample1 extends JFrame implements ActionListener {

    JTextField text;
    JLabel label;

    public Swing_Sample1(String title) {
        setTitle(title);
        setBounds(100, 100, 300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        text = new JTextField("住所", 20);
        JButton button = new JButton("選択部分");
        button.addActionListener(this);
        label = new JLabel();

        p.add(text);
        p.add(button);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Swing_Sample1 frame = new Swing_Sample1("タイトル");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(text.getSelectedText());

    }
}
