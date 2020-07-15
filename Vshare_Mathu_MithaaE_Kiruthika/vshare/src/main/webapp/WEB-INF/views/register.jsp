<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Vshare Account creation</title>
</head>
<style>
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
  margin-left: 530px;
  }
   
 .heading1{ 
  font-size:25px;   
  text-align:center;              
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  font-weight: 300;   
         }
 .heading2{ 
  font-size:20px;   
  text-align:center;              
  font-family: "CharlesModern-Light","Helvetica Neue",Helvetica,Arial,sans-serif;
  font-weight: 300;
  background-color: #EBF5FB;
  padding: 10px 20px;
  box-sizing: border-box;
  margin-left: 300px;
  margin-right: 300px;
  display: block;  
          }
          
 .heading2 a{
  color: color: #06c;
  text-decoration: none;
  }
 table,td{
 border-collapse:collapse;
 padding-top: 10px;
 padding-left: 10px;
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
  width: 140px;
  transition: all 0.5s;
  }
  
 .submit:hover{
  background-color: #FF5733;
  color: #FFFFFF;
  }

 .textbox input{
    height: 20px;
    width: 200px;
   }
 .highlight-error {
  border-color: red; 
   }
</style>
<script type="text/javascript">
  function val(){
	var x=document.myform.email.value;  
	  var atposition=x.indexOf("@");  
	  var dotposition=x.lastIndexOf(".");  

	  if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
	  alert("Please enter a valid e-mail address");  
	  return false;  
	  }   	   
	}

function validatepass() {  
	var msg;
	var count=document.myform.password.value;
	if(count.length>6){  
	msg="  Strong";  
	}  
	else{  
	msg="  Weak";  
	}  
	document.getElementById('passcheck').innerText=msg;  
	 }
  
</script>
<body>
<div class="topnav">
  <a>Register Your Account</a>
  </div>
  
  <br><br><br>
   <center>
   
   <div class="heading1">
           <h3> Let’s register your individual brokerage account.</h3></div><br>
   <div class="heading2">
           Already have a Vshare account? &nbsp; 
           <a href="login"> Click here to Log in.</a></div>
   <form name="myform" method="post" action="check" class="textbox">

                  <br><br>
                    <table>
                    <tr><td>
                     UserName: </td>
                     <td> <input type="text" name="username" size="15" placeholder=" Enter name" required > </td> </tr>
                     <tr><td> Password: </td>
                     <td> <input type="password" name="password" size="15" placeholder=" Enter password" required onkeyup="return  validatepass()" > 
                     <span id="passcheck"> </span>
                     </td> </tr>
                     <tr> <td> 
                     Email: </td>
                     <td> <input type="email" name="email" placeholder=" Enter mail id" required > </td>
                     </tr>
                     <tr> <td> 
                     Aadhar number: </td>
                     <td> <input type="text" id="no" name="aadhar" placeholder=" Enter aadhar number" maxlength="14" required oninvalid="alert('enter correct aadhar number');" pattern="^[2-9]{1}[0-9]{3}\s[0-9]{4}\s[0-9]{4}$"> </td>
                     </tr>
                     </table>
       
                    <br>
                    <button type="submit" class="submit" onsubmit="return val()">Get Started</button>
                    &nbsp;&nbsp;
                    <button type="reset" class="submit">Maybe later</button>
            </center>
        </form>
</body>
</html>