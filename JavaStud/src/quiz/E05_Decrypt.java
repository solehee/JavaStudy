package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Decrypt {
	/*
	 	����ڷκ��� ���ϸ�� ���谪�� �Է¹�����
	 	�ش� ���谪���� ��ȣȭ �� ������� �����ϴ� ���α׷��� ��������
	 	
	 	test. ��ȣȭ�Ǿ��ִ� frankenstein_encrypted.txt�� ��ȣȭ �غ�����
	 	
	*/
	public static void main(String[] args) {
		
		E05_Decrypt key_num = new E05_Decrypt();
		
		try{
			File encrypted = new File("files/frankenstein_encrypted.txt");
			Charset charset=Charset.forName("UTF-8");
			FileReader in = new FileReader("files/frankenstein_encrypted.txt",charset);
			FileWriter out = new FileWriter(encrypted,charset);
					char[] read = new char[2048];
					int _byte = -1;
					while((_byte = in.read(read))!=-1) {
						if(_byte>='a'||_byte<='z'||_byte>='A'||_byte<='Z') {
							if(_byte!=26) {
								out.write(_byte-2);						
							}else {
								out.write(_byte+2);
							}
						}else if(_byte==' ') {
							out.write(_byte+"\n");					
						}else {
							out.write(_byte);
						}
					}
					System.out.println();
					out.close();		
					in.close();
				} catch (IOException e) {
						e.printStackTrace();
					}
	}
	
	
}
