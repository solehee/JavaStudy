package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
			 점수 입력 받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
			 90점 이상 : A
			 80점 이상 : B
			 70점 이상 : c
			 60점 이상 : D
			 그 외 : F
			 ※ 유효한 점수는 0~ 100점입니다. 
	 */
	public static void main(String[] args) {
		
		// ※ 입력을 받았을 때는 잘못된 값을 먼저 거르는 것이 좋다
		Scanner sc = new Scanner(System.in);
		char grade = 'Z';
		int score;
		
		
		System.out.print("점수를 입력해주세요 > ");
		score = sc. nextInt();
		
		if (score < 0 || score >100) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		else if(score >= 90) {
			grade= 'A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if (score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.printf("당신의 등급은 %c입니다\n", grade);
		
		/*double score;
		int grade;
		
		System.out.print("점수 입력 > ");
		score = sc.nextDouble();
		
		if (score <0 || score >=101 ) 
		{
			System.out.println("유효하지 않은 점수입니다");
			
		}
		else if(score>=90 && score <=100)
		{
			System.out.println("A");
		}
		else if(score >= 80 && score < 90)
		{
			System.out.println("B");
		}
		else if (score>=70 && score<80)
		{
			System.out.println("C");
		}
		else if (score >=60 && score <70)
		{
			System.out.println("D");
		}
		else if (score >=0 && score < 60)
		{
			System.out.println("F");
		}
			
		*/
	}
}
