package quiz;
import java.util.Scanner;

public class B03_MonthToSeason {
 /*
   ����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
   (switch-case ���� ����� ��)
    
 */
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int month;
		String season;
		
		System.out.print("�� ��? > ");
		month = sc.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			season = "�ܿ�";
			//System.out.printf("�Է��� ���� %d�� �ܿ� �Դϴ�.\n",month);
			break;
		case 3: case 4: case 5:
			season= "��";
			//System.out.printf("�Է��� ���� %d�� �� �Դϴ�.\n",month);
			break;
		case 6: case 7: case 8:
			season="����";
			//System.out.printf("�Է��� ���� %d�� ���� �Դϴ�.",month);
			break;
		case 9: case 10: case 11:
			season="����";
			//System.out.printf("�Է��� ���� %d�� ���� �Դϴ�.",month);
			break;
		default:
			season="����";
			//System.out.println("�ùٸ��� ���� ���Դϴ�");
			break;
		}
		if(month < 1 || month > 12) {
			System.out.println("�߸��� �����Դϴ�.");
		}
		else {
			System.out.printf("%d���� %s�Դϴ�.\n",month,season);		
		}
	}
}
