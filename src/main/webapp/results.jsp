<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"
 		import="com.student.Student"
 	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

	<form action="Logout" class="nav navbar-dark bg-dark p-2 mb-3 m-1 justify-content-end rounded">
			<input type="submit" class="btn btn-outline-light" value="Logout">
	</form>
	<div class="container my-3">
		<table border ="1" width="500" align="center" class="mt-5">
         <tr bgcolor="00FF7F">
          <th><b>User Name</b></th>
          <th><b>First Name</b></th>
          <th><b>Last Name</b></th>
          <th><b>DOB</b></th>
          <th><b>Email</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Student> Students = (ArrayList<Student>)request.getAttribute("Students");
        for(Student student:Students){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=student.getUname()%></td>
                <td><%=student.getFname()%></td>
                <td><%=student.getLname()%></td>
                <td><%=student.getDOB()%></td>
                <td><%=student.getEmail()%></td>
            </tr>
            <%}%>
        </table>
	</div>
	
	            
	 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	 

</body>
</html>