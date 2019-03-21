package sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingSample34 extends JFrame implements ActionListener{

	JTextField text1;
	JTextField text2;
	JLabel label;

	public SwingSample34(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		text1 = new JTextField("住所１", 20);
		text2 = new JTextField("住所２", 20);
		JButton button = new JButton("取得");
		button.addActionListener(this);
		label = new JLabel();

		p.add(text1);
		p.add(text2);
		p.add(button);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		label.setText(text1.getText() + text2.getText());
	}

	public static void main(String[] args) {
		SwingSample34 frame = new SwingSample34("タイトル");
		frame.setVisible(true);
	}

}
