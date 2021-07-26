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
		
		// 2개 이상의 레이아웃을 사용하고 싶다면 JPanel을 이용한다.
		setLayout(new BorderLayout());
		
		// JPanel은 다른 레이아웃을 설정할 수 있는 새로운 판이다.
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
