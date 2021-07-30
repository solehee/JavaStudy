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
		
		TextArea ta = new TextArea("기본값");
		ta.setBounds(20, 20, 220, 220);
		
		// keyTyped로는 키보드의 어떤 키가 눌렸는지 알 수 없다(VK_DEFINED)
		// 어떤 키가 눌렸는지 알기 위해서는 KeyPressed이벤트를 이용해야한다.
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
	
	// 키보드가 눌렸을 때 발생하는 이벤트를 컴포넌트에 추가할 수 있다
	public static void main(String[] args) {
		S10_KeyEvent frame = new S10_KeyEvent();
		frame.setDefaultOptions();
	}
}
