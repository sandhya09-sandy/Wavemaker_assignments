<html>
<head>
<title>PORTAL</title>
<style>
.signup{
  width: 320px;
  padding: 10px;
  border: 5px solid gray;
  margin: 0;
  background-color:B2BEB5;
  }
  p{
    font-size:14px;
    font-size:bold;
    }
</style>
</head>
<body style="background-color:ADD8E6">
<center>
<h1 style="color:FF0000"> SIGN UP </h1>
<div class="signup">
<form action="login.jsp" method="get">
<p> Log in if you have already have an account for this portal </p><br>
<label style="font-size:bold;color:FF0000 ;font-size:15px"> LOGIN </label> <input type="submit" value="LOGIN">
</form><br><br>
<form action="register.jsp" method="post">
<p> Register yourself if you are new to this portal</p><br>
<label style="font-size:bold;color:FF0000 ;font-size:15px"> REGISTER </label> <input type="submit" value="REGISTER">
</form>
<form action="DisplayCandidates.jsp" method="get">
<p> Click here to see the registered candidates</p><br>
<label style="font-size:bold;color:FF0000 ;font-size:15px"> Display candidates</label> <input type="submit" value="Displaycandidates">
</form>
</div>
</center>
</body>
</html>
