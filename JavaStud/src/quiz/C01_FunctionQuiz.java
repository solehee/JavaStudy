package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
/*
	 # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 
	   1. 전달한 문자가 알파벳이면 true를 변환, 아니면 false를 반환하는 함수
	   
	   2. 전달한 숫자가 3의 배수이면 true를 변환, 아니면 false를 반환하는 함수
	   
	   3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	   
	   4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	   
	   5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	   
	   6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	   factorial: (n)*(n-1)*(n-2)...3*2*1
*/
public static boolean isAlphabet(char ch) {
	return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
}

public static boolean inMul3(int num) {
	return num%3==0;
}

public static String evenOdd(int num) {
	return num%2==0? "짝수 입니다.":"홀수입니다.";
}
public static int [] allYaksu(int num) {
	//50인 경우 boolean 타입 변수 50개 생성
	boolean[] divided = new boolean[num];
	int count=0;
	for (int i=1;i<=num;++i) {
		if(num%i==0) {
			divided[i-1]=true;//배열에 나누어 떨어진 숫자들을 표시해 놓음
			count++;
		}
	}
	int [] yaksu=new int[count];
	int index=0;
	
	for (int i = 0; i<num;++i) {
		if (divided[i]) {
			yaksu[index++]=i+1;
		}
	}

	return yaksu;
}
public static boolean isPrime(int num) {
	if (num<2) {
		return false;
	}
	else if (num==2) {
		return true;
	}
	else if(num%2==0) {
		return false;
	}
	for(int i=3;i<=Math.sqrt(num);i+=2) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
public static int factorial(int num) {
	// 곱하기를 누적 시킬때는 초기값을 1로 준다
	int factorial=1;
	
	for(int i=num;i>0;--i) {
		factorial*=i;
	}
	return factorial;
}
	//어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다
	//(성능 안좋음, 겉멋, 쓰지말것)
public static int recursive_factorial(int num) {
	if(num==1) {
		return 1;
	}
	return num*recursive_factorial(num-1);
}

public static void main(String[] args) {
	System.out.println(isPrime(999));
	System.out.println(factorial(5));
	/*String str = "한글 Hanguel";
	
	for (int i = 0; i<str.length();++i) {
		char ch=str.charAt(i);
		
	 if(isAlphabet(ch)) {
		 System.out.println(i+"번째 문자는 영어 입니다.");
	 }
	 else {
		 System.out.println(i+"번째 문자는 영어가 아닙니다.");
	 }
	}*/
}
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자입력 > ");
		String word = sc.nextLine();
		checkAlphabet(word);
		
		System.out.println("숫자입력 > ");
		int num = sc.nextInt();
		checkNumber(num);
		oddEvenNumber(num);
		divisorArray(num);
		prime(num);
		factorial(num);
	}
	
	public static void checkAlphabet(char ch) {
		char letter = ch.charAt(ch.length());
		boolean alphabet= (letter>='a'&&letter<='z')||
				(letter>='A'&&letter<='Z');
		if (alphabet==true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	public static int checkNumber(int num) {
		if (num%3==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		return num;
	}
	
	public static int oddEvenNumber(int num) {
		if (num%1==0) {
			System.out.println("홀수입니다");
		}
		else if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		return num;
	}
	
	public static int divisorArray(int num) {
		int[] count=null;
		
		for(int i=2;1<=num;++i) {
			if(num%i==0) {
				count[i]++;
			}
			System.out.println(count[i]);
		}
		return num;
	}
	
	public static int prime(int num) {		
		for (int i= 2; i <= num; ++i){
		int count=0;
		boolean prime = true;
		for(int j=2;j<=Math.sqrt(i);++j) {
		if(i%j==0) {
		System.out.println(false);
		}
		else {
			System.out.println(true);			
			}
		}
		}
		return num;
	}
	
	public static int factorial(int num) {
		int cal=1;
		for (int i=0;i<=num;--i) {
			cal*=i;
		}
		return num;
	}*/
}
