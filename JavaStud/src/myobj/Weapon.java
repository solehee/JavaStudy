package myobj;

public class Weapon {
	/*
	 	������ �Ӽ�
	 	- ���ݷ�
	 	- ���� ��ȭ ���
	 	- ������ ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�) < if������
	 	- ������ ���ݷ� ������ < for ���ǹ�
	 	
	 	������ �޼���
	 	- ��ȭ�ϱ�
	 	  ������ ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ�(����) 
	 	  < �����Լ� ����(�������� �����ϴ� ���ڸ� �ٸ��� �ؼ� �ۼ�Ʈ ����)
	 	  �����ϸ� ��ȭ ����� 1 �����Ѵ� < if������ 
	 	  �����ϸ� ��ȭ ����� �״�� �����ȴ�(���Ѵٸ� ����߷��� ����)
	 	  
 	   - �����ϱ�
 	   	 ���ݷ��� Ȯ���� �� �ִ�
	*/
	String name;
	int attack;
	int grade;
	int[]ungrade_chance= {
			90, 90, 80, 80, 80, 70, 70, 30, 30, 30, 
			15, 15, 15, 10, 10, 10, 10, 5, 5, 5};
	int[] attack_increment= {
			10, 30, 100, 150, 200, 300, 700, 700, 700, 700,
			1000, 1000, 1000, 1000, 1500, 1500, 2500, 2500, 3000, 3500
	};
	
	Weapon(){
		name = "��������";
		attack = 5;
		grade=0;
	}
	Weapon(int attack,String name){
		this.attack=attack;
		this.name=name;
		grade=0;
	}
	boolean upgrad() {
		int value=(int)(Math.random()*100);
		if (value< ungrade_chance[grade]){
			System.out.printf("\"%s %+d\" ��ȭ�� �����ϼ̽��ϴ�!\n",name,grade);
			grade++;
			return true;
		}else {
			System.out.println("��ȭ ����...");
			return false;
		}
	}
	
	void attack() {
		int damage=attack;
		for (int i=0; i<grade;++i) {
			damage+=attack_increment[i];
		}
		System.out.printf("\"%s %+d\"�� �ֵѷ����ϴ�. [������:%d]\n",
				name,grade,damage);
	}
	public static void main(String[] args) {
		// ��ü ������ ���� ���� �޼��尡 ���ο��� ��� ���� ������ �����ϸ鼭 ����� ���� ����
		Weapon gun = new Weapon(10,"�񴰹�� ��");
		
		for (int i=0;i<30;++i) {
			gun.upgrad();
			gun.attack();
		}
		
		//Weapon w = new Weapon();
		//System.out.println(w.ungrade_chance.length);
		//System.out.println(w.attack_increment.length);
		
	}
}

/*
class Weapon_type{
	int attack;
	int levelClass;
	int successRate;
	int attackIncrease;
	
	Weapon_type(int levelClass){
		this.attack = 10;
		this.levelClass=1;
		this.successRate=20;
		this.attackIncrease=3;
	}
	
	int success=(int)(Math.random()*101+successRate);
	boolean check = success==100;
	void upgrad() {
		if(levelClass>0) {
			if(check) {
				levelClass++;	
				successRate=successRate+10;
				attackIncrease++;
				System.out.printf("!!��ȭ����!!\n[��ȭ��� %d]\n[��ȭ�� %d%]\n[���ݷ� %d]\n"
						, levelClass, successRate, attackIncrease);
			}
			else {
				levelClass--;
				System.out.printf("��ȭ�� �����Ͽ� ��ȭ����� ���ҵ˴ϴ�\n[���� ��ȭ��� %d]\n",levelClass);
			}
			
		}
	}
	void attackState() {
		if(check) {
			System.out.printf("[���� ���ݷ��� : %d]\n",attack+attackIncrease);
		}
		else {
			System.out.printf("[���� ���ݷ��� : %d]\n",attack);
		}
	}

}*/