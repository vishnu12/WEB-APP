package mmp.todo;
import java.sql.*;
import java.util.LinkedList;
public class Addclass {
	
	private String title;
	private String desc;
	private String stat;
	private String date;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private boolean b=false;
	
	public Addclass(String title,String desc,String stat,String date) {
		
		this.title=title;
		this.desc=desc;
		this.stat=stat;
		this.date=date;
		
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	}
	
	
	
	


