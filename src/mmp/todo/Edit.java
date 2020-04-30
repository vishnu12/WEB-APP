package mmp.todo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		ReadClass rd=new ReadClass();
		
		request.setAttribute("data2", rd.getValuesById(id));
		RequestDispatcher dp = request.getRequestDispatcher("edit.jsp");
        dp.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String desc=request.getParameter("description");
		String stat=request.getParameter("isDone");
		String date=request.getParameter("targetDate");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=&useLegacyDatetimeCode=false&serverTimezone=UTC");
		PreparedStatement	ps=con.prepareStatement("update todo set title=?,description=?,status=?,date=? where id=?");
			ps.setString(1, title);
			ps.setString(2, desc);
			ps.setString(3, stat);
			ps.setString(4, date);
			ps.setInt(5, id);
			ps.executeUpdate();
			response.sendRedirect("todo-form.jsp");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	
}
