/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.controller;

import com.mycompany.calculatorlabs.model.CalculatorService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rasika
 */
@WebServlet(name = "CalController", urlPatterns = {"/CalController"})
public class CalController extends HttpServlet {

    
    //private static final String DESTNATION = "/response.jsp";
    //private static final String DESTNATION = "/lab3.jsp";
    private static final String CAL_TYPE_RECTANGLE ="rectangle";
    private static final String CAL_TYPE_CIRCLE ="circle";
    private static final String CAL_TYPE_TRIANGLE ="triangle";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String calType = request.getParameter("calType");
        String length = request.getParameter("length");
        String width = request.getParameter("width");
        String radius = request.getParameter("radius");
        String side1 = request.getParameter("triLength");
        String side2= request.getParameter("triWidth");
        //String destination = request.getParameter("desType");
        String destination = "/lab3.jsp";
       
        CalculatorService caculatorservice;

        try {
            caculatorservice = new CalculatorService();              
            if (calType.equalsIgnoreCase(CAL_TYPE_RECTANGLE)) {
               String area = caculatorservice.calculateAreaOfRectangle(length,width);
               request.setAttribute("area", area);
               request.setAttribute("length", length);
               
            } else if(calType.equalsIgnoreCase(CAL_TYPE_CIRCLE)){
               String areaOfCircle = caculatorservice.calculateAreaOfCircle(radius);
               request.setAttribute("areaOfCircle", areaOfCircle);
 
            } else if(calType.equalsIgnoreCase(CAL_TYPE_TRIANGLE)){
                String hypothenuseSide = caculatorservice.calculateHypotenuseOfTriangle(side1, side2);
                request.setAttribute("side3",hypothenuseSide);                
            }
        } catch (Exception e) {
            request.setAttribute("errorMsg", e.getMessage());
        }
        
          RequestDispatcher  view = request.getRequestDispatcher(destination);
          view.forward(request, response);        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
