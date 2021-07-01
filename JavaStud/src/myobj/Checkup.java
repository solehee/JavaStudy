package myobj;

public class Checkup {
public static void main(String[] args) {
	System.out.println(Hospital.adult_average_heart_rate);
}
}

class Hospital {
	String name;
	String gender;
	static int adult_average_heart_rate = 80;
	static int max_blood_pressure = 120;
	static double man_average_red_blood_cell = 5.25;
	static double woman_average_red_blood_cell = 5.20;
	int weight;
	int height;
	
}

class YellowGomJelly{
	static int score=150;
	int x;
	int y;
}
class PinkGomJelly{
	static int score=300;
	int x;
	int y;
}
class Marine{
	static int attack=5;
	int hp;
}
class TaxDriver{
	static final int MAX_DRIVER_COUNT = 300;
	static int current_driver_count;
	String name;
}