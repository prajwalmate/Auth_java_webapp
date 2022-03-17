package com.report;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.Employee;
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
		
		ReportDao dao  = new ReportDao();
		ArrayList<Employee> Employees = new ArrayList<>();
		
		String empid = request.getParameter("empid");
		
		Employees = dao.check(empid);
		if(Employees.size()!=0)
		{
			
			request.setAttribute("Employees", Employees);
			request.setAttribute("empid", empid);
			 RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
			 
			 rd.forward(request, response);    
		}
		else
		{
			response.sendRedirect("success.jsp");
		}
		
	}

}
