package sample;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingSample16 extends JFrame{

	public SwingSample16(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel label1 = new JLabel("今日の天気:");
		JLabel label2 = new JLabel();
		label2.setText("晴れのち曇り");

		p.add(label1);
		p.add(label2);

		Container contentPage = getContentPane();
		contentPage.add(p, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample16 frame = new SwingSample16("タイトル");
		frame.setVisible(true);
	}

}
