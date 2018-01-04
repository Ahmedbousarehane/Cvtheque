/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.EntrepriseAd;
import metier.metierImplementationEntreprise;
import metier.metierInterfaceEntreprise;

/**
 *
 * @author Omar
 */
public class EntrepriseServlet extends HttpServlet {

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
            out.println("<title>Servlet EntrepriseServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EntrepriseServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntrepriseModel entremodel = new EntrepriseModel();
        String action = request.getParameter("action");
        entremodel.setListeentreprise(metierentreprise.listEntrepriseAd());
        request.setAttribute("modele", entremodel);
        if(action!=null){
            if (action.equals("lister")){
        List<EntrepriseAd> liste = metierentreprise.listEntrepriseAd();//couche métier pour récuperer le resultat
        entremodel.setListeentreprise(liste);//stocker le resultat dans le modèle
           }
                
        }
        request.getRequestDispatcher("EntrepriseInscrite.jsp").forward(request,response);
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
