package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	/*
	 	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ��������.
	 	(�ٸ� Ÿ���� ���� �ԷµǾ ���α׷��� ���� ���� ���� �ʾƾ��մϴ�)
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ���ɳʿ��� �߸��� �Է��� �ϸ� ��Ⱑ �����ְ� �ȴ�
		
		while(true) {
			try {
			System.out.println("�߸��� �Է��Դϴ�");
			System.out.print("���� >> ");
			int a = sc.nextInt();
			System.out.println(a);
			System.out.println("����");
			break;
		}catch(InputMismatchException num) {
			System.out.println("����� �� ���ڷ� �ٽ� �Է����ּ���!");
			System.out.println("�߸� �Էµƴ� ��: "+sc.nextLine());
			// nextLine ���� ��⸦ ���ش�
			}
		}
	System.out.println("���α׷� ����!");	
	}
}
