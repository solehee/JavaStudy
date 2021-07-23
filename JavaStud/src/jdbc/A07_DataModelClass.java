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
		// DB에서 꺼내온 데이터는 데이터 모델 클래스에 넣어 두는 것이 좋다.
		
		// A06_HikariCP에 다음과 같이 사용될 수 있는
		// getConnection() 메서드를 구현한 후 coffee 테이블의 행을 콘솔에 모두 출력해보세요
		String sql = "SELECT * FROM coffee";
		
		// 데이터 클래스를 제네릭으로 활용해 다양한 컬랙션을 쉽게 이용할 수 있다.
		ArrayList<Coffee> list = new ArrayList<>();
		
		try(
			Connection conn = A06_HikariCP.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			
			ResultSetMetaData meta = rs.getMetaData();
			
			//1. 우선 컬럼 이름들을 찾는다.
			//Class<?> coffee_class= Class.forName("jdbc.model.Coffee");
			//coffee_class.getMethod("setName").invoke(coffee_class, null);
		
			while(rs.next()) {
				// 2. 데이터 클래스의 컬럼이름과 일치하는 필드에 값을 채워 넣는다
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
