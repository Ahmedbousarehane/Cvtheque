/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.ArrayList;
import java.util.List;
import metier.EntrepriseAd;

/**
 *
 * @author Omar
 */
public class EntrepriseModel {
    private String id;
    private EntrepriseAd entreprise = new EntrepriseAd();
    private List<EntrepriseAd> listeentreprise = new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EntrepriseAd getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(EntrepriseAd entreprise) {
        this.entreprise = entreprise;
    }

    public List<EntrepriseAd> getListeentreprise() {
        return listeentreprise;
    }

    public void setListeentreprise(List<EntrepriseAd> listeentreprise) {
        this.listeentreprise = listeentreprise;
    }
    
    
    
}
