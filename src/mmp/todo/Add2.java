package mmp.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;





public class Add2 {
private boolean b;
private Connection con;
private PreparedStatement ps;
private ResultSet rs;
	public boolean addNew(Addclass ad) {
		
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
			    ps=con.prepareStatement("insert into todo(title,description,status,date) values(?,?,?,?)");
			    ps.setString(1, ad.getTitle());
			    ps.setString(2, ad.getDesc());
			    ps.setString(3, ad.getStat());
			    ps.setString(4, ad.getDate());
			    int k=ps.executeUpdate();
			    if(k==1) {
			    	
			    	b=true;
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
			
			return b;
			
		}
		
		
	
}
