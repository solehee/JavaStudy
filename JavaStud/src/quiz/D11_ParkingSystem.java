package quiz;

import java.time.LocalDate;
import java.util.ArrayList;

import myobj.Parking.Car;

public class D11_ParkingSystem {
	/*
		1. ���� 5���� ���ڸ� ��ȣ üũ(4�ڸ��� ����������) 
		
		2. �������� : 2018�� 9�� 1��
		
		3. ������
		
		4. ��������
	*/
	
	private static ArrayList<LocalDate> holidays = new ArrayList<>() {
		private static final long seralVersionUID = 1L;
		{
			this.add(LocalDate.of(2000, 1, 1));
			this.add(LocalDate.of(2000, 3, 1));
			this.add(LocalDate.of(2000, 5, 5));
			this.add(LocalDate.of(2000, 6, 6));
			this.add(LocalDate.of(2000, 8, 15));
			this.add(LocalDate.of(2000, 10, 3));
			this.add(LocalDate.of(2000, 10, 9));
			this.add(LocalDate.of(2000, 12, 25));
		}
		
	};
	
	private boolean checkHoliday(Car car) {
		LocalDate park_date = car.getPark_date();
		
		for(LocalDate holiday : holidays) {
			if(holiday.getDayOfMonth()== park_date.getDayOfMonth()
					&& holiday.getMonthValue() == park_date.getMonthValue()){
						return true;
					}
		}
		return false;
	}
	
	public static void main(String[] args) {
		D11_ParkingSystem parking = new D11_ParkingSystem();
		
		for(int i=0 ; i<100 ; ++i) {
			Car car = new Car();
			
			if(parking.checkHoliday(car)) {
				System.out.println(car.getPark_date()+"�� ������ �Դϴ�.");
			}else {
				System.out.println(car.getPark_date()+"�� �������� �ƴմϴ�.");
			}
		}
	}
}
