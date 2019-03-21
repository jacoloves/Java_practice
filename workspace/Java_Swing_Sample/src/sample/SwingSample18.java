package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingSample18 extends JFrame{

	public SwingSample18(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel label1 = new JLabel("今日の日付");
		label1.setFont(new Font("MSゴシック", Font.BOLD, 12));

		JLabel label2 = new JLabel("21 Sep. 2009");
		label2.setFont(new Font("Century", Font.ITALIC, 24));

		p.add(label1);
		p.add(label2);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample18 frame = new SwingSample18("タイトル");
		frame.setVisible(true);
	}

}
