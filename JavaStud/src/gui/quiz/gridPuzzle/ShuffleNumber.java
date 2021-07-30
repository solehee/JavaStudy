package gui.quiz.gridPuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;

public class ShuffleNumber implements ActionListener{
	
	ArrayList<JButton> btns;
	int i;
	
	
	public ShuffleNumber(ArrayList<? extends JButton> btns,int i) {
		this.btns = (ArrayList<JButton>)btns;
		this.i = i;
	}
	
	private void shuffle() {
		for(JButton btn: btns) {
			btn.setText(""+random());
		}
		
	}
	
	public int random() {
		int random = 0;
		HashSet<Integer> hash = new HashSet<Integer>();	
		for(int j=1;j<=i;++j) {
			hash.add(j);		
		}
	
		for (int ran : hash) {
			random=ran;
   		}
		return random;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		shuffle();
	}
	
	
}
