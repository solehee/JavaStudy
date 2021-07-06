package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11_Car5Day {
	/*
	 	2018년 9월 1일 부터 적용되게
	 	랜텀차량번호를 만들어서(랜덤함수)
	 	오늘 요일을 넣고 차량번호가 걸리는지 안걸리는지 확인
	 	공휴일 배열로 빼야됨(설날, 추석은 제외 / 날짜 변하는 공휴일(음력)) 
	 	제외차량 / 장애인, 유아동승, 경차등은 제외하게 
	*/
		static Calendar event = Calendar.getInstance();
		static String[] except =  {"해당없음", "장애인", "유아동승", "경차"};
	
	public static void main(String[] args) {		
		//랜덤
		int carNumber =(int)(Math.random()*9); 
		int index = (int)(Math.random()*4);

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[ex/ 월요일]");
		System.out.print("요일을 입력해주세요 > ");
		String day = sc.nextLine(); 
		
		// 주차 시점 날짜 
		
		//요일 형식 맞는 지 체크
		boolean check = Pattern.matches("[월|화|수|목|금]?요일", day);
		while(check) {
			if(index==0) {
				checkCar(carNumber,day);
				break;
			}else if(index!=0) {
				System.out.println("제외차량입니다.");
				System.out.println(except[index]+" 차량 끝번호 : "+carNumber);
				break;
			}
		}
		
	}
	
	/* 캘린더 
	public static void calendarSet(int year, int month, int date) {
		if(year>2018 && date!=0) {
			event.set(year,month,date);			
		}else if(year==2018 
				&& month>=8 &&date!=0) {
			event.set(year, month,date);
		}else {
			System.out.println("정책이 시행되기 전입니다.");
		}
		
	}*/
	

	
	// 요일별 번호 체크
	public static void checkCar(int carNumber, String day) {
		// 20180901 이후 부터로 세팅
		event.set(2018, 8, 1);
		while(hoilDay()) {
			
				if(day.equals("목요일")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
					if(carNumber==4||carNumber==9) {
						System.out.println("출입 제한 / 본인차량번호 :"+carNumber);
					}
				}else if(day.equals("월요일")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
					if(carNumber==1||carNumber==6) {
						System.out.println("출입 제한 / 본인차량번호 :"+carNumber);
					}
				}else if(day.equals("화요일")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
					if(carNumber==2||carNumber==7) {
						System.out.println("출입 제한 / 본인차량번호 :"+carNumber);
					}
				}else if(day.equals("수요일")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
					if(carNumber==3||carNumber==8) {
						System.out.println("출입 제한 / 본인차량번호 :"+carNumber);
					}
				}else if(day.equals("금요일")) {
				event.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
					if(carNumber==5||carNumber==0) {
						System.out.println("출입 제한 / 본인차량번호 :"+carNumber);
						}
				}else{
				System.out.println("주차가능한 차량입니다 / 본인차량번호 : "+carNumber);
				break;
			}
		}
			
	}
	
	// 공휴일 세팅
	public static boolean hoilDay() {
				
		int month = event.get(Calendar.MONTH);
		int date = event.get(Calendar.DATE);
		
		if(month==1&&date==1) {
			System.out.println("양력설");
			return false;
		}else if(month==3&&date==1) {
			System.out.println("삼일절");
			return false;
		}else if(month==5&&date==5) {
			System.out.println("어린이날");
			return false;
		}else if(month==6&&date==6) {
			System.out.println("현충일");
			return false;
		}else if(month==8&&date==15) {
			System.out.println("광복절");
			return false;
		}else if(month==10&&date==3) {
			System.out.println("개천절");
			return false;
		}else if(month==12&&date==25) {
			System.out.println("크리스마스");
			return false;
		}
		return true;
		}
	
}