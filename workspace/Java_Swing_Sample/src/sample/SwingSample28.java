package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample28 extends JFrame{

	public SwingSample28(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField("東京都千代田区");

		JTextField text2 = new JTextField("東京都千代田区");
		text2.setFont(new Font("MSゴシック", Font.PLAIN, 8));

		JTextField text3 = new JTextField("東京都千代田区");
		text2.setFont(new Font("MSゴシック", Font.PLAIN, 30));

		p.add(text1);
		p.add(text2);
		p.add(text3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.	CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample28 frame = new SwingSample28("タイトル");
		frame.setVisible(true);
	}

}
