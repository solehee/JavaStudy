package gui.quiz.gridPuzzle;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NumPad extends JButton {

	List<JButton> numPads;
	BufferedImage image;
	int index;
	int gameSize;
	
	int left;
	int right;
	int top;
	int bottom;
	
	
	public NumPad(int index, int gameSize, List<JButton> numPads, BufferedImage image) {
		this.gameSize= gameSize;
		this.image = image;
		this.numPads = numPads;
		this.index = index;
		this.top = index - gameSize >= 0 ? index-gameSize : -1;
		this.bottom = index + gameSize < gameSize*gameSize ? index+gameSize : -1;
		this.left = index % gameSize !=0 ? index-1 : -1;
		this.right = index % gameSize != gameSize-1 ? index+1 : -1; 

		if(index==gameSize * gameSize -1) {
			setText("E");
		}else {
			setIcon(new ImageIcon(getNumPadImage()));
			//setText(""+(1+index));
		}
		
		setFont(new Font("µ¸¿ò", Font.ITALIC|Font.BOLD, 55));
		addActionListener(new ImageNumPadAction(this));
	}
	
	
	private BufferedImage getNumPadImage() {
		int x= index % gameSize;
		int y=index/ gameSize;
		int width =700/gameSize;
		int heigth =width;
		return image.getSubimage(x*width, y*heigth, width, heigth);
	}
	
	private boolean isBlank(int index) {
		return numPads.get(index).getText().equals("");
	}

}
