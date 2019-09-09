package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import Impl.DaoImpl;
import interfaces.dao;
import project.com.userpojo;




@WebServlet("/upsignservlet")
public class upsignservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String msg=null;
	
	private dao d;
       

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
			boolean bo=d.update(pojo);
			
			
			
		if(bo==true) {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
			
			
			
		}
		else {
			
			msg="Bad luck";
			request.setAttribute("true", msg );
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.include(request, response);
			
		}
			
			

		
		
		
	}



	}
	




