package model;
// Generated Apr 29, 2017 7:21:24 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Emiste generated by hbm2java
 */
@Entity
@Table(name="emiste"
    ,catalog="projetintegres4"
)
public class emiste  implements java.io.Serializable {


     private Integer id;
     private int matricule;
     private String nom;
     private String prenom;
     private Integer tel;
     private String statut;
     private String genie;
     private Integer anneeDep;
     private String nationnalite;
     private String situation;
     private Date dateN;
     private String photo;
     private String civilite;
     private Set competenceses = new HashSet(0);
     private Set formations = new HashSet(0);
     private Set experiences = new HashSet(0);
     private Set langues = new HashSet(0);
     private Set diverses = new HashSet(0);

    public emiste() {
    }

	
    public emiste(int matricule) {
        this.matricule = matricule;
    }
    public emiste(int matricule, String nom, String prenom, Integer tel, String statut, String genie, Integer anneeDep, String nationnalite, String situation, Date dateN, String photo, String civilite, Set competenceses, Set formations, Set experiences, Set langues, Set diverses) {
       this.matricule = matricule;
       this.nom = nom;
       this.prenom = prenom;
       this.tel = tel;
       this.statut = statut;
       this.genie = genie;
       this.anneeDep = anneeDep;
       this.nationnalite = nationnalite;
       this.situation = situation;
       this.dateN = dateN;
       this.photo = photo;
       this.civilite = civilite;
       this.competenceses = competenceses;
       this.formations = formations;
       this.experiences = experiences;
       this.langues = langues;
       this.diverses = diverses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="Matricule", nullable=false)
    public int getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    
    @Column(name="Nom", length=254)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="Prenom", length=254)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="Tel")
    public Integer getTel() {
        return this.tel;
    }
    
    public void setTel(Integer tel) {
        this.tel = tel;
    }

    
    @Column(name="Statut", length=254)
    public String getStatut() {
        return this.statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }

    
    @Column(name="Genie", length=254)
    public String getGenie() {
        return this.genie;
    }
    
    public void setGenie(String genie) {
        this.genie = genie;
    }

    
    @Column(name="Annee_dep")
    public Integer getAnneeDep() {
        return this.anneeDep;
    }
    
    public void setAnneeDep(Integer anneeDep) {
        this.anneeDep = anneeDep;
    }

    
    @Column(name="Nationnalite", length=254)
    public String getNationnalite() {
        return this.nationnalite;
    }
    
    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    
    @Column(name="Situation", length=254)
    public String getSituation() {
        return this.situation;
    }
    
    public void setSituation(String situation) {
        this.situation = situation;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Date_N", length=19)
    public Date getDateN() {
        return this.dateN;
    }
    
    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    
    @Column(name="Photo", length=254)
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    @Column(name="Civilite", length=254)
    public String getCivilite() {
        return this.civilite;
    }
    
    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="emiste")
    public Set getCompetenceses() {
        return this.competenceses;
    }
    
    public void setCompetenceses(Set competenceses) {
        this.competenceses = competenceses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="emiste")
    public Set getFormations() {
        return this.formations;
    }
    
    public void setFormations(Set formations) {
        this.formations = formations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="emiste")
    public Set getExperiences() {
        return this.experiences;
    }
    
    public void setExperiences(Set experiences) {
        this.experiences = experiences;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="emiste")
    public Set getLangues() {
        return this.langues;
    }
    
    public void setLangues(Set langues) {
        this.langues = langues;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="emiste")
    public Set getDiverses() {
        return this.diverses;
    }
    
    public void setDiverses(Set diverses) {
        this.diverses = diverses;
    }




}


