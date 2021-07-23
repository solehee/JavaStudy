package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.A06_HikariCP;
import jdbc.DBConnector;
import jdbc.model.Departments;
import jdbc.model.Employees;

public class A07_DataJoinModel {

	/*
	  	employees와 department를 조인한 조회한 결과를 알맞은 모델에 담아보세요.
	*/
	
	public static void main(String[] args) {
		String sql = "SELECT e.*, d.*, e.manager_id AS mid1, d.manager_id AS mid2 "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id = d.department_id";
		
		ArrayList<Employees> employee_list = new ArrayList<>();
		try(
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			
			ResultSetMetaData meta = rs.getMetaData();
			for(int i=1, len=meta.getColumnCount(); i<=len;++i) {
				System.out.println(meta.getColumnLabel(i));
			}
				
			while(rs.next()) {
				employee_list.add(new Employees(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getDouble("salary"),
						rs.getDouble("commission_pct"),
						rs.getInt("mid1"),
						rs.getInt("department_id"),
						new Departments(
								rs.getInt("department_id"),
								rs.getString("department_name"),
								rs.getInt("mid2"),
								rs.getInt("location_id")
								)
						));
			}
			System.out.println("잘 꺼냄");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(employee_list);
		/*String sql = "SELECT * FROM employees "
				+ "INNER JOIN departments USING ( department_id )";
		
		ArrayList<Employees> list = new ArrayList<>();
		
		try(
			Connection conn = A06_HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			
			ResultSetMetaData meta = rs.getMetaData();
			
			while(rs.next()) {
				list.add(new Employees(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getInt("salary"),
						rs.getInt("department_id"),
						rs.getString("department_name")
						));
			}
			System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
	}
}
