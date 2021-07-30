package gui;

import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class S10_KeyEvent extends StudyFrame{
	
	public S10_KeyEvent() {
		super();
		
		setLayout(null);
		
		JLabel status = new JLabel("stable");
		
		TextArea ta = new TextArea("�⺻��");
		ta.setBounds(20, 20, 220, 220);
		
		// keyTyped�δ� Ű������ � Ű�� ���ȴ��� �� �� ����(VK_DEFINED)
		// � Ű�� ���ȴ��� �˱� ���ؼ��� KeyPressed�̺�Ʈ�� �̿��ؾ��Ѵ�.
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar()+" Value Typed");
			}
				
				@Override
			public void keyPressed(KeyEvent e) {
				status.setText(e.getKeyCode()+"Key Pressed");
				System.out.println(e.getKeyCode()+"Key Pressed");
			}
			
		});
	/*	ta.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				status.setText(e.getKeyCode()+"Key Typed");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				status.setText("Key Realeased");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				status.setText("Key Pressed");
			}
		});*/
		
		add(ta, "Center");
		add(status,"North");
	}
	
	// Ű���尡 ������ �� �߻��ϴ� �̺�Ʈ�� ������Ʈ�� �߰��� �� �ִ�
	public static void main(String[] args) {
		S10_KeyEvent frame = new S10_KeyEvent();
		frame.setDefaultOptions();
	}
}
