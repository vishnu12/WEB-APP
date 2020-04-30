<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<html>
<head>
<title>User Management Application</title>

<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">

</head>

</head>
<body>

<%

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if(session.getAttribute("uname")==null){
	
	response.sendRedirect("Login.jsp");
}


%>
 <header>
  <nav class="navbar navbar-expand-md navbar-dark"
   style="background-color: tomato">
   <div>
    <a href="https://www.javaguides.net" class="navbar-brand"> Todo
     App</a>
   </div>

   <ul class="navbar-nav">
    <li><a href="<%=request.getContextPath()%>/read" class="nav-link">Todos</a></li>
   </ul>

   <ul class="navbar-nav navbar-collapse justify-content-end">
    <li><a href="<%=request.getContextPath()%>/logout" class="nav-link">Logout</a></li>
   </ul>
  </nav>
 </header>
 <br>
 <div class="container col-md-5">
  <form method="post" action="Add">
   

    <div class="form-group">
     <label>Todo Title</label> <input type="text"
       class="form-control"
      name="title" required="required" minlength="5">
    </div>

    <div class="form-group">
     <label>Todo Decription</label> <input type="text"
       class="form-control"
      name="description" minlength="5">
    </div> 

    <div class="form-group">
     <label>Todo Status</label> <select class="form-control"
      name="isDone">
      <option value="false">In Progress</option>
      <option value="true">Complete</option>
     </select>
    </div>

    <div class="form-group">
     <label>Todo Target Date</label> <input type="date"
      class="form-control"
      name="targetDate" required="required">
    </div>

    <button type="submit" class="btn btn-success" onclick="return mess();">Save</button>
    
    <script type="text/javascript">
    function mess() {
		alert("Your record is added");
		return true;
	}
    
    </script>
    </form>
   </div>
  </div>
 </div>

 <style>
.footer {
    position: fixed;
    bottom: 0;
    width:100%;
    height: 40px;
    background-color: tomato;
}

</style>

<footer class="footer font-small black">
    <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="color: white">© 2019 Copyright:
        <a href="https://www.javaguides.net/" > <strong> Java Guides </strong></a>
      </div>
</footer>
<!-- Footer -->
</body>
</html>