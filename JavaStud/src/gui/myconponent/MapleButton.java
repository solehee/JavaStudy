package gui.myconponent;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapleButton extends JButton {
	public int value = (int)(Math.random()*7+1);
	public int value2 = (int)(Math.random()*3+1);
	public String[] option = {"�� ����", "��������", "��ø ����", "��� ����", "���ݷ� ����"};	
	public int random_option = (int)(Math.random()*5);
	public String btnName = option[random_option];
	
	public MapleButton() {
		super();
		
		
		if(random_option != 4) {
			setText(btnName+" "+value);			
		}else{
			setText(btnName+" "+value2);
		}
		
		
	}
}
