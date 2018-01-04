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
public class ControleurServlet extends HttpServlet {

    private metierInterface metier;
    
    public void init() throws ServletException{
        metier = new metierImplementation(); 
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

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
        String action = request.getParameter("action");
        EmisteModel ed = new EmisteModel();// créer une instance du modèle
        ed.setListeemiste(metier.listEmistes());
        request.setAttribute("modele", ed);
        if(action!=null){
            if (action.equals("chercher")){
        String nom = request.getParameter("nom");// controleur lit les données de la requête
        ed.setMatricule(nom);// stocker les données de la requête dans le modèle
        List<Emiste> liste = metier.getEmistebyNom(nom);//couche métier pour récuperer le resultat
        ed.setListeemiste(liste);//stocker le resultat dans le modèle
            }
            else if (action.equals("delete")){
                String mat = request.getParameter("matricule");
                metier.deleteEmiste(mat);
                ed.setListeemiste(metier.listEmistes());
        }
            else if (action.equals("Ajouter")){
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
                metier.addEmiste(ed.getEmiste());
                ed.setListeemiste(metier.listEmistes());
        }
            else if (action.equals("edit")){
                String mat = request.getParameter("matricule");// controleur lit les données de la requête
                ed.setMatricule(mat);// stocker les données de la requête dans le modèle
                Emiste emiste = metier.getEmiste(mat);//couche métier pour récuperer le resultat
                ed.setEmiste(emiste);
                request.getRequestDispatcher("EditEmiste.jsp").forward(request,response);
        }   else if (action.equals("info")){
                String mat = request.getParameter("matricule");// controleur lit les données de la requête
                ed.setMatricule(mat);// stocker les données de la requête dans le modèle
                Emiste emiste = metier.getEmiste(mat);//couche métier pour récuperer le resultat
                ed.setEmiste(emiste);
                request.getRequestDispatcher("infoemiste.jsp").forward(request,response);
        }
        }
        request.getRequestDispatcher("emisteview.jsp").forward(request,response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
