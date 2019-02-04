package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample15 extends JFrame{

	public SwingSample15(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(200, 100));
		p.setBackground(Color.ORANGE);
		p.setLayout(new BorderLayout());

		JButton btn1 = new JButton("NORTH");
		JButton btn2 = new JButton("SOUTH");
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.SOUTH);

		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample15 frame = new SwingSample15("タイトル");
		frame.setVisible(true);
	}



}
