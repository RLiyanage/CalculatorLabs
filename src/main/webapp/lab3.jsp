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
        <div class="container">
            <div class = "module">
            <h2>Rectangle Calculator</h2>
            <img src ="img/rectangle.png" width="260px">
            <form id="calRec"  name="calRec" method="POST" action="CalController?calType=rectangle">                 
                        Enter Length<input type="text" id="rec" name="length" value=${length}><br><br>
                        Enter  Width<input type ="text" id="rec" name ="width"value =""><br><br>
                        <input class ="but" type="submit"  name="submit" value="Calculate"/>
            </form>

            
            <p>Area of rectangle is :${area}</p>
            </div>
            <div class="module">
                <h2>Circle Calculator</h2>
                <img src="img/circle.png" width="220px">
                <form id="calCir" name="calCir" method="POST" action="CalController?calType=circle">
                    Enter Radius<input type="text" id="redi" name="radius" value=""/><br><br>
                    <input class="but" type="submit"  name="submit" value="Calculate"/>
                </form>
                <p>Area of circle is:${areaOfCircle}</p>
            </div>
            <div class="module">
                <h2>Triangle Calculator</h2>
                <img src="img/triangle.jpg" width="260px">
                <form id="calTra" name="calTra" method="POST" action="CalController?calType=triangle">
                    Enter AB length <input type="text" id="lent" name="triLength" value=""/><br><br>               
                    Enter BC length <input type="text" id="lent" name="triWidth" value=""/><br><br>   
                    <input class ="but" type="submit"  name="submit" value="Calculate"/>
                </form>
                <p>Hypotenuse (AC) is :${side3}</p>
            </div>
        </div>
    </body>
</html>
