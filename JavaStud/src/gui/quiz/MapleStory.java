package gui.quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.myconponent.MapleButton;
import gui.myconponent.MyJButton;
import gui.quiz.maple.RollButton;

public class MapleStory extends JFrame {
	/*
		굴리기! 버튼을 누르면 옵션이 랜덤으로 3개 결정되는 프로그램을 만들어보세요.
		
		힘 증가 +1 ~ +7
		지능 증가 +1 ~ +7
		민첩 증가 +1 ~ +7
		행운 증가 +1 ~ +7
		공격력 증가 +1 ~ +3
		
	*/
	public MapleStory() {
		super("단풍 이야기");
		
		RollButton rollBtn = new RollButton();
		add("roll", rollBtn);
		
		
		add("stat1",rollBtn.getRanBtns().get(0));
		add("stat2",rollBtn.getRanBtns().get(1));
		add("stat3",rollBtn.getRanBtns().get(2));
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		setLayout(null);
		
		
		setLocation(100,100);
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MapleStory();
	}
}
