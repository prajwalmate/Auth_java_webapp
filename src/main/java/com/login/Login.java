package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;
import com.signup.dao.SignupDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginDao dao = new LoginDao();
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(dao.validate(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("success.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
