package com.learn;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/annotation")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	@Override
//	public void init() throws ServletException{
//		System.out.println("This is init method");
//	}
//   @Overrride
//   public void init (ServletConfig config) throws ServletException{
//	  System.out.println("Hello!");
//	  
//   }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Request
		String var1=request.getParameter("var1");
		String var2=request.getParameter("var2");
		
		response.setContentType("text/html");
		//Response
		response.getWriter().append("Welcome "+" " + var1+ " "+ var2).close();
		}

}
