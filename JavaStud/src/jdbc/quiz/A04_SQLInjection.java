package jdbc.quiz;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A04_SQLInjection {
	// Coffee 테이블에 SQL Injection 공격을 성공시켜보세요.
	// (일부러 ? 를 사용하지 않아야 함)
	
	// 프로그램의 원래 동작은 원하는 가격대의 커피를 조회하는 기능입니다
	// 프로그램의 원래 동작은 사용자가 원하는 id의 커피를 삭제하는 동작이였음 가능                                                                          
	 
	public static void main(String[] args) {                                    

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "hr";
		String password = "1234";
		String driverName = "oracle.jdbc.driver.OracleDriver";
        
		// DELETE FROM coffee WHERE id=1 OR 1=1                               
		
		String id ="3 OR 1=1";
		String sql = "DELETE FROM coffee WHERE id="+id;
		                                                                        
		try {                                                                  
			Class.forName(driverName);                                         
		} catch (ClassNotFoundException e) {                                   
			e.printStackTrace();                                               
		}                                                                      
		try(                                                                    
			 Connection conn = DriverManager.getConnection(url,user,password);  
				PreparedStatement pstmt = conn.prepareStatement(sql);           
		){                                                                             
			                                  
			java.sql.Statement statement = conn.createStatement();
			int rows = statement.executeUpdate(sql);
			
			System.out.println("done.");
			// pstmt.executeUpdate();  
			
		} catch (SQLException e) {                                              
			e.printStackTrace();                                                
		}                                                                       
	}                                                                           
	                                                                            
}
