/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;

/**
 *
 * @author Omar
 */
public interface metierInterface {
    public List<Emiste> getEmistebyNom(String nom);
    public List<Emiste> listEmistes();
    public void addEmiste(Emiste e);
    public void updateEmiste(Emiste e);
    public Emiste getEmiste(String Emiste);
    public void deleteEmiste(String Emiste);
    
}
