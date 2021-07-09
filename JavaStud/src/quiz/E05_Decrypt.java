package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Decrypt {
	/*
	 	사용자로부터 파일명과 열쇠값을 입력받으면
	 	해당 열쇠값으로 복호화 한 결과물을 생성하는 프로그램을 만들어보세요
	 	
	 	test. 암호화되어있는 frankenstein_encrypted.txt를 복호화 해보세요
	 	
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
