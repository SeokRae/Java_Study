package com.sr.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	MyFrame() {

		// Default Source
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 400, 300, 300);
		setLayout(new BorderLayout());
		setResizable(false);

		String[] numStr = { "←", "CE", "C", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", "00",
				".", "=" };
		JButton[] b = new JButton[numStr.length];

		// jpanel 생성
		JPanel jp = new JPanel();
		add(new TextField(), BorderLayout.PAGE_START);
		add(jp, BorderLayout.CENTER);
		jp.setLayout(new GridLayout(5, 4));

		// 실험
		// b[0] = new JButton(numStr[0]);
		// jp.add(b[0]);

		// jpanel에 버튼붙이기
		
		for (int i = 0; i < numStr.length; i++) {
			b[i] = new JButton(numStr[i]);
			jp.add(b[i]);
		}

		setVisible(true);
	}
}

public class Calculator {
	public static void main(String[] args) {
		new MyFrame();
	}

}