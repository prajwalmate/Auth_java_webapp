package com.report;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.report.dao.ReportDao;
import com.student.Student;

/**
 * Servlet implementation class Report
 */
@WebServlet("/Report")
public class Report extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Report() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String genre = request.getParameter("genre");
		
		ReportDao dao  = new ReportDao();
		ArrayList<Student> Students = new ArrayList<>();
		
		String lname = request.getParameter("lname");
		
		Students = dao.check(lname);
		for(Student student:Students) System.out.println(student.getEmail()+"\n");
		if(Students.size()!=0)
		{
			
//			HttpSession session = request.getSession();
			request.setAttribute("Students", Students);
			request.setAttribute("lname", lname);
//			response.sendRedirect("recommendtionResult.jsp");
			 RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
			 
			 rd.forward(request, response);
	        
		}
		else
		{
			
			response.sendRedirect("success.jsp");
		}
		
	}

}
