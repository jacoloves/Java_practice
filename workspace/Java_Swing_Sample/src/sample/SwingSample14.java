package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample14 extends JFrame{

	public SwingSample14(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(200, 100));
		p.setBackground(Color.ORANGE);

		JLabel label = new JLabel("入場数");
		JTextField text = new JTextField(5);

		p.add(label);
		p.add(text);

		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample14 frame = new SwingSample14("タイトル");
		frame.setVisible(true);
	}

}
