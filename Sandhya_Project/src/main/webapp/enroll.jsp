<html>
  <head> <title> Enroll for classes </title></head>
  <style>
          .creation{
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
              body{
              background-color:"aqua";
              }
      </style>
  <body style="background-color:aqua;">
  <center><h2 style="color:red">Enroll for your class</h2>
     <form action="enrollclass" method="get">
           <div>
           <label for="studentid" id="option"> Student Id </label><input type="text" name="uclassname" >
           </div><br><br>
           <div>
           <label for="studentname" id="option"> Student Name </label><input type="text" name="uclassname" >
           </div><br><br>
           <div>
           <label for="classcode" id="option"> Class Code </label><input type="text" name="usection">
           </div><br><br>
           <div>
           <tr><td><label for="enroll" id="option"> Enroll </label></td><td><input type="submit" name="sign" value="enroll"></td></tr>
            </div><br><br>
            </form>
            </center>
     </body>


</html>