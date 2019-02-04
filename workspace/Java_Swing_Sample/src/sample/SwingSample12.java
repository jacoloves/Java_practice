package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample12 extends JFrame{

	public SwingSample12(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);

		JPanel p2 = new JPanel();
		p2.setBackground(Color.ORANGE);

		Container contentPane = getContentPane();
		contentPane.add(p1, BorderLayout.NORTH);
		contentPane.add(p2, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample12 frame = new SwingSample12("タイトル");
		frame.setVisible(true);
	}

}
