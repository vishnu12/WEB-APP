package mmp.todo;
import java.sql.*;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7300399472105781703L;

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String date=request.getParameter("targetDate");
		String title=request.getParameter("title");
		String desc=request.getParameter("description");
		String status=request.getParameter("isDone");
		Addclass ad=new Addclass(title, desc, status, date);
		Add2 ad2=new Add2();
		if(ad2.addNew(ad)) {
			
			response.sendRedirect("todo-form.jsp");
			return;
		}
		
		
		
	}
	
	}
	
		
	
	

