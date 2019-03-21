package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SwingSample20 extends JFrame{

	public SwingSample20(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		JLabel label1 = new JLabel("RIGHT/BOTTOM");
		label1.setPreferredSize(new Dimension(130, 80));
		label1.setHorizontalAlignment(JLabel.LEFT);
		label1.setVerticalAlignment(JLabel.TOP);
		label1.setBorder(new LineBorder(Color.blue, 2, true));

		JLabel label2 = new JLabel("LEFT/TOP");
		label2.setPreferredSize(new Dimension(130, 80));
		label2.setHorizontalAlignment(JLabel.RIGHT);
		label2.setVerticalAlignment(JLabel.TOP);
		label2.setBorder(new LineBorder(Color.blue, 2, true));

		JLabel label3 = new JLabel("DEFAULT");
		label3.setPreferredSize(new Dimension(130, 80));
		label3.setBorder(new LineBorder(Color.blue, 2, true));

		p.add(label1);
		p.add(label2);
		p.add(label3);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample20 frame = new SwingSample20("タイトル");
		frame.setVisible(true);
	}

}
