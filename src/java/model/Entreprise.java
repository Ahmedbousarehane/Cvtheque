package model;

import java.util.Date;

/**
 *
 * @author Claoudio
 */
public class Entreprise {
    private String nom;
    private String Domaine;
    private String Secteur;
    private String description;
    private String site;
    private Integer tel;
    private Integer fax;
  //  private Integer code_postal;
    
    
    public Entreprise(String nom,String Domaine,String Secteur,String description,Integer tel,Integer fax){
        this.nom=nom;
        this.Domaine=Domaine;
        this.Secteur=Secteur;
        this.description=description;
        this.tel=tel;
        this.fax=fax;
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
     * @return the Domaine
     */
    public String getDomaine() {
        return Domaine;
    }

    /**
     * @param Domaine the Domaine to set
     */
    public void setDomaine(String Domaine) {
        this.Domaine = Domaine;
    }

    /**
     * @return the Secteur
     */
    public String getSecteur() {
        return Secteur;
    }

    /**
     * @param Secteur the Secteur to set
     */
    public void setSecteur(String Secteur) {
        this.Secteur = Secteur;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the tel
     */
    public Integer getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(Integer tel) {
        this.tel = tel;
    }

    /**
     * @return the fax
     */
    public Integer getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(Integer fax) {
        this.fax = fax;
    }

   
}