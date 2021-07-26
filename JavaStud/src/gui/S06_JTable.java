package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class S06_JTable extends StudyFrame{
	
	public S06_JTable() {
		super();
		
		Container con =getContentPane();
		
		String[] cloumnNames = {"ID", "NAME","JOB","DEPT"};
		String[][] data = {
				{"1","Smith", "IT_PROG","IT"},
				{"2","Allen","IT_PROG","IT"},
				{"3","Ki","IT_PROG","IT"},
				{"4","Zoey","IT_PROG","IT"},
				{"5","Warren","IT_PROG","IT"}
		};
		
		JTable table = new JTable(data, cloumnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		table.getTableHeader().setPreferredSize(new Dimension(
				scrollPane.getWidth(),50
		));
		
		table.getTableHeader().setFont(new Font("Small Fonts", Font.BOLD, 22));
		
		table.setCellSelectionEnabled(true);
		table.setRowHeight(50);
		table.setAlignmentY(JTable.TOP_ALIGNMENT);
		table.setShowGrid(true);
		table.setFont(new Font("Consolas",Font.PLAIN,20));
		
		
		con.add(scrollPane,"Center");
		
		
		/*
		 	인터페이스를 그대로 사용하면 인터페이스 내부의 모든 추상 메서드를 구현해야 한다.
		 	이런 경우 어뎁터 클래스를 사용하면 구현하고 싶은 추상 메서드만 구현할 수 있다.
		*/
		table.getTableHeader().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("테이블 헤더 클릭함");;
			}
		});
		
		scrollPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("스크롤 페인 내부에서 드래그중...");
				
			}
		});
		table.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("테이블에서 마우스 휠이 굴러감");
				
			}
			
		});
		
		/*
			각 컴포넌트들에만 존재하는 이벤트들도 있다.
		*/
		
		ListSelectionModel selection = table.getSelectionModel();
		
		selection.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		selection.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()) {				
					System.out.println("사용자가 다른 칸을 선택하면 발생하는 이벤트");
					System.out.println(
						table.getSelectedColumn()+"열 / "+ 
						table.getSelectedRow()+"행이 선택되었습니다.");
					System.out.println("선택된 값: "+
						table.getValueAt(table.getSelectedRow(), table.getSelectedColumn())
					);
				}else {
					System.out.println("hi!");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		S06_JTable frame = new S06_JTable();
		frame.setDefaultOptions();
	}
}
