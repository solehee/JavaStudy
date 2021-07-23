package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A05_MetaDate {
	
	public static void main(String[] args) {
		
		// SELECT문으로 가져온 ResulSet에서 ResultSetMetaData를 얻을 수 있고
		// ResultSetMetaData 클래스로 가져온 데이터들의 메타데이터를 볼 수 있다.
		
		String sql1 = "SELECT * FROM employees";
		String sql2 = "SELECT * FROM coffee";
		
		try(
			 Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				ResultSet rs1 = pstmt1.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
				
				){
				ResultSetMetaData meta1 = rs1.getMetaData();
				
				System.out.println("Employees 테이블의 정보");
				System.out.println("컬럼의 개수: "+meta1.getColumnCount() 
				+ "개");
				
				int MAX_COLUMN = meta1.getColumnCount();
				
				for(int col=1; col <= MAX_COLUMN; ++col) {
					System.out.printf("%-20s%-14s%25s%s\n", 
							meta1.getColumnName(col),
							meta1.getColumnTypeName(col),
							meta1.getColumnClassName(col),
							meta1.getColumnLabel(col)
							);
				}
				
				// 연습문제 : meta2도 출력해보세요
				System.out.println();
				ResultSetMetaData meta2 = rs2.getMetaData();
				System.out.println("coffee 테이블의 정보");
				System.out.println("컬럼의 개수: "+meta2.getColumnCount()+"개");
				
				int MAX_COLUMN2 = meta2.getColumnCount();
				for(int column=1; column <= MAX_COLUMN2; ++column) {
					System.out.printf("%-20s%-14s%25s\n", 
							meta2.getColumnName(column),
							meta2.getColumnTypeName(column),
							meta2.getColumnClassName(column)
							);
				}
				
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
