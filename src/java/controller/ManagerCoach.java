/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ManagerDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Coach;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManagerCoach", urlPatterns = {"/ManagerC"})
public class ManagerCoach extends HttpServlet {

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
        ManagerDBcontext db = new ManagerDBcontext();
        String page = request.getParameter("page");
        if(page == null || page.trim().length() == 0)
        {
            page="1";
        }
        int pagesize = 3;
        int pageindex = Integer.parseInt(page);
        ArrayList<Coach> listpage = db.getPageCoach(pageindex, pagesize);        
        request.setAttribute("listpage", listpage); 
        
        int numofrecords = db.count();
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        int count = db.getTotalCoach();
        request.setAttribute("totalcoach", count);
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pagesize", pagesize);
        request.setAttribute("pageindex", pageindex);
        request.getRequestDispatcher("view/managerCoach.jsp").forward(request, response);
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
