<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vshare Retry Login</title>

</head>
<style>
body
{
background-image:url('https://rockfortmarkets.com/wp-content/uploads/2019/06/banner_callout-tws-960x470.jpg');
background-repeat: no-repeat;
  background-attachment: fixed;
  background-size:100% 100%;
}
</style>
<body style="color:white">
<script>alert("Tryagain...")</script>
      
      <br> <br><br><br><br><br>
<center>
<form method="post" action="login validate"  >
<h3><b>LOGIN</b></h3>
<div ng-app="">
Welcome back <span ng-bind="user"></span>! Login to access Vshare.
  
                        <br><br>
                    <table>
                    <tr><td>          
                        UserName: </td>
                      <td>  <input type="text" name="username" ng-model="user" size="15" placeholder=" Enter name" required > </td></tr>
                    <tr><td>
                    Password:  </td>
                    <td> <input type="password" name="password" size="15" placeholder=" Enter password" required > </td></tr>
                    <tr> <td> 
                     Email: </td>
                     <td> <input type="email" name="email" placeholder=" Enter mail id" required oninput="return validateemail();"> </td>
                     </tr></table>
                        <br>
                        <input type="submit" value="Login" class="submit" />
                            &nbsp;&nbsp;
                            <input type="reset" value="Reset" class="submit"/>
                            <br><br>
                            </form>
                             
                            <form action="admin login" method="post">
                            Not a Customer? &nbsp;
                            <input type="submit" value="Click Here"> for Admin Login </form>
        </div> 
         </center>
        <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js">
      </script>
</body>
</html>