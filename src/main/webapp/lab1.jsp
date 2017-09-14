<%-- 
    Document   : lab1
    Created on : Sep 12, 2017, 8:31:00 PM
    Author     : Rasika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel ="styleSheet" href="styleSheet.css">
        <title>JSP Page</title>
    
    </head>
    <body>
        <div class = "rectangle">
        <h2>Rectangle Calculator</h2>
        <img src ="img/rectangle.png">
        <form id="calRec" name="calRec" method="POST" action="CalController?calType=rectangle">                  
                
                Enter Length<input type="text" id="len" name="length" value=""/><br><br>
            
                Enter  Width<input type ="text" id="wid" name ="width"value =""><br>
            
                <input type="submit"  name="submit" value="Calculate"/>
        </form>
        </div>
    </body>
</html>
