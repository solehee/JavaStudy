package myobj.BlackJack;

import java.lang.reflect.Array;
import java.util.List;

public class CardDeck {
	private static final String[] PATTERNS = {"��Ʈ ", "Ŭ�ι� ", "���̾Ƹ�� ", "�����̵� "};
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
                	//�迭�� ���� �����ؼ� ����?
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
    // �迭 ���̱� 52���� �´µ� �� null ���� ��������..?
    
    public void turn(int numSum) {
    	numSum=0;
    
    	for(int i=0;i<2;++i) {
    		int random = (int)(Math.random()*52);
    		System.out.print("�÷��̾� ī�� "+"["+cardDeck[random]+"]\n");
    		numSum+=(int)(cardNum[random]);
    		excedSum+=(int)(exced[random]);
    	}
    	System.out.println("�հ� : "+numSum);
    }
    
    // �迭�� �޾Ƽ�? �ϳ��� ����ϴ� ���·�? �ϳ���??...
    public void turnComputer(int numSumCom) {
    	numSumCom=0;
    	int random=0;
    	String dealerCard[] = new String[cardNum.length];
    	for(int i=0;i<2;++i) {
    		random = (int)(Math.random()*52);
    		dealerCard[i]=cardDeck[random];
    		numSumCom=(int)(cardNum[random]);    		
    	}
    	System.out.print("����ī�� "+"["+dealerCard[0]+"]\n");
    	System.out.println("�հ� : "+numSumCom);
    	
    }
    
    public boolean checkTurn(int numSum) {
    	if(numSum>21||excedSum>21) {
    		//���⿡ A�� 1�� ��쵵 �־��ֱ�
    		System.out.println("�÷��̾��� �й�");
    		return false;
    	}else if(numSum==21||excedSum==21) {
    		System.out.println("�÷��̾��� �¸�");
    		//�÷��̾� ī�� ���̶� ������ ī�� �� Ȯ��
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
