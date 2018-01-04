/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class metierImplementationEntreprise implements metierInterfaceEntreprise {

    @Override
    public List<EntrepriseAd> getEntreprisebyName(String name) {
        List<EntrepriseAd> listEntreprise = new ArrayList<EntrepriseAd>();
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT `ID`, `NAME`, `MAIL`, `TEL`, `ADDRESS`, `Password`, `Description`, `Domaine` FROM `entreprise` WHERE NAME = ? ");
            ps.setString(1,name);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
        EntrepriseAd entreprise = new EntrepriseAd();
        entreprise.setIdEntr(rs.getString("ID"));
        entreprise.setNom(rs.getString("NAME"));
        entreprise.setMail(rs.getString("MAIL"));
        entreprise.setTel(rs.getString("TEL"));
        entreprise.setAdresse(rs.getString("ADDRESS"));
        entreprise.setPassword(rs.getString("Password"));
        entreprise.setDescription(rs.getString("Description"));
        entreprise.setDomaine(rs.getString("Domaine"));
        listEntreprise.add(entreprise);
        }
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEntreprise;

       }

    @Override
    public List<EntrepriseAd> listEntrepriseAd() {
        List<EntrepriseAd> listentreprise = new ArrayList();
        Connection conn = SingletonConnection.getConnexion();
        try {
            
            PreparedStatement ps = conn.prepareStatement("SELECT `ID`, `NAME`, `MAIL`, `TEL`, `ADDRESS`, `Password`, `Description`, `Domaine` FROM `entreprise` where `Etat`=\"non valide\"");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                EntrepriseAd entreprise = new EntrepriseAd();
                entreprise.setIdEntr(rs.getString("ID"));
                entreprise.setNom(rs.getString("NAME"));
                entreprise.setMail(rs.getString("MAIL"));
                entreprise.setTel(rs.getString("TEL"));
                entreprise.setAdresse(rs.getString("ADDRESS"));
                entreprise.setPassword(rs.getString("Password"));
                entreprise.setDescription(rs.getString("Description"));
                entreprise.setDomaine(rs.getString("Domaine"));
                listentreprise.add(entreprise);
            }
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return listentreprise;
    }

    @Override
    public void addEntrepriseAd(EntrepriseAd entreprise) {
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO `utilisateur`(`email`, `Password`, `Type`,`identifiant`) VALUES (?,?,?,?)");
            ps.setString(1,entreprise.getMail());
            ps.setString(2,entreprise.getPassword());
            ps.setString(3,"Entreprise");
            ps.setString(4,entreprise.getNom());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteEntrepriseAd(String id) {
        try {
            Connection conn = SingletonConnection.getConnexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM `entreprise` WHERE ID = ?");
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public EntrepriseAd getEntrepriseAd(String id) {
        EntrepriseAd entreprise = null;
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("Select ID,NAME, MAIL, TEL, ADDRESS, Password, Description, Domaine FROM entreprise where ID = ? ");
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                entreprise = new EntrepriseAd();
                entreprise.setIdEntr(rs.getString("ID"));
                entreprise.setNom(rs.getString("NAME"));
                entreprise.setMail(rs.getString("MAIL"));
                entreprise.setTel(rs.getString("TEL"));
                entreprise.setAdresse(rs.getString("ADDRESS"));
                entreprise.setPassword(rs.getString("Password"));
                entreprise.setDescription(rs.getString("Description"));
                entreprise.setDomaine(rs.getString("Domaine"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
            if (entreprise==null) throw new RuntimeException("L'entreprise d'id : "+id+" est introuvale !");
        return entreprise;      
    }

    @Override
    public void valideEntrepriseAd(String id) {
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE `entreprise` SET `Etat`=? WHERE ID = ?  ");
            ps.setString(1,"valide");
            ps.setString(2,id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementationEntreprise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
