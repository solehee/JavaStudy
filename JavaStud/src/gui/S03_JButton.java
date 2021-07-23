package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	public S03_JButton() {
		super("How to make JButton?");
		
		setLayout(new BorderLayout());
		
		JButton[] btns = new JButton[5];
		String[] directions = {"East", "West", "South", "North","Center"};
		
		
		for(int i=0, len=btns.length; i<len; ++i) {
			btns[i] = new JButton("Button"+i);
			add(btns[i], directions[i]);
		}

		// 1. ��ư���� ������ �ٲ� ���� �ִ�.
		btns[2].setBackground(new Color(0x42bdff));
		
		// 2. ��ư�� �۲��� �ٲ� ���� �ִ�.
		btns[1].setFont(new Font("MV Boli", Font.BOLD, 50));
		
		// 3. ��ư�� �̺�Ʈ�� �߰��� �� �ִ� 
		btns[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int random = (int)(Math.random()*3+2);
				for(int i=1;i<random;++i) {
					System.err.print("�� ����?");					
				}
				System.err.println("�� ����? ");
			}
		});
		
		// 4. ��ư ��Ȱ��ȭ
		btns[4].setEnabled(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100, 100);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S03_JButton();
	}
}