package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Impl.DaoImpl;
import interfaces.dao;
import project.com.userpojo;



@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 String msg=null;
	 private dao d;
	     
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String firstname =request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		Long contact=Long.parseLong(request.getParameter("contact"));
		
			userpojo pojo=new userpojo();
			pojo.setFirstname(firstname);
			pojo.setLastname(lastname);
			pojo.setEmail(email);
			pojo.setPassword(Password);
			pojo.setRepassword(repassword);
			pojo.setContact(contact);
			
		     d=new DaoImpl();
			boolean bo=d.add(pojo);
			
			
			
		if(bo==true) {
			msg="Data add";
			
			
		}
		else {
			msg="Bad luck";
		}
			
			
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>"+msg+"</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
	}
	
}
