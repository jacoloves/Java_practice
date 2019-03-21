package sample;

import javax.swing.JFrame;

public class SwingSample1 {

	public static void main(String[] args) {
		JFrame  frame = new JFrame("タイトル");
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
