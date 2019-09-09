package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTML;

import Impl.DaoImpl;
import project.com.userpojo;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		boolean b1;
		String msg;
	
    public loginservlet() {
        super();
    }
        
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    	
		
		HttpSession s=request.getSession();
		userpojo pojo=new userpojo();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("Email");
		String pass=request.getParameter("Password");
		pojo.setEmail(email);
		pojo.setPassword(pass);
		s.setAttribute("email", email);
		DaoImpl up=new DaoImpl();
		b1=up.login(pojo);
		
		if(b1==true) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);			
		}		
		
		else {
			
			msg="Error in login or password";
			request.setAttribute("true","message");
			RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");
			rd.include(request, response);
			
		}	
			
			
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>"+ msg +"</h1>");
			out.print("</body>");
			out.print("</html>");
			
		}
		
		
	}
		

