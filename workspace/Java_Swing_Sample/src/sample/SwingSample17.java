package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingSample17 extends JFrame{

	public SwingSample17(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100,  300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel label1 = new JLabel("今日の天気");
		label1.setForeground(Color.BLUE);
		label1.setBackground(Color.BLACK);

		JLabel label2 = new JLabel("晴れのち曇り");
		label2.setForeground(Color.ORANGE);
		label2.setBackground(Color.WHITE);
		label2.setOpaque(true);

		p.add(label1);
		p.add(label2);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample17 frame = new SwingSample17("タイトル");
		frame.setVisible(true);
	}

}
