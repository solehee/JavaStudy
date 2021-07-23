package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	/*
	 	# 사용자로부터 문자열을 입력받으면 해당 문자열이 이름에 포함된
	 	모든 사원을 조회해보세요
	  
	 */
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 이름 입력");
		String name = sc.nextLine();
		String upper = name.toUpperCase();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 라이브러리를 찾을 수 없음");
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
					);
			
			String sql = "SELECT * "
			+"FROM employees WHERE first_name LIKE '%"+name  
			+"%' OR first_name LIKE '%" + upper.charAt(0)+
			name.charAt(1)+"%'";
			
			PreparedStatement pstmt =
			conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%-5d%-10s%-10s%-10s%-10d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("email"),
						rs.getString("job_id"),
						rs.getInt("salary")
						);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("getConnection 하다가 문제 생김");
			e.printStackTrace();
		}
		

		System.out.println("main 끝");
	}
}
