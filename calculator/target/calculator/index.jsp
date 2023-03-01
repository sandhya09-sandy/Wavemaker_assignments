<html>
<head>
<title> Calculator </title>
<style>
body{
  align-content:center;
  background-color:ADD8E6;
  color:"black";
  border-box:2px;
  }
  div{
    font-size:bold;
    font-family:verdana;
    font-size:12px;
    }
 .calculate {
   width: 320px;
   padding: 10px;
   border: 5px solid gray;
   margin: 0;
 }
</style>
</head>
<body style="background color:ADD8E6">
<form action="calci" method="get">
<center>
<div class="calculate">
<h2 style="color:FF0000">  Simple Calculator </h2>
First Number  <input type="text"  name="fnum"><br><br>
Second Number <input type="text"  name="lnum"><br>
<p style="font-family:verdana;font-size:bold;color:FF0000;font-size:13px"> Select an operation </p>
<label for="btn" style="font-family:verdana"> ADDITION </label> <input type="submit" value="+" name="btn"><br><br>
<label for="btn" style="font-family:verdana"> SUBRACTION </label>  <input type="submit" value="-" name="btn"><br><br>
<label for="btn" style="font-family:verdana"> MULTIPLICATION </label>  <input type="submit" value="*" name="btn"><br><br>
<label for="btn" style="font-family:verdana"> DIVISION </label>  <input type="submit" value="/" name="btn"><br><br>
</center>
</form>
</div>
</body>
</html>


