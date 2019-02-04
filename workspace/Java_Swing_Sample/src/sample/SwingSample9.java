package sample;

import javax.swing.JFrame;

public class SwingSample9 extends JFrame{

	public SwingSample9(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 200, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample9 frame = new SwingSample9("タイトル");
		frame.setVisible(true);
	}

}
