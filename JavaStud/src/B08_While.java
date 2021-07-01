
public class B08_While {
/*
 		# While
 		- for 문과 사용법이 약간 다른 반복문
 		- 초기값과 증가값의 위치가 정해져 있지 않다
 		- ()안의 조건이 참인 동안 {}안의 내용을 반복한다
 		- 증가값의 위치에 따라 프로그램 실행이 달라질 수 있으므로 주의해야 한다
 */
	public static void main(String[] args) {
		
		// while 문은 증가값의 위치에 따라 결과가 달라질 수 있다
		int i = 0;
		
		// 1 ~ 10 : 10개
		// 0 ~ 9 : 10개
		// 1 ~ 9 : 9개 while (++i) 일 경우 사용하지않음
		while (i++ <10) {
			System.out.println(i);
			
		}
		
		// while 문에서도 break 와 continue를 사용할 수 있다
		i = 0;
		
		while (true) {
			System.out.println(++i);
			
			if (i==140) {
				break;
			}
		}
	}
}
