package mmp.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Registerdao {
	
	private String fname;
	private String lname;
	private String uname;
	private String pass;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Registerdao(String fname,String lname,String uname,String pass) {
		
		this.fname=fname;
		this.lname=lname;
		this.uname=uname;
		this.pass=pass;
		Add();
	}
	
	public void Add() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
		    ps=con.prepareStatement("insert into register(fname,lname,uname,password) values(?,?,?,?)");
		    ps.setString(1, fname);
		    ps.setString(2, lname);
		    ps.setString(3, uname);
		    ps.setString(4, pass);
		    ps.executeUpdate();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}


