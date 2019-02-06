package sample;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample26 extends JFrame{

	public SwingSample26(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField("東京都");
		JTextField text2 = new JTextField("東京都", 10);
		JTextField text3 = new JTextField(15);
		text3.setText("住所を入力してください。");

		p.add(text1);
		p.add(text2);
		p.add(text3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample26 frame = new SwingSample26("タイトル");
		frame.setVisible(true);
	}

}
