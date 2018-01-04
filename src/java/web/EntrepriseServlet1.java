/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.EntrepriseAd;
import metier.metierImplementationEntreprise;
import metier.metierInterfaceEntreprise;
import Classes.EnvoyerMailEntreprise;

/**
 *
 * @author Omar
 */
public class EntrepriseServlet1 extends HttpServlet {

    private metierInterfaceEntreprise metierentreprise;
    
    public void init() throws ServletException{
        metierentreprise = new metierImplementationEntreprise(); 
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EntrepriseServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntrepriseServlet1 at " + request.getContextPath() + "</h1>");
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
            String action = request.getParameter("action");
            String id = request.getParameter("id");
            EntrepriseModel entremodel = new EntrepriseModel();
            entremodel.setListeentreprise(metierentreprise.listEntrepriseAd());
            request.setAttribute("modele", entremodel);
            if(action!=null){
            if (action.equals("delete")){
                
                metierentreprise.deleteEntrepriseAd(id);
                entremodel.setListeentreprise(metierentreprise.listEntrepriseAd());
                request.getRequestDispatcher("cross.jsp").forward(request,response);
            }else if (action.equals("info")){
                        EntrepriseAd entreprise = metierentreprise.getEntrepriseAd(id);
            entremodel.setEntreprise(entreprise);
            request.getRequestDispatcher("infoentreprise.jsp").forward(request,response);
            }else if (action.equals("ajouter")){
            EntrepriseAd entrep = metierentreprise.getEntrepriseAd(id);
            metierentreprise.addEntrepriseAd(entrep);
            metierentreprise.valideEntrepriseAd(id);
            EnvoyerMailEntreprise mail = new EnvoyerMailEntreprise();
            mail.envoyer(entrep.getMail(),entrep.getNom());
            entremodel.setListeentreprise(metierentreprise.listEntrepriseAd());
            request.getRequestDispatcher("check.jsp").forward(request,response);
            }}
            request.getRequestDispatcher("EntrepriseInscrite.jsp").forward(request,response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
