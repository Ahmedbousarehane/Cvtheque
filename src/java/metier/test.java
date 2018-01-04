/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Omar
 */
public class test {
    public static void main(String[] args){
        metierInterfaceEntreprise mi = new metierImplementationEntreprise();
        EntrepriseAd entreprise = new EntrepriseAd("omarino@gmail.com","monpass");
        mi.addEntrepriseAd(entreprise);
        
            
            
        
       
        /*metierInterface mi = new metierImplementation();
       
        mi.addEmiste(new Emiste("2","l","l","l","0","l","l","l","l","0","l", "1995-06-03", "l", "l", "l"));
        mi.addEmiste(new Emiste("33","l","l","l","0","l","l","l","l","0","l", "1995-06-03", "l", "l", "l"));
  List<Emiste> l= mi.listEmistes();
        for (Emiste e:l){
            System.out.println(e.getMatricule());*/
       
       // mi.updateEmiste(e);
        
        }
        }
       
    
