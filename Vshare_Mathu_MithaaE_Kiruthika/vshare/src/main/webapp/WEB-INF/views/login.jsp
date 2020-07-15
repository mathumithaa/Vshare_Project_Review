<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html> 
<html> 
   <head> 
      <title>Home Page</title> 
      <style>
 .component{
    background-color:#037DAE;
    padding: 0;
    }
 .heading { 
    font-size:30px; 
    color:#FFFFFF;  
    text-align:center;
    font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
    font-weight: 300;   
          }
 h2{
  margin-left: 470px;;
  font-weight: 300;
  font-size: 35px;
  font-variant: small-caps;
  color: #FFFFFF; 
  margin-top: 10px;
  }

 .component1{
  padding: 8px 25px;
  background-color: #037DAE;
  color: #FFFFFF;
  border: none;
  }

 .textbox input{
    height: 30px;
    width: 200px;
   }

 .submit{
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  padding: 6px 10px;
  margin-left:1220px;
  background-color: #333;
  color: #FFFFFF;
  border: none;
  border-radius: 8px;
  margin: 5px;
  font-size: 20px;
  cursor: pointer;
  text-decoration: none;
  font-variant: all-petite-caps;
  width: 150px;
  transition: all 0.5s;
  }

 .submit:hover{
  background-color: #FF5733;
  color: #FFFFFF;
  }

 .heading1{ 
  font-size:25px;   
  text-align:center;              
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  font-weight: 300;    
          }
  a{
  color: color: #06c;
  text-decoration: none;
  font-size:20px;                 
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
   }

  table,td{
  border-collapse: collapse;
  padding-top: 10px;
  padding-left: 10px;
  }
      </style> 
      </head> 
<body> 
      <div class="component">
      <div class="component1">
          
      <div class="heading"> 
        <h1 style="font-weight: 200;">Vshare</h1> </div>
        <h2>Stock Brokerage Website</h2>
        <br>
      </div></div>
      <br>
      <form  action="login validate" class="textbox" >

      <div ng-app="">
      <div class="heading1">
      Welcome&nbsp;<span ng-bind="user"></span>! Login to access Vshare. </div><center>
                        <br><br>
                    <table>
                    <tr><td>          
                        Username: </td>
                      <td>  <input type="text" name="username" ng-model="user" size="15" placeholder=" Enter name" required /> </td></tr>
                    <tr><td>
                    Password:  </td>
                    <td> <input type="password" name="password" size="15" placeholder=" Enter password" required /> </td></tr>
                    </table>
                
                        <br>
                        <button type="submit" class="submit" />Login</button><br><br>
                            </form>
                    <a href="register"> New User? </a>
                            </div>
        
         </center>
        <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js">
      </script> 
</body>
</html>