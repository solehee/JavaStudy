package gui.quiz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import gui.StudyFrame;
import gui.quiz.gridPuzzle.ColorRan;
import gui.quiz.gridPuzzle.ShuffleNumber;

public class GridPuzzle extends StudyFrame {
	/*  
	*/
	private int three=3;
	int i;
	public GridPuzzle() {
		super();
		
		JMenuBar bar = new JMenuBar();
		JMenu main = new JMenu("Main Menu");
		JMenu sub = new JMenu("Layout");
		JMenu suffle = new JMenu("Suffle");
		
		JMenuItem main_item1 = new JMenuItem("New");
		JMenuItem main_item2 = new JMenuItem("Save");
		
		JMenuItem sub_item1 = new JMenuItem("3X3");
		JMenuItem sub_item2 = new JMenuItem("4X4");
		JMenuItem sub_item3 = new JMenuItem("5X5");
	
		JMenuItem suffle1 = new JMenuItem("Number");
		JMenuItem suffle2 = new JMenuItem("color");		
		
		main.add(main_item1);
		main.add(sub);
		main.add(main_item2);
		
		sub.add(sub_item1);
		sub.add(sub_item2);
		sub.add(sub_item3);
		
		suffle.add(suffle1);
		suffle.add(suffle2);
		
		bar.add(main);
		bar.add(suffle);
		
		setJMenuBar(bar);
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		JPanel center_panel = new JPanel();
		JButton shuffle = new JButton("Shuffle");
		JButton color = new JButton("Color");
		
		add(center_panel, "Center");
		add(shuffle, "East");
		add(color,"West");
		
		sub_item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				three = 3;
				center_panel.setLayout(new GridLayout(three,three));
				for(i=1;i<(three*three)-1;++i) {
					JButton btn = new JButton(""+i);
					btns.add(btn);
					
					center_panel.add(btn);
				}
			}
		});
		
		sub_item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				three = 4;
				center_panel.setLayout(new GridLayout(three,three));
				for(i=1;i<(three*three)-1;++i) {
					JButton btn = new JButton(""+i);
					btns.add(btn);
					
					center_panel.add(btn);
				}
			}
		});
		
		sub_item3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				three = 5;
				center_panel.setLayout(new GridLayout(three,three));
				for(i=1;i<(three*three)-1;++i) {
					JButton btn = new JButton(""+i);
					btns.add(btn);
					
					center_panel.add(btn);
				}
			}
		});
		
		center_panel.setLayout(new GridLayout(three,three));
		
		for(i=1;i<(three*three)-1;++i) {
			JButton btn = new JButton(""+i);
			btns.add(btn);
			
			center_panel.add(btn);
		}
		
		
		
		color.addActionListener(new ColorRan(btns));
		suffle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		GridPuzzle puzzle = new GridPuzzle();
		puzzle.setDefaultOptions();
	}
	
}
