package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class S05_JLabel extends StudyFrame{
	
	/*
	 	# JLabel
	 	
	 	- �ؽ�Ʈ�� ���� �뵵�� ���Ǵ� ������Ʈ
	 	
	 	# Icon���� �̹��� �ֱ�
	  
	*/
	int cnt;
	public S05_JLabel() {
		super();
		
		Icon[] icons = {
				new ImageIcon("./image/penguin.jpg"),
				new ImageIcon("./image/flower2.jpg"),
				new ImageIcon("./image/flower/flowers.png")
			};
		
		JButton btn = new JButton();
		JLabel label = new JLabel(icons[cnt]);
		
		btn.setText("Button");
		
		add(btn, "South");
		add(label, "Center");
		
		// �������� : ��ư�� ������ �ٸ� �׸����� �ٲ�� �������� (�׸��� ��� ��ȯ�Ǿ�� ��)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[++cnt % icons.length]);
			}
		});
			
		
	}
	
	public static void main(String[] args) {
		S05_JLabel frame = new S05_JLabel();
		frame.setDefaultOptions();
	}
}
