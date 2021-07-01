package myinterface;

public class bankAccount {
	public static void main(String[] args) {
		result(new Hanabank());		
	}
	
	public static void result(Account account) {		
	for(int i=0;i<10;++i) {
		System.out.println("------입금하였습니다-----");
		System.out.printf("현재 잔액은 "+account.balance()+"원 입니다");
		System.out.println("이자율은"+account.commission()+"프로 입니다");
		System.out.println("수수료는"+account.interest()+"원 입니다");
		System.out.println("계좌 보증 한도 금액 : "+account.limit_money()+"원 입니다");
	}
	System.out.println();
	}
}
