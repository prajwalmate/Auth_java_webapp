package com.signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.signup.dao.SignupDao;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SignupDao dao = new SignupDao();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		
		dao.insert(uname, pass, first_name, last_name, dob, email);
		
		//This is a change
		response.sendRedirect("login.jsp");
		
	}

}
