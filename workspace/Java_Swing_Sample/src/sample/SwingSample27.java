package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample27 extends JFrame{

	public SwingSample27(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField("東京都", 20);

		JTextField text2 = new JTextField("東京都", 20);
		text2.setForeground(Color.WHITE);
		text2.setBackground(Color.BLACK);

		JTextField text3 = new JTextField("大阪府", 20);
		text3.setOpaque(true);

		p.add(text1);
		p.add(text2);
		p.add(text3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample27 frame = new SwingSample27("タイトル");
		frame.setVisible(true);
	}

}
