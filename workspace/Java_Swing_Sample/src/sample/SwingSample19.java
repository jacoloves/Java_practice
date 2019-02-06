package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class SwingSample19 extends JFrame{

	public SwingSample19(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel label1 = new JLabel("今日の日付：");
		label1.setPreferredSize(new Dimension(100, 100));
		label1.setBorder(new LineBorder(Color.BLUE, 8, true));

		JLabel label2 = new JLabel("今日の日付：");
		label2.setPreferredSize(new Dimension(200, 50));
		EtchedBorder border = new EtchedBorder(EtchedBorder.RAISED, Color.white, Color.black);
		label2.setBorder(border);

		p.add(label1);
		p.add(label2);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample19 frame = new SwingSample19("タイトル");
		frame.setVisible(true);
	}

}
