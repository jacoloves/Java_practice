package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample30 extends JFrame{

	public SwingSample30(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JTextField text1 = new JTextField();
		text1.setPreferredSize(new Dimension(200, 30));

		JTextField text2 = new JTextField(15);
		text2.setPreferredSize(new Dimension(50, 30));

		JTextField text3 = new JTextField(15);
		text3.setPreferredSize(new Dimension(200, 30));

		JTextField text4 = new JTextField(15);
		text4.setPreferredSize(new Dimension(200, 10));

		JTextField text5 = new JTextField(15);
		text5.setPreferredSize(new Dimension(200, 60));

		p.add(text1);
		p.add(text2);
		p.add(text3);
		p.add(text4);
		p.add(text5);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample30 frame = new SwingSample30("タイトル");
		frame.setVisible(true);
	}

}
