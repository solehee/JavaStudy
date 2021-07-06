package quiz;


import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;


public class D11_DiscountDay {
	
	/*
	 	� �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������.
	*/
	
	
	public static void main(String[] args) {		
		int year = 2021;
		printEventOfYear(year);

	}
	
	public static Calendar getFirstEventDay(int year) {
		Calendar event = Calendar.getInstance();
		event.set(year,0,1);
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
	//while (event.get(Calendar.DAY_OF_MONTH)!= Calendar.THURSDAY) {
	//	event.add(Calendar.DATE, 1);
		
		if(event.get(Calendar.YEAR)!=year) {
			event.add(Calendar.DATE, 7);
		}
		
		
		return event;
	}
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = 
				new SimpleDateFormat("[y�� �̺�Ʈ] M�� d��\tE����");
		Calendar event = getFirstEventDay(year);
		
		//event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		//event.set(Calendar.YEAR,year);
		//event.set(Calendar.MONTH,0);
		
		int count = 0;
		
		while(event.get(Calendar.YEAR)==year) {
			event.add(Calendar.DATE, 7);
			
			if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH)%2 == 0) {				
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
			System.out.println("������ �̹�Ʈ�� �� "+count+" ȸ �Դϴ�.");
		}
	}
		
		/*
		int year = 2021;
		Calendar sale = Calendar.getInstance();
		sale.set(Calendar.YEAR, year);
		while(year==sale.get(Calendar.YEAR)) {
		for(int i=1;i<=12;) {
			sale.set(Calendar.MONTH, i);
			i++;
				for(int j = 1;j<=31;j++) {
					sale.set(Calendar.DATE, j);
					if(sale.get(Calendar.DAY_OF_WEEK)==5 &&
							sale.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2
							||sale.get(Calendar.DAY_OF_WEEK_IN_MONTH)==4){
					System.out.println(saleDay(sale));
					}
				}
			}
	}
	}
	public static String saleDay(Calendar sale) {
		SimpleDateFormat current = new SimpleDateFormat(
		"yyyy�� MM�� dd�� / EEEEEE");
		return current.format(sale.getTime());
	}*/
	
}
