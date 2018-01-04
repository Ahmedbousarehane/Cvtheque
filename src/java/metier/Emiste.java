/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class Emiste implements Serializable {
    
     private String matricule;
     private String nom;
     private String prenom;
     private String genie;
     private String promotion;
     private String civilite;
     private String statut;
     private String situation;
     private String tel;
     private String mail;
     private String natio;
     private String dateN;
     private String adrRes;
     private String paysRes;
     private String villeRes;

    
     

    public Emiste(){
    }

	
    public Emiste(String matricule, String nom, String prenom, String civilite, String tel,String statut, String situation, String mail, String genie, String promotion, String natio, String dateN, String adrRes, String paysRes, String villeRes) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.tel = tel;
        this.mail = mail;
        this.statut=statut;
        this.situation=situation;
        this.genie = genie;
        this.promotion = promotion;
        this.natio = natio;
        this.dateN = dateN;
        this.adrRes = adrRes;
        this.paysRes = paysRes;
        this.villeRes = villeRes;
    }
   
    public String getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCivilite() {
        return this.civilite;
    }
    
    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getGenie() {
        return this.genie;
    }
    
    public void setGenie(String genie) {
        this.genie = genie;
    }
    public String getPromotion() {
        return this.promotion;
    }
    
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
    public String getNatio() {
        return this.natio;
    }
    
    public void setNatio(String natio) {
        this.natio = natio;
    }
    public String getDateN() {
        return this.dateN;
    }
    
    public void setDateN(String dateN) {
        this.dateN = dateN;
    }
    public String getAdrRes() {
        return this.adrRes;
    }
    
    public void setAdrRes(String adrRes) {
        this.adrRes = adrRes;
    }
    public String getPaysRes() {
        return this.paysRes;
    }
    
    public void setPaysRes(String paysRes) {
        this.paysRes = paysRes;
    }
    public String getVilleRes() {
        return this.villeRes;
    }
    
    public void setVilleRes(String villeRes) {
        this.villeRes = villeRes;
    }
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
