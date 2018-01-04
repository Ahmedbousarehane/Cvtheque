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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class metierImplementation implements metierInterface {

    @Override
    public List<Emiste> getEmistebyNom(String nom) {
        List<Emiste> listemiste = new ArrayList<Emiste>();
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("Select Matricule,Nom,Prenom,Genie,Promotion FROM emistecv WHERE Nom like ?");
            ps.setString(1,nom+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Emiste e = new Emiste();
                e.setMatricule(rs.getString("Matricule"));
                e.setNom(rs.getString("Nom"));
                e.setPrenom(rs.getString("Prenom"));
                e.setGenie(rs.getString("Genie"));
                e.setPromotion(rs.getString("Promotion"));
                listemiste.add(e);
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listemiste;  
    }

    @Override
    public void addEmiste(Emiste e) {
        Connection conn= SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into emistecv(`Matricule`,`Nom`, `Prenom`, `Civilite`, `Tel`, `Mail`,`Statut`,`Situation`, `Genie`, `Promotion`, `Natio`, `Date_N`, `Adr_Res`, `Pays_Res`, `Ville_Res`) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, e.getMatricule());
            ps.setString(2, e.getNom());
            ps.setString(3, e.getPrenom());
            ps.setString(4, e.getCivilite());
            ps.setString(5, e.getTel());
            ps.setString(6, e.getMail());
            ps.setString(7, e.getStatut());
            ps.setString(8, e.getSituation());
            ps.setString(9, e.getGenie());
            ps.setString(10, e.getPromotion());
            ps.setString(11, e.getNatio());
            ps.setString(12, e.getDateN());
            ps.setString(13, e.getAdrRes());
            ps.setString(14, e.getPaysRes());
            ps.setString(15, e.getVilleRes());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @Override
    public List<Emiste> listEmistes() {
        Connection conn= SingletonConnection.getConnexion();
        List<Emiste> liste= new ArrayList<Emiste>();
        try {
            PreparedStatement ps = conn.prepareStatement("Select Matricule,Nom, Prenom, Genie, Promotion from emistecv");
            ResultSet res = ps.executeQuery();
            while (res.next()){
               Emiste e = new Emiste();
               e.setMatricule(res.getString("Matricule"));
               e.setNom(res.getString("Nom"));
               e.setPrenom(res.getString("Prenom"));
               e.setGenie(res.getString("Genie"));
               e.setPromotion(res.getString("Promotion"));
               liste.add(e);
            }
         ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    return liste;
    }

    @Override
    public void updateEmiste(Emiste e) {
        Connection conn= SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("Update emistecv set Nom=?,Prenom=?,Civilite=?,Tel=?,Mail=?,Statut=?,Situation=?,Genie=?,Promotion=?,Natio=?,Date_N=?,Adr_Res=?,Pays_Res=?,Ville_Res=?,Matricule=? where Matricule = ?");
            ps.setString(1, e.getNom());
            ps.setString(2, e.getPrenom());
            ps.setString(3, e.getCivilite());
            ps.setString(4, e.getTel());
            ps.setString(5, e.getMail());
            ps.setString(6, e.getStatut());
            ps.setString(7, e.getSituation());
            ps.setString(8, e.getGenie());
            ps.setString(9, e.getPromotion());
            ps.setString(10, e.getNatio());
            ps.setString(11, e.getDateN());
            ps.setString(12, e.getAdrRes());
            ps.setString(13, e.getPaysRes());
            ps.setString(14, e.getVilleRes());
            ps.setString(15, e.getMatricule());
            ps.setString(16, e.getMatricule());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    

    @Override
    public Emiste getEmiste(String mat) {
        Emiste e = null;
        Connection conn = SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("Select `Matricule`,`Nom`, `Prenom`, `Civilite`, `Tel`, `Mail`,`Statut`,`Situation`, `Genie`, `Promotion`, `Natio`, `Date_N`, `Adr_Res`, `Pays_Res`, `Ville_Res` FROM emistecv WHERE Matricule = ?");
            ps.setString(1,mat);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                e = new Emiste();
                e.setMatricule(rs.getString("Matricule"));
                e.setNom(rs.getString("Nom"));
                e.setPrenom(rs.getString("Prenom"));
                e.setGenie(rs.getString("Genie"));
                e.setCivilite(rs.getString("civilite"));
                e.setTel(rs.getString("Tel"));
                e.setMail(rs.getString("Mail"));
                e.setStatut(rs.getString("Statut"));
                e.setDateN(rs.getString("Date_N"));
                e.setAdrRes(rs.getString("Adr_Res"));
                e.setPaysRes(rs.getString("Pays_Res"));
                e.setVilleRes(rs.getString("Ville_Res"));
                e.setPromotion(rs.getString("Promotion"));
                e.setNatio(rs.getString("Natio"));
                e.setSituation(rs.getString("Situation"));    
            }
 
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (e==null) throw new RuntimeException("Produit "+mat+" est introuvale !");
        return e; 
        
    }

    @Override
    public void deleteEmiste(String mat) {
        Connection conn= SingletonConnection.getConnexion();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM `emistecv` WHERE Matricule = ?");
            ps.setString(1,mat);
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(metierImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
