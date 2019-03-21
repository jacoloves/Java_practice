package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample33 extends JFrame{

	public SwingSample33(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text = new JTextField("こんにちは", 20);
		text.setCaretPosition(text.getText().length());
		text.setCaretColor(Color.RED);

		p.add(text);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample33 frame = new SwingSample33("タイトル");
		frame.setVisible(true);
	}

}
