import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E02_FileInputStream {
	public static void main(String[] args) {
		try {
			//파일을 읽어들이는 통로
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			 InputStream.read() : 한 글자씩 읽어들인다. (한글이 깨진다)
			 InputStream.read(byte[]): 파일을 데이터를 byte[]의 크기만큼 읽어들인다.
			 InputStream.read(byte[]. start, end):...
			 
			 세 메서드 모두 더 이상 읽을 것이 없다면 -1을 반환한다
			*/
			
			
			byte[] buffer = new byte[16];
			
			// line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			int len = -1, count =0;
			while((len=in.read(buffer))!=-1){
				buffer[4] = (byte)count++;
				
			System.out.print(Arrays.toString(buffer));
			//System.out.printf("-- %d글자\n", len);
			}

			/* int ch = -1;
			while ((ch = in.read())!=-1){
			sysout((char)ch);
			}
			*/
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
