package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11_Car5Day {
	/*
	 	2018�� 9�� 1�� ���� ����ǰ�
	 	����������ȣ�� ����(�����Լ�)
	 	���� ������ �ְ� ������ȣ�� �ɸ����� �Ȱɸ����� Ȯ��
	 	������ �迭�� ���ߵ�(����, �߼��� ���� / ��¥ ���ϴ� ������(����)) 
	 	�������� / �����, ���Ƶ���, �������� �����ϰ� 
	*/
		static Calendar event = Calendar.getInstance();
		static String[] except =  {"�ش����", "�����", "���Ƶ���", "����"};
	
	public static void main(String[] args) {		
		//����
		int carNumber =(int)(Math.random()*9); 
		int index = (int)(Math.random()*4);

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[ex/ ������]");
		System.out.print("������ �Է����ּ��� > ");
		String day = sc.nextLine(); 
		
		// ���� ���� ��¥ 
		
		//���� ���� �´� �� üũ
		boolean check = Pattern.matches("[��|ȭ|��|��|��]?����", day);
		while(check) {
			if(index==0) {
				checkCar(carNumber,day);
				break;
			}else if(index!=0) {
				System.out.println("���������Դϴ�.");
				System.out.println(except[index]+" ���� ����ȣ : "+carNumber);
				break;
			}
		}
		
	}
	
	/* Ķ���� 
	public static void calendarSet(int year, int month, int date) {
		if(year>2018 && date!=0) {
			event.set(year,month,date);			
		}else if(year==2018 
				&& month>=8 &&date!=0) {
			event.set(year, month,date);
		}else {
			System.out.println("��å�� ����Ǳ� ���Դϴ�.");
		}
		
	}*/
	

	
	// ���Ϻ� ��ȣ üũ
	public static void checkCar(int carNumber, String day) {
		// 20180901 ���� ���ͷ� ����
		event.set(2018, 8, 1);
		while(hoilDay()) {
			
				if(day.equals("�����")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
					if(carNumber==4||carNumber==9) {
						System.out.println("���� ���� / ����������ȣ :"+carNumber);
					}
				}else if(day.equals("������")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
					if(carNumber==1||carNumber==6) {
						System.out.println("���� ���� / ����������ȣ :"+carNumber);
					}
				}else if(day.equals("ȭ����")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
					if(carNumber==2||carNumber==7) {
						System.out.println("���� ���� / ����������ȣ :"+carNumber);
					}
				}else if(day.equals("������")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
					if(carNumber==3||carNumber==8) {
						System.out.println("���� ���� / ����������ȣ :"+carNumber);
					}
				}else if(day.equals("�ݿ���")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
					if(carNumber==5||carNumber==0) {
						System.out.println("���� ���� / ����������ȣ :"+carNumber);
						}
				}else{
				System.out.println("���������� �����Դϴ� / ����������ȣ : "+carNumber);
				break;
			}
		}
			
	}
	
	// ������ ����
	public static boolean hoilDay() {
				
		int month = event.get(Calendar.MONTH);
		int date = event.get(Calendar.DATE);
		
		if(month==1&&date==1) {
			System.out.println("��¼�");
			return false;
		}else if(month==3&&date==1) {
			System.out.println("������");
			return false;
		}else if(month==5&&date==5) {
			System.out.println("��̳�");
			return false;
		}else if(month==6&&date==6) {
			System.out.println("������");
			return false;
		}else if(month==8&&date==15) {
			System.out.println("������");
			return false;
		}else if(month==10&&date==3) {
			System.out.println("��õ��");
			return false;
		}else if(month==12&&date==25) {
			System.out.println("ũ��������");
			return false;
		}
		return true;
		}
	
}