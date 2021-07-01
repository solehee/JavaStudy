package myobj.school;

public class ProgrammingStudent extends Student_{
// 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();
		math=generateRandomScore();
		pl=generateRandomScore();
		al=generateRandomScore();
		ds=generateRandomScore();
	}
	int getSum() {
		return (kor+eng+math+pl+al+ds);
	}
	double getAverage() {
		return getSum()/6.0;
	}
	
	public void printGradeCard() {
		System.out.println("┌───────────────────────────────────────────┐");
		System.out.printf("│  이름 : %s │ 총점 : %d │ 평균 : %.2f     │\n",name,getSum(),getAverage());
		System.out.println("│ 국어\t영어\t수학\tPL\tAL\tDS  │");
		System.out.println("│-------------------------------------------│");
		System.out.printf("│ %d\t%d\t%d\t%d\t%d\t%d  │\n",kor,eng,math,pl,al,ds);
		System.out.println("└───────────────────────────────────────────┘");
	}
}
