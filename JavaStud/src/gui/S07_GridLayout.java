package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class S07_GridLayout extends StudyFrame {
	
	ArrayList<JButton> btns;
	
	public S07_GridLayout() {
		super();
		
		btns = new ArrayList<>();
		
		// 2�� �̻��� ���̾ƿ��� ����ϰ� �ʹٸ� JPanel�� �̿��Ѵ�.
		setLayout(new BorderLayout());
		
		// JPanel�� �ٸ� ���̾ƿ��� ������ �� �ִ� ���ο� ���̴�.
		JPanel center_panel = new JPanel();
		JButton south_button = new JButton("Generate Color!");	
		
		add(center_panel, "Center");
		add(south_button,"South");
		
		center_panel.setLayout(new GridLayout(4,4));
		
		for(int i=0;i<15;++i) {
			JButton btn = new JButton("Button"+i);
			btns.add(btn);

			center_panel.add(btn);
		}
		generateColor();
	}
	
	private void generateColor() {
		for(JButton btn: btns) {			
		btn.setBackground(new Color((int)(Math.random()*0xFFFFFF)));
		}
		
	}
	
	public static void main(String[] args) {
		S07_GridLayout frame = new S07_GridLayout();
		frame.setDefaultOptions();
	}
}
