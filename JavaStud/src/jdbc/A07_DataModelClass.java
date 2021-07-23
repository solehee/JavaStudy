package jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zaxxer.hikari.HikariConfig;

import jdbc.model.Coffee;

public class A07_DataModelClass {
	 
	public static void main(String[] args) {
		// DB���� ������ �����ʹ� ������ �� Ŭ������ �־� �δ� ���� ����.
		
		// A06_HikariCP�� ������ ���� ���� �� �ִ�
		// getConnection() �޼��带 ������ �� coffee ���̺��� ���� �ֿܼ� ��� ����غ�����
		String sql = "SELECT * FROM coffee";
		
		// ������ Ŭ������ ���׸����� Ȱ���� �پ��� �÷����� ���� �̿��� �� �ִ�.
		ArrayList<Coffee> list = new ArrayList<>();
		
		try(
			Connection conn = A06_HikariCP.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			
			ResultSetMetaData meta = rs.getMetaData();
			
			//1. �켱 �÷� �̸����� ã�´�.
			//Class<?> coffee_class= Class.forName("jdbc.model.Coffee");
			//coffee_class.getMethod("setName").invoke(coffee_class, null);
		
			while(rs.next()) {
				// 2. ������ Ŭ������ �÷��̸��� ��ġ�ϴ� �ʵ忡 ���� ä�� �ִ´�
				list.add(new Coffee(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("price")
						));
				}
				System.out.println(list);
			} catch (SQLException e){//| ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
	
	}
}
