/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.Emiste;
import metier.metierImplementation;
import metier.metierInterface;

/**
 *
 * @author Omar
 */
public class ControleurServlet1 extends HttpServlet {

    private metierInterface metier;
    
    public void init() throws ServletException{
        metier = new metierImplementation(); 
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControleurServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControleurServlet1 at " + request.getContextPath() + "</h1>");
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
        doPost(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");// créer une instance du modèle
        EmisteModel ed = new EmisteModel();
        request.setAttribute("modele", ed);
        if(action!=null){
             if (action.equals("Modifier")){
                ed.getEmiste().setMatricule(request.getParameter("Matricule"));
                ed.getEmiste().setNom(request.getParameter("Nom"));
                ed.getEmiste().setPrenom(request.getParameter("Prenom"));
                ed.getEmiste().setTel(request.getParameter("Tel"));
                ed.getEmiste().setStatut(request.getParameter("Statut"));
                ed.getEmiste().setGenie(request.getParameter("Genie"));
                ed.getEmiste().setPromotion(request.getParameter("Promotion"));
                ed.getEmiste().setNatio(request.getParameter("Natio"));
                ed.getEmiste().setSituation(request.getParameter("Situ"));
                ed.getEmiste().setMail(request.getParameter("Mail"));
                ed.getEmiste().setDateN(request.getParameter("Date_N"));
                ed.getEmiste().setCivilite(request.getParameter("civilite"));
                ed.getEmiste().setPaysRes(request.getParameter("Pays_Res"));
                ed.getEmiste().setAdrRes(request.getParameter("Adr_Res"));
                ed.getEmiste().setVilleRes(request.getParameter("Ville_Res"));
                metier.updateEmiste(ed.getEmiste());
                        }
             request.getRequestDispatcher("ControleurServlet").forward(request,response);
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
