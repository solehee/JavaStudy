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
	 	
	 	- �����͸� �ϰų� �� �� �� ��¥�� ��Ʈ���� ������ ����ϴ� �� ����
	 	  �ѹ��� ���� ���� �����͸� �ּ������� ����ϴ� ���� ���ɻ� �����ϴ�
 	  	- ���۹���� �̸� ������ Ŭ�������� �տ� Buffered��� �̸��� �پ� �ִ� 
	*/
	
	public static void main(String[] args) {
		
		// byte �������� �͵��� ������ �� ����Ѵ�. (InputStream, OutputStream)
		try {
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream("files/d.txt"),2048);
			
			for(int i =0;i<1000;++i) {
				out.write("�ȳ��ϼ��� �ݰ����ϴ�.\n".getBytes());
			}
			
			// ���۰� ���������ʾƵ� ������ �������ִ� ������ϴ� ��
			out.flush();
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//char ����� ���ڸ� ���ϰ� ������ �� ����Ѵ� (Reader, Writer)
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter("files/e.txt",Charset.forName("MS949")),2048);
			
			for(int i=0;i<1000;++i) {
				out.write("�ȳ��ϼ��� �ݰ����ϴ�.\n");				
			}
				out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�� �����ϴ�.");
		
		// try_catch�� AutoClose
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
