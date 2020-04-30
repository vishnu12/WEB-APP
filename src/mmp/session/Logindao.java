package mmp.session;
import java.sql.*;
public class Logindao {
	
	private String uname;
	private String pass;
	private boolean k=false;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public boolean validate(String uname,String pass) {
		
		this.uname=uname;
		this.pass=pass;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
		    ps=con.prepareStatement("select uname,password from register where uname=? and password=?");
		    ps.setString(1, uname);
		    ps.setString(2, pass);
		    rs=ps.executeQuery();
		    if(rs.next()) {
		    	
		    	k=true;
		    }
		    
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return k;
	}

}
