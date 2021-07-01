package quiz;

import java.util.Scanner;

public class C01_FunctionQuiz {
/*
	 # ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 
	   1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	   
	   2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	   
	   3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	   
	   4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	   
	   5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	   
	   6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	   factorial: (n)*(n-1)*(n-2)...3*2*1
*/
public static boolean isAlphabet(char ch) {
	return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
}

public static boolean inMul3(int num) {
	return num%3==0;
}

public static String evenOdd(int num) {
	return num%2==0? "¦�� �Դϴ�.":"Ȧ���Դϴ�.";
}
public static int [] allYaksu(int num) {
	//50�� ��� boolean Ÿ�� ���� 50�� ����
	boolean[] divided = new boolean[num];
	int count=0;
	for (int i=1;i<=num;++i) {
		if(num%i==0) {
			divided[i-1]=true;//�迭�� ������ ������ ���ڵ��� ǥ���� ����
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
	// ���ϱ⸦ ���� ��ų���� �ʱⰪ�� 1�� �ش�
	int factorial=1;
	
	for(int i=num;i>0;--i) {
		factorial*=i;
	}
	return factorial;
}
	//� �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ���
	//(���� ������, �Ѹ�, ��������)
public static int recursive_factorial(int num) {
	if(num==1) {
		return 1;
	}
	return num*recursive_factorial(num-1);
}

public static void main(String[] args) {
	System.out.println(isPrime(999));
	System.out.println(factorial(5));
	/*String str = "�ѱ� Hanguel";
	
	for (int i = 0; i<str.length();++i) {
		char ch=str.charAt(i);
		
	 if(isAlphabet(ch)) {
		 System.out.println(i+"��° ���ڴ� ���� �Դϴ�.");
	 }
	 else {
		 System.out.println(i+"��° ���ڴ� ��� �ƴմϴ�.");
	 }
	}*/
}
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է� > ");
		String word = sc.nextLine();
		checkAlphabet(word);
		
		System.out.println("�����Է� > ");
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
			System.out.println("Ȧ���Դϴ�");
		}
		else if(num%2==0) {
			System.out.println("¦���Դϴ�.");
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
