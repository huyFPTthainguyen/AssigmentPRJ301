/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.PlayerDBcontext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Player;

/**
 *
 * @author Admin
 */
@WebServlet(name = "UpdatePlayer", urlPatterns = {"/UpdateP"})
public class UpdatePlayer extends HttpServlet {

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
        PlayerDBcontext db = new PlayerDBcontext();
        int id = Integer.parseInt(request.getParameter("id"));
        Player p = db.getPlayerById(id);
        request.setAttribute("player", p);
        request.getRequestDispatcher("view/updatePlayer.jsp").forward(request, response);
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
        int playerId = Integer.parseInt(request.getParameter("playerId"));
        String playerName = request.getParameter("playerName");
        String img = request.getParameter("img");
        String dob = request.getParameter("dob");
        String birthPlace = request.getParameter("birthPlace");
        int nationalityId = Integer.parseInt(request.getParameter("nationalityId"));
        int height = Integer.parseInt(request.getParameter("height"));
        int weight = Integer.parseInt(request.getParameter("weight"));
        int roleId = Integer.parseInt(request.getParameter("roleId"));
        
        int number = Integer.parseInt(request.getParameter("number"));
        String imgBack = request.getParameter("imgBack");
        String shortDescription = request.getParameter("shortDescription");
        String playerInfor = request.getParameter("playerInfor");
        PlayerDBcontext db = new PlayerDBcontext();
        
        db.updatePlayer(playerId, playerName, img, dob, birthPlace, nationalityId, height, weight, roleId, number, imgBack, shortDescription, playerInfor);
        response.sendRedirect("ManagerP");
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
