package myobj;

public class Weapon {
	/*
	 	무기의 속성
	 	- 공격력
	 	- 현재 강화 등급
	 	- 레벨별 강화 확률 (등급마다 강화 확률이 다름) < if문으로
	 	- 레벨별 공격력 증가폭 < for 조건문
	 	
	 	무기의 메서드
	 	- 강화하기
	 	  레벨별 강화 확률에 따라 강화가 성공하거나 실패한다(랜덤) 
	 	  < 랜덤함수 쓰기(레벨별로 시작하는 숫자를 다르게 해서 퍼센트 조절)
	 	  성공하면 강화 등급이 1 증가한다 < if문으로 
	 	  실패하면 강화 등급이 그대로 유지된다(원한다면 떨어뜨려도 좋음)
	 	  
 	   - 공격하기
 	   	 공격력을 확인할 수 있다
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
		name = "나뭇가지";
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
			System.out.printf("\"%s %+d\" 강화에 성공하셨습니다!\n",name,grade);
			grade++;
			return true;
		}else {
			System.out.println("강화 실패...");
			return false;
		}
	}
	
	void attack() {
		int damage=attack;
		for (int i=0; i<grade;++i) {
			damage+=attack_increment[i];
		}
		System.out.printf("\"%s %+d\"를 휘둘렀습니다. [데미지:%d]\n",
				name,grade,damage);
	}
	public static void main(String[] args) {
		// 객체 지향은 내가 만드 메서드가 메인에서 어떻게 갖다 쓰일지 생각하면서 만드는 것이 좋다
		Weapon gun = new Weapon(10,"비눗방울 총");
		
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
				System.out.printf("!!강화성공!!\n[강화등급 %d]\n[강화율 %d%]\n[공격력 %d]\n"
						, levelClass, successRate, attackIncrease);
			}
			else {
				levelClass--;
				System.out.printf("강화에 실패하여 강화등급이 감소됩니다\n[현재 강화등급 %d]\n",levelClass);
			}
			
		}
	}
	void attackState() {
		if(check) {
			System.out.printf("[현재 공격력은 : %d]\n",attack+attackIncrease);
		}
		else {
			System.out.printf("[현재 공격력은 : %d]\n",attack);
		}
	}

}*/