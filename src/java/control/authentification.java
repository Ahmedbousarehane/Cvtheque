/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ahmed Yassin
 */
public class authentification extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet authentification</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet authentification at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession session=request.getSession();
        Integer a=(Integer)session.getAttribute("Matricule");
        session.invalidate();
           
        RequestDispatcher view = request.getRequestDispatcher("Authentification.jsp");
        view.forward(request, response);
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
        String id = request.getParameter("v1");
            String fin = request.getParameter("v2");
            String type = null;
            Integer matricule = null;
            String identifiant=null;
            
            HttpSession session=request.getSession();
            
            
            
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cvtheque?zeroDateTimeBehavior=convertToNull","root","");
                PreparedStatement ps = con.prepareStatement("select * from utilisateur where email=? and Password=?");
                ps.setString(1, id);
                ps.setString(2, fin);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    type=rs.getString("Type");
                    matricule=rs.getInt("id");
                    identifiant=rs.getString("identifiant");
                    session.setAttribute("Matricule",matricule);
                    session.setAttribute("id", identifiant);
                    if(type.equals("admin")){
                        response.sendRedirect("/Cvtheque/omar/AcceuilServlet");
                    }
                    else if(type.equals("etudiant")){
                        response.sendRedirect("/Cvtheque/Hamada/RechercherCv");
                    }
                }
                else
                {
                    response.sendRedirect("mdp_incorrecte.jsp");
                }
            }catch(SQLException e){} catch (ClassNotFoundException ex) {
            Logger.getLogger(authentification.class.getName()).log(Level.SEVERE, null, ex);
        }
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
