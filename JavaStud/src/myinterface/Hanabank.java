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
			System.out.println("���ݺ����� ���� �ʽ��ϴ�.");
			return false;
		}
		else {
			System.out.println("�����Ǵ� �ݾ��Դϴ�.");
			return true;
		}
	}

}
