<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
    
    
        <header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: tomato">
  <div>
   <a href="https://www.javaguides.net" class="navbar-brand"> Todo App</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
   <li><a href="Login.jsp" class="nav-link">Login</a></li>
   <li><a href="#" class="nav-link">Signup</a></li>
  </ul>
 </nav>
</header>
        <div class="container">

            <h2>User Register Form</h2>
            <div class="col-md-6 col-md-offset-3">
                <div class="alert alert-success center" role="alert">
                    <p>${NOTIFICATION}</p>
                </div>

                <form action="Register" method="post">

                    <div class="form-group">
                        <label for="fname">First Name:</label> <input type="text" name="firstName" class="form-control"  placeholder="First Name"  required>
                    </div>

                    <div class="form-group">
                        <label for="lname">Last Name:</label> <input type="text" name="lastName" class="form-control"  placeholder="last Name"  required>
                    </div>

                    <div class="form-group">
                        <label for="uname">User Name:</label> <input type="text" name="username" class="form-control"  placeholder="User Name"  required>
                    </div>

                    <div class="form-group">
                        <label for="password">Password:</label> <input type="password" name="password" class="form-control"  placeholder="Password"  required>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>
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