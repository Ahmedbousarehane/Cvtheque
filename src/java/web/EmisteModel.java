/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.ArrayList;
import java.util.List;
import metier.Emiste;

/**
 *
 * @author Omar
 */
public class EmisteModel {
    private String matricule;
    private Emiste emiste= new Emiste();
    private List<Emiste> listemiste = new ArrayList<Emiste>();

    public Emiste getEmiste() {
        return emiste;
    }

    public void setEmiste(Emiste emiste) {
        this.emiste = emiste;
    }

    public String getMatricule() {
        return matricule;
    }

    public List<Emiste> getListeemiste() {
        return listemiste;
    }

    public void setListeemiste(List<Emiste> listemiste) {
        this.listemiste = listemiste;
    }

  

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    
}
