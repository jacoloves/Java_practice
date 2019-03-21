package sample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleSample2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Push");

		frame.getContentPane().add(button, BorderLayout.NORTH);
		frame.setVisible(true);
	}
}
