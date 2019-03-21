package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SwingSample22 extends JFrame{

	public SwingSample22(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		ImageIcon icon1 = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");
		ImageIcon icon2 = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");
		ImageIcon icon3 = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");

		JLabel label1 = new JLabel(icon1);
		label1.setPreferredSize(new Dimension(100, 100));
		label1.setHorizontalAlignment(JLabel.LEFT);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setBorder(new LineBorder(Color.blue, 2, true));

		JLabel label2 = new JLabel();
		label2.setIcon(icon2);
		label2.setPreferredSize(new Dimension(100, 100));
		label2.setHorizontalAlignment(JLabel.RIGHT);
		label2.setVerticalAlignment(JLabel.BOTTOM);
		label2.setBorder(new LineBorder(Color.blue, 2, true));

		JLabel label3 = new JLabel(icon3);
		label3.setPreferredSize(new Dimension(100, 100));
		label3.setBorder(new LineBorder(Color.blue, 2, true));

		p.add(label1);
		p.add(label2);
		p.add(label3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample22 frame = new SwingSample22("タイトル");
		frame.setVisible(true);
	}

}
