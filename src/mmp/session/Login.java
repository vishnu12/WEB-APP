package mmp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		
		
		Logindao l=new Logindao();
		if(l.validate(uname, pass)) {
			HttpSession session=request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("todo-form.jsp");
		}else {
			
			   
			response.sendRedirect("Login.jsp?invalid=true");
		}
		
		
	}

}
