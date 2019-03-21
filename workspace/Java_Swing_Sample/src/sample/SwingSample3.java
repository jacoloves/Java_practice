package sample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JButton btn1 = new JButton("Save");
		JButton btn2 = new JButton("Cancel");
		JButton btn3 = new JButton("Help");

		p.add(btn1);
		p.add(btn2);
		p.add(btn3);

		frame.getContentPane().add(p, BorderLayout.SOUTH);
		frame.setVisible(true);

	}

}
