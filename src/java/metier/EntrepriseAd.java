/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Omar
 */
public class EntrepriseAd {
     private String idEntr;
     private String password;
     private String nom;
     private String mail;
     private String tel;
     private String adresse;
     private String codePostal;
     private String description;
     private String domaine;
     private String fax;
     private String site;
     

    public EntrepriseAd() {
    }

    public EntrepriseAd(String password, String mail) {
        this.password = password;
        this.mail = mail;
    }
    

	
    public EntrepriseAd(String idEntr, String nom, String mail) {
        this.idEntr = idEntr;
        this.nom = nom;
        this.mail = mail;
    }
    public EntrepriseAd(String idEntr, String nom, String mail, String tel, String adresse, String codePostal, String description, String domaine, String fax, String site) {
       this.idEntr = idEntr;
       this.nom = nom;
       this.mail = mail;
       this.tel = tel;
       this.adresse = adresse;
       this.codePostal = codePostal;
       this.description = description;
       this.domaine = domaine;
       this.fax = fax;
       this.site = site;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
    public String getIdEntr() {
        return this.idEntr;
    }
    
    public void setIdEntr(String idEntr) {
        this.idEntr = idEntr;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getCodePostal() {
        return this.codePostal;
    }
    
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDomaine() {
        return this.domaine;
    }
    
    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getSite() {
        return this.site;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
}
