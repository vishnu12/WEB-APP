package mmp.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		new Registerdao(fname, lname, uname, pass);
		response.sendRedirect("success.jsp");
		
	}

}
