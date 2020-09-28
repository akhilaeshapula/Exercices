package com.training.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strUser = request.getParameter("User name");
		String strPass= request.getParameter("Password");
		boolean isValid=false;
		if (strUser.equals("absde") && strPass.equals("absdef")){
			isValid=true;
		}
		if(isValid){
			RequestDispatcher dispatcher=request.getRequestDispatcher("failure.jsp");
			dispatcher.forward(request, response);
			
		}else{		
		RequestDispatcher dispatcher= request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
		

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
		
	}

}
