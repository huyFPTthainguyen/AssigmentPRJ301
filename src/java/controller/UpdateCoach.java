/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ManagerDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UpdateCoach", urlPatterns = {"/UpdateC"})
public class UpdateCoach extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        Coach p = db.getCoachId(id);
        request.setAttribute("coach", p);
        request.getRequestDispatcher("view/updateCoach.jsp").forward(request, response);
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
        int coachId = Integer.parseInt(request.getParameter("coachId"));
        String coachName = request.getParameter("coachName");
        String img = request.getParameter("img");
        String dob = request.getParameter("dob");
        
        int nationalityId = Integer.parseInt(request.getParameter("nationalityId"));
        
        int roleId = Integer.parseInt(request.getParameter("roleId"));
        
        
        String imgBack = request.getParameter("imgBack");
        String shortDescription = request.getParameter("shortDescription");
        String coachInfor = request.getParameter("coachInfor");
        ManagerDBcontext db = new ManagerDBcontext();
        db.updateCoach(coachId, coachName, img, dob, nationalityId, roleId, imgBack, shortDescription, coachInfor);

        response.sendRedirect("ManagerC");
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
