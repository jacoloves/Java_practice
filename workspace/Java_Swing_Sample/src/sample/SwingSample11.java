package sample;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SwingSample11 extends JFrame{

	public SwingSample11(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("/Users/shotaro/Downloads/1200px-Haskell-Logo.svg.png");
		setIconImage(icon.getImage());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingSample11 frame = new SwingSample11("タイトル");
		frame.setVisible(true);
	}

}
