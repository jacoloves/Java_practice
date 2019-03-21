package sample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingSample10 extends JFrame{

	public SwingSample10(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("ボタン");

		//Container contentPane = getContentPane();
		add(btn, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample10 frame = new SwingSample10("タイトル");
		frame.setVisible(true);
	}

}
