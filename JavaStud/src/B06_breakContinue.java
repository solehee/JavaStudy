
public class B06_breakContinue {
	public static void main(String[] args) {
		/*
		 	#break
		 	
		 	- �ݺ��� ���ο��� ����ϸ� �����ִ� �ݺ����� �ϳ��� Ż���Ѵ�
		 	- switch �� ���ο��� ����ϸ� switch ���� Ż���Ѵ�
		 	
		 	# continue
		 	- �ݺ��� ���ο��� ����ϸ� ���� �� �ݺ����� �ٷ� �Ѿ��
		 	- continue�� ���� �������� �ؿ� �ִ� �ݺ��� ����� ��� ���õȴ�
		*/
		
		for ( int i = 0; i<10;++i) {
			if (i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------------");
		for ( int i = 0; i<10;++i) {
			if (i==3 || i==4) {
				break;
			}
			System.out.println(i);
		}
		
		// # for���� ���ѹݺ�
		for (int i=0;true;++i) {
		if(i==1000) {
			break;
		}
		System.out.println(i);
		}
	}
}
