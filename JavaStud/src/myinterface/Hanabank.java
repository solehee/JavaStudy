package myinterface;

public class Hanabank implements Account {

	double curr_money=0;
	int commission;
	double interest;
	double limit=50000;
	
	@Override
	public double balance() {
		curr_money+=10000;
		return curr_money;
	}

	@Override
	public int commission() {
		commission=(int)(curr_money*0.00002);
		return commission;
	}

	@Override
	public double interest() {
		interest=curr_money*0.002;
		return interest;
	}

	@Override
	public boolean limit_money() {
		if(curr_money==limit) {
			System.out.println("원금보증이 되지 않습니다.");
			return false;
		}
		else {
			System.out.println("보증되는 금액입니다.");
			return true;
		}
	}

}
