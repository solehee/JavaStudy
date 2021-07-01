package quiz;

public class D07_CheckValidSocialNumber {
	/*
	 ����ڰ� �ֹεշϹ�ȣ�� �Է��ϸ� 
	 �� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 ** ���� 8��°�ڸ� üũ�ؾ��ϴ°� �ֱ� 12�� 19��� 34�� 20���
	 �Ǿ� 2�ڸ� ����
	 �� �ڸ��� 01 ~ 12 �̳��� ����
	 �� �ڸ��� 01 ~ 31 �̳��� ����
	 (1, 3, 5, 7, 8, 10, 12�� �̸� 31 / 4, 6, 9, 11���̸� 30 / 2���� �����϶� 29 �ƴϸ� 28)
	 7��° �ڸ� '-'
	 ���ڸ� ���� ����
*/
	public static int count=0;
	static int year = 0;
	static boolean leap_year = false;
	
	private static boolean checkNumber(char[] socialNumber) {
		for(int i=0; i<socialNumber.length;++i) {
			if(i==7&&socialNumber[i]=='-') {
			if((i!=7)&&Character.isDigit(socialNumber[i])) {
				}
			}
		}
		return true;
	}
	
	public static boolean checkYear(char[] socialNumber) {
		if(socialNumber[0]>='0'||socialNumber[1]<='9'){
			year=(int)socialNumber[0]+(int)socialNumber[1];
		if(socialNumber[8] == '1'||socialNumber[8]== '2') {
			year = year +1900;
			leap_year = (year % 4 == 0 && year%100 !=0)||year%400==0;
		}else if(socialNumber[8]=='3'||socialNumber[8]=='4') {
			year = year+2000;
			leap_year = (year % 4 == 0 && year%100 !=0)||year%400==0;
		}	
	}
		return true;
	}
	
	public static boolean checkMonthDay(char[] socialNumber) {
		if(socialNumber[2]<='1'||socialNumber[3]<='9') {
			if(socialNumber[4]<='3') {
			
				int month=socialNumber[2]+socialNumber[3];
				
				boolean month31 = ((socialNumber[2]== 1)&&(socialNumber[3]==2||socialNumber[3]==0))||
						(socialNumber[2]==0&&(socialNumber[3]==1||socialNumber[3]==3||
						socialNumber[3]==5||socialNumber[3]==7||socialNumber[3]==8));
						
				boolean month30 = ((socialNumber[2]== 1)&&(socialNumber[3]==1))
						||(socialNumber[2]==0&&(socialNumber[3]==4||socialNumber[3]==6||socialNumber[3]==9));
			
				if(month31) {
					socialNumber[4]='3'; socialNumber[5] = '1';		
			}else if(month30) {
				socialNumber[4]='3'; socialNumber[5]='0';
			}else if(leap_year) {
				if(month == 2) {
					socialNumber[4]=2; socialNumber[5]=9;
				}else {
					socialNumber[4]=2; socialNumber[5]=8;
				}
				
				System.out.println("�����Դϴ�");
			}
			
		}else{
			return false;
			}
		}
		return true;
	}
	
	public static void check(char[] socialNumber) {
		boolean valid = true;
		if(socialNumber.length != 13) {
			valid = false;
			System.out.println("���̰� Ʋ�Ƚ��ϴ�");
		}
		else if(!checkNumber(socialNumber)) {
			valid = false;
			System.out.println("���ڿ� '-' �θ� �����ּ���");
		}else if(!checkYear(socialNumber)&&!checkMonthDay(socialNumber)) {
			valid = false;
			System.out.println("������� �ٽ� üũ���ּ���");
		}
		
		System.out.println(new String(socialNumber)+"�� "+(valid?
				"�������� �ֹε�Ϲ�ȣ �Դϴ�.":"�߸��� �ֹε�Ϲ�ȣ �Դϴ�"));
	}
	
	public static void main(String[] args) {
		check("090431-123456".toCharArray());
		check("090331-323456".toCharArray());
		check("080228-323456".toCharArray());
		check("080229-323456".toCharArray());
	}
}
