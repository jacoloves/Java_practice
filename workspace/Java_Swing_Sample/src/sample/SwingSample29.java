package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample29 extends JFrame{

	public SwingSample29(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField("東京都千代田区神田");
		text1.setPreferredSize(new Dimension(200, 15));

		JTextField text2 = new JTextField("東京都千代田区神田");
		text2.setPreferredSize(new Dimension(200, 80));

		JTextField text3 = new JTextField("東京都千代田区神田");
		text3.setPreferredSize(new Dimension(200, 40));

		JTextField text4 = new JTextField("東京都千代田区神田");
		text4.setFont(new Font("MS ゴシック", Font.PLAIN, 30));
		text4.setPreferredSize(new Dimension(200, 20));

		p.add(text1);
		p.add(text2);
		p.add(text3);
		p.add(text4);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample29 frame = new SwingSample29("タイトル");
		frame.setVisible(true);
	}

}
