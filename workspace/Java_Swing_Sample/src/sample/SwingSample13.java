package sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class SwingSample13 extends JFrame{

	public SwingSample13(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(100, 50));
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(50, 100));
		p2.setBackground(Color.ORANGE);
		
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		p2.setBorder(border);
		
		Container contentPane = getContentPane();
		contentPane.add(p1);
		contentPane.add(p2);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample13 frame = new SwingSample13("タイトル");
		frame.setVisible(true);
	}

}
