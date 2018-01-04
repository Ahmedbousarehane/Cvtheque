/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Ahmed Yassin
 */
public class Tableau {
    private Integer matricule;
    private String nom;
    private String prenom;
    private Date date_n;
    private String genie;
    private Integer promotion;
    
    public Tableau(Integer matricule,String nom,String prenom,Date date_n,String genie,Integer promotion){
        this.matricule=matricule;
        this.date_n=date_n;
        this.genie=genie;
        this.nom=nom;
        this.prenom=prenom;
        this.promotion=promotion;
    }

    /**
     * @return the matricule
     */
    public Integer getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the age
     */
    public Date getDate_n() {
        return date_n;
    }

    /**
     * @param age the age to set
     */
    public void setDate_n(Integer age) {
        this.date_n = date_n;
    }

    /**
     * @return the genie
     */
    public String getGenie() {
        return genie;
    }

    /**
     * @param genie the genie to set
     */
    public void setGenie(String genie) {
        this.genie = genie;
    }

    /**
     * @return the promotion
     */
    public Integer getPromotion() {
        return promotion;
    }

    /**
     * @param promotion the promotion to set
     */
    public void setPromotion(Integer promotion) {
        this.promotion = promotion;
    }
    
    
    
}
