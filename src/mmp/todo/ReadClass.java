package mmp.todo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadClass {
	
	public Connection con;
	public PreparedStatement ps;
	public ResultSet rs;
	
	public List<Read_bean> readValues() {
		
		List<Read_bean> al=new ArrayList<Read_bean>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
			ps=con.prepareStatement("select * from todo");
			rs=ps.executeQuery();
			while(rs.next()) {
				
				Read_bean rd=new Read_bean();
				rd.setId(rs.getInt(1));
				rd.setTitle(rs.getString(2));
				rd.setDesc(rs.getString(3));
				rd.setStat(rs.getString(4));
				rd.setDate(rs.getString(5));
				al.add(rd);
			}
			
			ps.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	
	public List<Read_bean> getValuesById(int id) {
		
		List<Read_bean> al2=new ArrayList<Read_bean>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
			ps=con.prepareStatement("select * from todo where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Read_bean rd2=new Read_bean();
				rd2.setId(id);
				rd2.setTitle(rs.getString(2));
				rd2.setDesc(rs.getString(3));
				rd2.setStat(rs.getString(4));
				rd2.setDate(rs.getString(5));
				
				
				
				al2.add(rd2);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al2;
	}


public void deleteValues(int id) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
	ps=con.prepareStatement("delete from todo where id=?");
	ps.setInt(1, id);
	ps.executeUpdate();
	
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


}
