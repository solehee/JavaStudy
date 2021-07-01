package quiz;

public class B07_Gugudan {
	public static void main(String[] args) {
	for (int dan=2;dan<=9;++dan) {
		System.out.printf("%d단 : ",dan);
		for (int i=1;i<=9;++i) {
		System.out.printf("%dx%s=%02d",dan,i,dan*i);
		if (i>=9) {
			System.out.println();
		}
	  }
	}	
	System.out.println("2. 문제"); 
	
	for(int line=0; line<10;++line) {
		for (int i=2;i<=9;++i) {
			if (line == 0) {
				System.out.printf("%d단\t", i);
			}
			else {
				System.out.printf("%dx%d=%d\t",i,line,i*line);
			}		
		}
		System.out.println();
   }
  }
}
