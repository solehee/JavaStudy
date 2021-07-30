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
		�Ȱ��� ��������� _�� ������ �ִܼ�� �����ӿ� ���� ���� ����غ�����
		KeyEvent�� ���� � Ű�� ���ȴ��� Ȯ���Ͽ� ������ üũ���ּ���
		������ Ʋ�ȴٸ� ���� �׸����� �Ѿ�� ������ �׸����� Ʋ����
		�� �̻� �Էµ��� �ʰ�, �׸��� �Ѿ�� �ʰ� ���ּ���
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
