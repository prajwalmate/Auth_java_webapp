<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"
 		import="com.employee.Employee"
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

	<h2 align="center" class="mt-5">Employee Details with Employee ID = <b><%=request.getAttribute("empid") %></b></h2>

	<!--  <form action="Logout" class="nav navbar-dark bg-dark p-2 mb-3 m-1 justify-content-end rounded">
			<input type="submit" class="btn btn-outline-light" value="Logout"> 
	</form> -->
	<div class="container my-3">
		<table border ="2" width="1100" align="center" class="mt-6">
         <tr bgcolor="00FF7F">
          <th><b>Employee ID</b></th>
          <th><b>First Name</b></th>
          <th><b>Last Name</b></th>
          <th><b>DOB</b></th>
          <th><b>Contact</b></th>
          <th><b>Role</b></th>
          <th><b>Salary</b></th>
          <th><b>Bonus</b></th>
          <th><b>Annual Salary</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Employee> Employees = (ArrayList<Employee>)request.getAttribute("Employees");
        for(Employee employee:Employees){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=employee.getEmpid()%></td>
                <td><%=employee.getFname()%></td>
                <td><%=employee.getLname()%></td>
                <td><%=employee.getDOB()%></td>
                <td><%=employee.getContact()%></td>
                <td><%=employee.getRole()%></td>
                <td><%=employee.getSalary()%></td>
                <td><%=employee.getBonus()%></td>
                <td><%=employee.getAnnualSalary()%></td>
            </tr>
            <%}%>
        </table>
	</div>
	
	            
	 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	 

</body>
</html>