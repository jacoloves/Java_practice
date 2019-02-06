package sample;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingSample21 extends JFrame{

	public SwingSample21(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		ImageIcon icon1 = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");
		ImageIcon icon2 = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");

		JLabel label1 = new JLabel(icon1);

		JLabel label2 = new JLabel();
		label2.setIcon(icon2);

		p.add(label1);
		p.add(label2);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample21 frame = new SwingSample21("タイトル");
		frame.setVisible(true);
	}

}
