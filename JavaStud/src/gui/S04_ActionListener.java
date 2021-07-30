package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.myhandler.MyButtonEventHandler1;
import gui.myhandler.MyButtonEventHandler2;

public class S04_ActionListener extends JFrame {
	
	int count=0;

	public S04_ActionListener() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		btns.add(new JButton());
		btns.add(new JButton());
		
		btns.get(0).setText("안녕하세요");
		btns.get(0).setFont(new Font("궁서체", Font.PLAIN, 35));
		
		add(btns.get(0), "Center");
		add(btns.get(1), "East");
		
		// 액션 리스터를 추가한 컴포넌트는 무언가 이벤트가 발생할때마다 actionPerformed 메서드를 호출한다.
		btns.get(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				btns.get(1).setText("바꿔버림");
			}	 
		}); // MyButtonEventHandler1);
		
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				btns.get(1).setText(""+ count++);
				
			}
		});
		
		setLocation(100, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S04_ActionListener();
	}
}
