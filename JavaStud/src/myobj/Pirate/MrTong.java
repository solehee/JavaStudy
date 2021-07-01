package myobj.Pirate;

public class MrTong {
	
	// true : �ش� ������ ���� ����
	// false : �ش� ������ ���� ���� ����
	boolean[] launch;
	boolean[] stabbed; 

	
	//launched �� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		
		// ������ �켱 1 ~ 4�� ����
		for (int i=0;i<4;++i) {
			launch[(int)(Math.random()*size)]=true;
		}
		
		// ����
		//for(int i=0; i<1000;++i) {
		//	int x=(int)(Math.random()*size);
		//	int y=(int)(Math.random()*size);
		//	
		//	boolean temp = launch[x];
		//	launch[x]=launch[y];
		//	launch[y]=temp;
		//}
	}
	
	// �̹� �� ���̶�� return false, �ƴ϶�� ��� �� �񷶴ٸ� return true
	public boolean stab(int index) {
		if (stabbed[index]) {
			return false;
		}else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
		}
	}
	
	public boolean[] getStabbed(){
		return stabbed;
	}
	/*public int[] notyet() {
		int count =0;
		
		for(boolean stab : stabbed) {
		if(stab) {
			count++;
		}
		}
		return null;
		
	}*/
}
