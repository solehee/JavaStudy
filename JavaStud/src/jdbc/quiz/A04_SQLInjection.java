package jdbc.quiz;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A04_SQLInjection {
	// Coffee ���̺� SQL Injection ������ �������Ѻ�����.
	// (�Ϻη� ? �� ������� �ʾƾ� ��)
	
	// ���α׷��� ���� ������ ���ϴ� ���ݴ��� Ŀ�Ǹ� ��ȸ�ϴ� ����Դϴ�
	// ���α׷��� ���� ������ ����ڰ� ���ϴ� id�� Ŀ�Ǹ� �����ϴ� �����̿��� ����                                                                          
	 
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
