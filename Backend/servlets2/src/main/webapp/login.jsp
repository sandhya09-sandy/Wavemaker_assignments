<html>
<head><title> LOGIN </title>
<style>
.top{
   width: 320px;
   padding: 10px;
   border: 5px solid gray;
   margin: 0;
   background-color:B2BEB5;
   }
  #option{
   color:FF0000;
   font-size:14px;
  }
</style>
</head>
<body style="background-color:ADD8E6">
<center>
<h3 style="color:FF0000"> SIGN IN </h3>
<form action="loginuser" method="get">
<div class="top">
<div>
<label for="uname" id="option"> USERNAME </label><input type="text" name="uname" placeholder="your name">
</div><br><br>
<div>
<label for="upw" id="option"> PASSWORD </label><input type="password" name="upw" placeholder="your password">
</div><br><br>
<div>
<label for="sign" id="option"> SIGN IN </label><input type="submit" name="sign" value="sign in">
</div>
</div>
</form>
</center>
</body>
</html>