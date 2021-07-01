package myinterface;

public interface Account {
	
	//잔고
	double balance();
	
	//수수료
	int commission();
	
	//이자
	double interest();
	
	//보장한도
	boolean limit_money();
	
}
