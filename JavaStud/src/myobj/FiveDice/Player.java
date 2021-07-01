package myobj.FiveDice;

public class Player extends Dice {
	
	private static int value = 0;
	private static boolean check = true;
	
	public boolean countSame() {	
		int tmp;
		int i,j=0;
		while(check) {
		for(i=0;i<RESULT-1;++i) {
			for (j=i+1;j<RESULT;++j) {
			check = (DICE[i]) == (DICE[j]);
			value++;
				if(DICE[j]>DICE[i]) {
					tmp = DICE[j];
					DICE[j]=DICE[i];
					DICE[i]=tmp;
					}	
				check = DICE[i]-1==DICE[j];
				count++;
				}
			}
			if (value==5){
				System.out.println("[[5 다이스]]");
			}else if(value==4) {
				System.out.println("[[4 다이스]]");
			}else if(value==2||value>=3) {
				System.out.println("[[풀하우스]]");
			}
			else {	
				if(count==5) {
					System.out.println("[[라지 스트레이트]]");
				}
				else if(count==4) {
					System.out.println("[[스몰 다이스]]");
				}
				else {
					System.out.println("일치하는게 없습니다");				
				}
			}
		}
		System.out.println("====라운드 끝====");
		return false;
	}
	
}
