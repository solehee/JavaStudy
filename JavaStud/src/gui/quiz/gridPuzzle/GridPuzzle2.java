package gui.quiz.gridPuzzle;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridPuzzle2 extends JFrame{
	private ArrayList<JButton> num_pads;
	private String image_path;
	
	public GridPuzzle2()  throws IOException{
		this(3);
	}
	
	public GridPuzzle2(int gameSize) throws IOException{
		super(String.format("숫자퍼즐게임: %d x %d",gameSize, gameSize));
		
		image_path="./image/penguin.jpg";
		
		JPanel num_panel = new JPanel(new GridLayout(gameSize, gameSize));
		JPanel menu_panel = new JPanel(new BorderLayout());
		
		num_pads = new ArrayList<>();
		
		for(int i=0, len=gameSize*gameSize; i< len;++i) {
			NumPad new_pad = new NumPad(
					i, 
					gameSize, 
					num_pads, 
					resiezdBufferedImage());
			
			num_pads.add(new_pad);
			num_panel.add(new_pad);	
			
		}	
		
		add(num_panel, "Center");
		add(menu_panel, "East");
		
		//shuffle();
		
		setResizable(false);
		setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpeg")));
		setBounds(100,100,700,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private BufferedImage resiezdBufferedImage() throws IOException {
		BufferedImage img= ImageIO.read(new File(image_path));
		int oriW = img.getWidth();
		int oriH = img.getHeight();
		int newW= 700;
		int newH = 700;
		
		BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
		Graphics2D g = dimg.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.drawImage(img, 0, 0, newW, newH, 0, 0, oriW, oriW, null);
		g.dispose();
		
		return dimg;
		
	}
	
	private void shuffle() {
		for (int i=0; i< 100; ++i) {
			int ran_x = (int)(Math.random()*num_pads.size());
			int ran_y = (int)(Math.random()*num_pads.size());

			String temp= num_pads.get(ran_x).getText();
			num_pads.get(ran_x).setText(num_pads.get(ran_y).getText());
			num_pads.get(ran_y).setText(temp);
		}
	}
	 
	
	public static void main(String[] args) {
		try {
			new GridPuzzle2(4);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("아이콘을 찾을 수 없습니다.");
		}
	}
}
