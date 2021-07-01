package myobj.BlackJack;

import java.lang.reflect.Array;
import java.util.List;

public class CardDeck {
	private static final String[] PATTERNS = {"하트 ", "클로버 ", "다이아몬드 ", "스페이드 "};
    private static final String[] CARD_COUNT = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public String[] cardDeck = new String[52];
    int[] cardNum= new int[cardDeck.length];
    int [] exced = new int[cardNum.length];
    int excedSum=0;
    public void CardDeck() {
  
    	for(int j=0;j<PATTERNS.length;++j){
            for(int i=0; i<CARD_COUNT.length; i++) {
            	cardDeck[i]=(PATTERNS[j]+CARD_COUNT[i]);
            	if(CARD_COUNT[i]=="A") {
                	cardNum[i]=11;
                	//배열에 따로 저장해서 구분?
                	exced[i]=1;                	
                	}
                	else if(CARD_COUNT[i]=="J"||CARD_COUNT[i]=="Q"||CARD_COUNT[i]=="K") {
                	cardNum[i]=10;	
                	exced[i]=10;
                	}
                	else {
                	cardNum[i]=i;
                	exced[i]=i;
                	} 
            }
    	}
    }
    // 배열 길이기 52개가 맞는데 왜 null 값이 나오는지..?
    
    public void turn(int numSum) {
    	numSum=0;
    
    	for(int i=0;i<2;++i) {
    		int random = (int)(Math.random()*52);
    		System.out.print("플레이어 카드 "+"["+cardDeck[random]+"]\n");
    		numSum+=(int)(cardNum[random]);
    		excedSum+=(int)(exced[random]);
    	}
    	System.out.println("합계 : "+numSum);
    }
    
    // 배열로 받아서? 하나만 출력하는 형태로? 하나를??...
    public void turnComputer(int numSumCom) {
    	numSumCom=0;
    	int random=0;
    	String dealerCard[] = new String[cardNum.length];
    	for(int i=0;i<2;++i) {
    		random = (int)(Math.random()*52);
    		dealerCard[i]=cardDeck[random];
    		numSumCom=(int)(cardNum[random]);    		
    	}
    	System.out.print("딜러카드 "+"["+dealerCard[0]+"]\n");
    	System.out.println("합계 : "+numSumCom);
    	
    }
    
    public boolean checkTurn(int numSum) {
    	if(numSum>21||excedSum>21) {
    		//여기에 A가 1인 경우도 넣어주기
    		System.out.println("플레이어의 패배");
    		return false;
    	}else if(numSum==21||excedSum==21) {
    		System.out.println("플레이어의 승리");
    		//플레이어 카드 합이랑 딜러의 카드 합 확인
    	}
		return true;
    }
    public boolean dealerWin(int numSumCom) {
    	if(numSumCom>17) {
    		return false;
    	}
    	else {
    		//??????
    	}
    	return true;
    }
    
	
}
