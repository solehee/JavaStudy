package myobj.school;

abstract class Student_ {
	final static int MAX_SCORE=100;
	static String[] LastNameArray= {
			"��","��","��","��","��","��","��","��",
			"��","����","����", "��","��", "��","��","��","��",
			"��","��","��","��","��","����"};
	static String[] firstNameArray= {
		"��ȯ","�Ǽ�","����","����","õ��","�ҿ�","��ö","�¸�"
		,"����","�¹�","����","����","��ȣ","�ѳ�","����","�ν�"};
	static String gennerateRandomName() {
		return LastNameArray[(int)(Math.random()*LastNameArray.length)]+
				firstNameArray[(int)(Math.random()*firstNameArray.length)];
	}
		static int generateRandomScore() {
			return(int)(Math.random()*101);
		}
		String name;
		int kor;
		int eng;
		
		public Student_() {
			name= gennerateRandomName();
			kor=generateRandomScore();
			eng=generateRandomScore();
		}
		abstract public void printGradeCard(); 
			
		public String getName() {
			return name;
		}
	
}
