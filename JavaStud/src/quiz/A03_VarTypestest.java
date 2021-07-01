package quiz;

public class A03_VarTypestest {

	public static void main (String[] args) {

		// byte타입은 데이터 전송시에 사용하는 경우가 대부분이다.
		// 숫자 범위가 작다고해서 byte타입을 사용하지 않는다
		int _age = 20;
		double _height = 178.5;
		double _weight = 75;
		String banner = "==========출력 결과==========";
		String name = "홍길동";
		String tel = "010-1234-1234";
		String bloodtype = "O";
		boolean exercise = true;
		boolean swimming = false;

		System.out.println(banner +"\n");
		System.out.println("이름\t: "+ name);
		System.out.println("나이\t: "+ _age);
		System.out.println("Tel\t: "+ tel);
		System.out.println("키\t: " + _height);
		System.out.println("몸무게\t: " + _weight);
		System.out.println("혈액형\t: "+bloodtype);
		System.out.println("운동여부\t: "+exercise);
		System.out.println("운동종류\t: 수영 "+swimming);
	}
	
}
