import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class E05_BufferedStream {

	/*
	 	# Buffered
	 	
	 	- 데이터를 일거나 쓸 때 한 글짜씩 스트림을 여러번 통과하는 것 보다
	 	  한번에 많은 양의 데이터를 최소한으로 통과하는 것이 성능상 유리하다
 	  	- 버퍼방식이 미리 구현된 클래스들은 앞에 Buffered라는 이름이 붙어 있다 
	*/
	
	public static void main(String[] args) {
		
		// byte 방식은모든 것들을 전송할 때 사용한다. (InputStream, OutputStream)
		try {
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream("files/d.txt"),2048);
			
			for(int i =0;i<1000;++i) {
				out.write("안녕하세요 반갑습니다.\n".getBytes());
			}
			
			// 버퍼가 가득차지않아도 강제로 내보내주는 기능을하는 것
			out.flush();
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//char 방식은 문자를 편리하게 전송할 때 사용한다 (Reader, Writer)
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter("files/e.txt",Charset.forName("MS949")),2048);
			
			for(int i=0;i<1000;++i) {
				out.write("안녕하세요 반갑습니다.\n");				
			}
				out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("다 썻습니다.");
		
		// try_catch의 AutoClose
		try(BufferedReader in = new BufferedReader(new FileReader(
				"files/e.txt",Charset.forName("MS949")),2048)){
			String line;
			while((line = in.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
