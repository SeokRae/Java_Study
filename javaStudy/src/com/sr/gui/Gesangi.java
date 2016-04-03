package com.sr.gui;

import java.awt.*;
import javax.swing.*;

class GeFrame extends JFrame {
	String[] str = { "c", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "+/-", "=", "+" };
	JButton b[] = new JButton[str.length];

	GeFrame() {
		setTitle("계산기");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(); // 패널 생성
		panel.setLayout(null); // 패널값을 null 값으로 없애줌
		add(panel); // panel 을 추가

		// TextField 지정
		JTextField t1 = new JTextField();
		t1.setBounds(50, 50, 310, 40);
		panel.add(t1); // panel 에 t1을 추가


		for (int i = 0; i < str.length; i++) {
			b[i] = new JButton(str[i]);
			panel.add(b[i]);
		}

		b[0].setBounds(50, 120, 70, 30);
		b[1].setBounds(50, 170, 70, 30);
		b[2].setBounds(130, 170, 70, 30);
		b[3].setBounds(210, 170, 70, 30);
		b[4].setBounds(290, 170, 70, 30);
		b[5].setBounds(50, 220, 70, 30);
		b[6].setBounds(130, 220, 70, 30);
		b[7].setBounds(210, 220, 70, 30);
		b[8].setBounds(290, 220, 70, 30);
		b[9].setBounds(50, 270, 70, 30);
		b[10].setBounds(130, 270, 70, 30);
		b[11].setBounds(210, 270, 70, 30);
		b[12].setBounds(290, 270, 70, 30);
		b[13].setBounds(50, 320, 70, 30);
		b[14].setBounds(130, 320, 70, 30);
		b[15].setBounds(210, 320, 70, 30);
		b[16].setBounds(290, 320, 70, 30);

		setVisible(true);
	}
}

public class Gesangi {
	public static void main(String[] args) {
		new GeFrame();
	}

}