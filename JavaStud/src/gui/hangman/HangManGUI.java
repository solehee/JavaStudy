package gui.hangman;

import java.awt.CardLayout;
import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.StudyFrame;
import gui.mypanel.ImagePanel;

public class HangManGUI extends StudyFrame {
	/*
		똑같은 행맨이지만 _와 정답을 콘솔대신 프레임에 보기 좋게 출력해보세요
		KeyEvent를 통해 어떤 키가 눌렸는지 확인하여 정답을 체크해주세요
		정답이 틀렸다면 다음 그림으로 넘어가고 마지막 그림까지 틀리면
		더 이상 입력되지 않고, 그림도 넘어가지 않게 해주세요
	*/
	int next;
	public HangManGUI() {
		super();

		setLayout(null);
		JLabel status = new JLabel("hangmen");
		TextArea ta = new TextArea("_");
		ta.setBounds(500,500,220,220);
		
		ArrayList<ImageIcon> icons= new ArrayList<>();
		
		icons.add(new ImageIcon("./image/hangman1.png"));
		icons.add(new ImageIcon("./image/hangman2.png"));
		icons.add(new ImageIcon("./image/hangman3.png"));
		icons.add(new ImageIcon("./image/hangman4.png"));
		icons.add(new ImageIcon("./image/hangman5.png"));
		icons.add(new ImageIcon("./image/hangman6.png"));
		icons.add(new ImageIcon("./image/hangman7.png"));
		
		JLabel label = new JLabel(icons.get(next));
		add(label,"Center");
		
		ta.addKeyListener(new KeyAdapter() {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar()+" Value Typed");
		}	
			
		@Override
		public void keyPressed(KeyEvent e) {
			status.setText(e.getKeyCode()+"Key pressed");
			System.out.println(e.getKeyCode()+"Key Pressed");
		}
			
		});
	}
	
	public static void main(String[] args) {
		HangManGUI han = new HangManGUI();
		han.setDefaultOptions();
	}
	
}
