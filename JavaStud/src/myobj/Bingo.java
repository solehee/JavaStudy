package myobj;

public class Bingo {
	
	final int MAX_SIZE=6;
	
	Subject [][] bingo;
	int bingo_index;
	Bingo(){
		bingo = new Subject[MAX_SIZE][MAX_SIZE];
	}
	
	boolean checkEnd() {
		return bingo_index==MAX_SIZE;
	}
	
	void createRow() {
		if(checkEnd()) {
			System.out.println("더 적을 칸이 없습니다");
			return;
		}
		int random=(int)(Math.random()*2+1);
		if (random<2) {		
			bingo[++bingo_index][bingo_index++]=new Subject(random);
			System.out.print("□ \n");
		}
		else {
			bingo[++bingo_index][bingo_index++]=new Subject(random);
			System.out.print("■ \n");
		}
		
	}
	void createCol() {
		if(checkEnd()) {
			System.out.println("더 적을 칸이 없습니다");
			return;
		}
		int random=(int)(Math.random()*2+1);
			if (random<2) {
			bingo[bingo_index++][++bingo_index]=new Subject(random);
			System.out.print("□ \n");
		}
			else {
			bingo[bingo_index++][++bingo_index]=new Subject(random);
			System.out.print("■ \n");
		}
	}
	
	
}
