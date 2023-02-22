<html>
<head><title> LOGIN </title>
<style>
    .details{
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
<div class="details">
<h3 style="color:FF0000;"> CREATE A NEW ACCOUNT </h3>

<p font-size:14px;font-size:bold;color:black> Please Fill up the details to create your account </p><br>
<div>
<form action="registeruser" method="post">
<label for="uname" id="option"> USERNAME </label><input type="text" name="uname" placeholder="your name">
</div><br><br>
<div>
<label for="upw" id="option"> PASSWORD </label><input type="password" name="upw" placeholder="your password">
</div><br><br>
<div>
<label for="uemail" id="option"> EMAIL </label><input type="email" name="uemail" placeholder="your email">
</div><br><br>
<div>
<label for="umobile" id="option"> MOBILE N0 </label><input type="text" name="umobile" placeholder="your mobile num">
</div><br><br>
<div>
<label for="sign" id="option" style="color:FF000;font-size:14px"> REGISTER </label> <input type="submit" name="reg" value="register">
</div><br><br>
</form>
</div>
</center>
</body>
</html>