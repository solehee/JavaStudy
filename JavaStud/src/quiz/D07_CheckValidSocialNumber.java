package quiz;

public class D07_CheckValidSocialNumber {
	/*
	 사용자가 주민둥록번호를 입력하면 
	 그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	 ** 윤년 8번째자리 체크해야하는거 넣기 12면 19년대 34면 20년대
	 맨앞 2자리 숫자
	 월 자리에 01 ~ 12 이내의 숫자
	 일 자리에 01 ~ 31 이내의 숫자
	 (1, 3, 5, 7, 8, 10, 12월 이면 31 / 4, 6, 9, 11월이면 30 / 2월은 윤년일때 29 아니면 28)
	 7번째 자리 '-'
	 뒷자리 전부 숫자
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
				
				System.out.println("윤년입니다");
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
			System.out.println("길이가 틀렸습니다");
		}
		else if(!checkNumber(socialNumber)) {
			valid = false;
			System.out.println("숫자와 '-' 로만 적어주세요");
		}else if(!checkYear(socialNumber)&&!checkMonthDay(socialNumber)) {
			valid = false;
			System.out.println("생년월일 다시 체크해주세요");
		}
		
		System.out.println(new String(socialNumber)+"는 "+(valid?
				"정상적인 주민등록번호 입니다.":"잘못된 주민등록번호 입니다"));
	}
	
	public static void main(String[] args) {
		check("090431-123456".toCharArray());
		check("090331-323456".toCharArray());
		check("080228-323456".toCharArray());
		check("080229-323456".toCharArray());
	}
}
