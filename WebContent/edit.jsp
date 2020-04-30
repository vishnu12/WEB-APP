<%@page import="java.util.ArrayList"%>
<%@page import="mmp.todo.ReadClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
        <title>Edit</title>
    </head>
    <body>
    
        <h1>Edit</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
        
            <div class="container col-md-5">
            <c:forEach items="${data2}" var="p">
            <form method="post" action="Edit">
   
   
   <div class="form-group">
     <label>ID</label> <input type="text" value="${p.id}"
       class="form-control"
      name="id" required="required" minlength="5">
    </div>

    <div class="form-group">
     <label>Todo Title</label> <input type="text" value="${p.title}"
       class="form-control"
      name="title" required="required" minlength="5">
    </div>

    <div class="form-group">
     <label>Todo Decription</label> <input type="text" value="${p.desc}"
       class="form-control"
      name="description" minlength="5">
    </div> 

    <div class="form-group">
     <label>Todo Status</label> <select class="form-control" value="${p.stat}"
      name="isDone">
      <option value="false">In Progress</option>
      <option value="true">Complete</option>
     </select>
    </div>

    <div class="form-group">
     <label>Todo Target Date</label> <input type="date" value="${p.date}"
      class="form-control"
      name="targetDate" required="required">
    </div>

    <button type="submit" class="btn btn-success" onclick="return mess();">Update</button>
</form>
</c:forEach>
        </div>
    </body>
</html>
