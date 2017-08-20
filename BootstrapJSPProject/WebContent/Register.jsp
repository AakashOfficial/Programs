<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>


    <style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] ,input[type=email]{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}
.container {
    padding: 16px;
}

</style>

</head>
<body>
     <form action="CheckRegister.jsp">
  
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="userName" required>
    <br/>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="userPass" required>
    <br/>
    
    <label><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="userEmail" required>
     <br/>
      
     <label><b>Country</b></label>
    <input type="text" placeholder="Enter Country" name="userCountry" required>  
    <br/>
    <button type="submit">Register</button>
    </div>

</form>
      <br/>
      <a href="index.jsp"><input type="submit" name="rthb" value="Home"/></a>
     
           
</body>
</html>						   
					   
				
				
							
				