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

import Impl.DaoImpl;


@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		boolean b4;
		String msg;

    public Deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s=request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=(String)s.getAttribute("email");
		System.out.println("Email");
		DaoImpl up3=new DaoImpl();
		
		b4=up3.delete(email);
		
		if(b4==true) {
			
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);			
		}		
		
		else {
			
			msg="Bad luck";
			request.setAttribute("true","message");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}	
			

		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
