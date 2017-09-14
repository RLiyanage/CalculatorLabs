/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.model;

/**
 *
 * @author Rasika
 */
public class CalculatorService {
    
    
    public String calculateAreaOfRectangle(String length,String width){
       double area= Double.parseDouble(length)*Double.parseDouble(width);
       return Double.toString(area);
    }
    public String calculateAreaOfCircle(String radius){
        double radiusOfCircle = Double.parseDouble(radius);        
        return Double.toString(Math.round(radiusOfCircle*radiusOfCircle*Math.PI));
    }
    public String calculateHypotenuseOfTriangle(String length, String width){
        double side1 = Double.parseDouble(length);
        double side2 = Double.parseDouble(width);
        double hypotenuse= Math.sqrt((side1*side1)+(side2*side2));        
        return Double.toString(Math.round(hypotenuse));
    }

}
