package com.btanand.zycus.main;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestDriveBuild extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = -8198549592206783255L;

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)  { 		
			try {	
				response.getWriter().print("<h1>Hello World</h1>");
			} catch (Exception e) {
				System.err.println("Fatal Servlet Error");
				e.printStackTrace();
			}			
		}
	















"TRIAL SECOND DAY yet again"

	
}
