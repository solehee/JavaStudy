package gui.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HangMan {
	/*
		�ุ�� ��������
		1. � �ܾ ���ΰ�� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
		ex) apple�� ���� ��� _ _ _ _ _�� ���
		
		2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϸ� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�
		ex) ����ڰ� p�� �Է��ߴٸ� _ p p _ _�� ���
		
		3. ����ڰ� ��� _�� �����ϸ� �� ������ ������� ������ּ���
		
		4. ���� �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���
	*/
	static String url ="./files/word.txt";
	static Random ran = new Random();	
	static ArrayList<Character> blank = new ArrayList<>();
	static ArrayList<Character> words = new ArrayList<>();
	
	private static void word_len(String read_file) {
		for(int i=0, len=read_file.length();i<len;++i) {
			blank.add('_');
			words.add(read_file.charAt(i));
		}	
	}
	
	public static String read_file(String file) {
		ArrayList<String> read = new ArrayList<>();
		File target = new File(file);
		
		try (
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
			){
			String line;
			for(int i=0;(line=in.readLine())!=null;++i) {
				read.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int index = ran.nextInt(read.size());
		
		String word = read.get(index);
		return word;
	}
	public static void main(String[] args) {	
		word_len(read_file(url));
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� > ");
		String user = sc.nextLine();
		
		System.out.println(blank);
		
		while(!blank.equals(words)) {
			for(int i=0;i<user.length();++i) {
				for(int j=0;j<user.length();++j) {
					boolean alpha = user.charAt(i)==words.get(j);					
				if(alpha) {
					++count;
					blank.remove(j);
					blank.add(j, user.charAt(i));
						}
					}
				}
				System.out.println(blank);					
				System.out.print("�Է�");
				user = sc.nextLine();
			}
		System.out.println(count+"�� ����");
	}
	
}
