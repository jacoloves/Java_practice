package sample;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample32 extends JFrame{

	public SwingSample32(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField("東京都千代田区神田", 20);
		text1.setHorizontalAlignment(JTextField.LEFT);

		JTextField text2 = new JTextField("東京都千代田区神田", 20);
		text2.setHorizontalAlignment(JTextField.CENTER);

		JTextField text3 = new JTextField("東京都千代田区神田", 20);
		text3.setHorizontalAlignment(JTextField.RIGHT);

		p.add(text1);
		p.add(text2);
		p.add(text3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample32 frame = new SwingSample32("タイトル");
		frame.setVisible(true);
	}

}
