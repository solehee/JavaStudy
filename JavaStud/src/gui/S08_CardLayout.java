package gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S08_CardLayout extends StudyFrame{
	
	public S08_CardLayout() {
		super();
	
		// CardLayout : ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
		JPanel card_panel = new JPanel(new CardLayout(10, 10));
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		
 		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/penguin.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
 		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
 		icons.add(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
 		icons.add(new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
		
 		icons3.add(new ImageIcon("./image/fruits/banana.jpg"));
 		icons3.add(new ImageIcon("./image/fruits/kiwi.jpg"));
 		icons3.add(new ImageIcon("./image/fruits/toamto.jpg"));
 		icons3.add(new ImageIcon("./image/fruits/wmelon.jpg"));
 		icons3.add(new ImageIcon("./image/fruits/gyul.jpg"));
 		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new ImagePanel(icons3);
		JButton south_btn = new JButton("next card!");
		
		card_panel.add("card1", panel1);
		card_panel.add("card2", panel2);
		card_panel.add("card3", panel3);
		
		add(card_panel,"Center");
		add(south_btn,"South");
		
		/*
		 	CardLayout.next()		: ����ī�庸��
		 	CardLayout.previous()	: ����ī�庸��
		 	CardLayout.first() 		: �� ó�� ī�庸��
		*/
		
		south_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �ش� �г� �Ǵ� �����ӿ� ���ǵ� ���̾ƿ��� ������ ����� ���� �ִ�.
				CardLayout card_layout = (CardLayout)(card_panel.getLayout());
				card_layout.next(card_panel);
			}
			
		});
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
		
	}
}
