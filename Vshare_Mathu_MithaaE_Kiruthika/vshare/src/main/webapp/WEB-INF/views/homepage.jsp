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
    margin-left: 500px;
    font-weight: 300;
    font-size: 35px;
    font-variant: small-caps;
    color: #FFFFFF; 
   }

 .topcontent{
    font-size: 40px;
    font-size: 1.375rem;
    line-height: 28px;
    text align: center;
    margin-left: 200px;
    }

 .topnav {
  background-color: #333;
  overflow: hidden;
  font-weight:300;
}

.topnav a {
  float: left;
  text-align: center;
  padding: 16px 40px;
  text-decoration: none;
  font-size: 22px;
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  font-variant: all-petite-caps;
  color:#FFFFFF;

}
.topnav a:hover {
  background-color: #ddd;
  color: black;
}
.topnav a.active {
  background-color: #FF5733;
  color: white;
}
.button
{
 font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
 padding: 16px 30px;
 margin-left:590px;
 background-color: #FF5733;
 color: #FFFFFF;
 border: none;
 border-radius: 8px;
 font-size: 20px;
 cursor: pointer;
 text-decoration: none;
 font-variant: all-petite-caps;
}

.button:hover
{
  background-color: #037DAE;
  color: #FFFFFF;
}

.logbutton
{
 font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
 padding: 8px 25px;
 margin-left:1220px;
 background-color: #FF5733;
 color: #FFFFFF;
 border: none;
 border-radius: 8px;
 margin-top: 20px;
 font-size: 20px;
 cursor: pointer;
 text-decoration: none;
 font-variant: all-petite-caps;

}
.logbutton:hover
{
  background-color: #FFFFFF;
  color: black;
}

marquee{
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  font-size: 23px;
  font-variant: all-petite-caps;
}
      </style> 
      </head> 
 <body> 
      <div class="component">
      <a href="login"> <button class="logbutton">Log In </button></a>   
          
      <div class="heading"> 
      <h1 style="font-weight: 200;">Vshare</h1> </div>
      <h2>Stock Brokerage Website</h2>
      <br>
      </div>

      <div class="topnav">
      <a class="active" href="#home">Brokerage Account</a>
      <a href="hometab1">What is a Brokerage Account</a>
      <a href="hometab2">Types Of Brokerage Account</a>
      <a href="#news">Stock Market News</a>
      <a href="#about">Contact</a>
      </div>

      <br><br>
      <div class="topcontent"> 
      <p>Open a Vshare® brokerage account in just 10 minutes and invest and trade the way you want.</p>
      </div>
      <br>
      <a href="register"><button class="button">Open an Account</button></a>
      <br><br>
      
      <marquee>"KNOW WHAT YOU OWN, AND WHY YOU OWN IT." - PETER LYNCH 
</body>
</html>