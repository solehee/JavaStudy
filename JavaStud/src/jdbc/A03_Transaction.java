package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class A03_Transaction {
	
	public static void main(String[] args) {
	
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "hr";
		String password = "1234";
		
		String sql1 = "UPDATE coffee SET price=price-100";
		String sql2 = "SELECT count(*) AS m_count FROM coffee "
				+ "WHERE price <0";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = 
					DriverManager.getConnection(url,user,password);
			
			// AutoCommit�� ���� ���� Ʈ������� ������ �� �ִ�
			conn.setAutoCommit(false);
			
			// ù ���� �������� �غ���
			PreparedStatement pstmt =
					conn.prepareStatement(sql1);
			
			// ù ��° �������� UPDATE���̱� ������ executeUpdate()�� �����ϸ�
			// �� ���̳� ���ߴ��� ���� ������ �˷���
			int update_rows = pstmt.executeUpdate();
			
			if(update_rows ==0) {
				pstmt.close();
				conn.close();
				return;//�޼��� ����
			}else {
				System.out.println(update_rows+"row(s) changed.");
			}
			
			// �� ��° �������� �غ���
			PreparedStatement pstmt2 =
					conn.prepareStatement(sql2);
			
			// �� ��° �������� SELECT���̱� ������ executeQuery()�� �����ϸ�
			// SELECT ����� ResultSet���� ��ȯ��.
			ResultSet rs = pstmt2.executeQuery();
			
			// rs.next()�� ���� ���� ���� �ִ��� üũ�� �� ���� ���� �ִٸ�
			// Ŀ���� �������� �ű�� �޼���
			rs.next();
			
			// �׷� �Լ��� ������ �������̱� ����� �� �ุ ���ð��� ���ϱ� ������
			// �ݺ����� ���� ������� �ʾҴ�
			int minus_rows = rs.getInt("m_count");
			// int minus_rows = rs.getInt("1"); ���� �̾߱�
			
			if(minus_rows >0) {
				System.out.println("������ �� ������ �־ ��� �۾��� ����մϴ�.");
				conn.rollback();
			}else {
				System.out.println("������ �� ������ ��� �۾��� Ȯ�������ϴ�.");
				conn.commit();
			}
			
			rs.close();
			pstmt2.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
