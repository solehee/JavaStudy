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
		행만을 만들어보세요
		1. 어떤 단어가 답인경우 해당 단어의 길이만큼 _를 출력해준다.
		ex) apple이 답인 경우 _ _ _ _ _를 출력
		
		2. 사용자가 알파벳을 하나씩 입력하면 해당 알파벳이 포함되어 있다면 _를 알파벳으로 바꾼다
		ex) 사용자가 p를 입력했다면 _ p p _ _를 출력
		
		3. 사용자가 모든 _를 제거하면 몇 번만에 맞췄는지 출력해주세요
		
		4. 정답 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요
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
		System.out.println("입력 > ");
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
				System.out.print("입력");
				user = sc.nextLine();
			}
		System.out.println(count+"번 도전");
	}
	
}
