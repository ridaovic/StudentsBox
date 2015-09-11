package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ETUDIANT")
public class EtudiantEntity {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
	
	@Column(name="NOM")
    private String nom;
	
	@Column(name="PRENOM")
    private String prenom;
	
	@Column(name="MAIL")
    private String mail;

	@Column(name="ADRESSE")
    private String adresse;
	
	@Column(name="TELEPHONE")
    private String telephone;
	
	@Column(name="CIN")
    private String cin;
	
	@Column(name="MOT_PASSE")
    private String motPasse;
	
	@Column(name = "DATE_NAISSANCE")
	private java.util.Date dateNaissance;
	
	@Column(name="CNE")
	private String cne;
	
	@Column(name="GROUPE")
	private String groupe;
	
	@Column(name="FILIERE")
	private String filiere;
	
	@Column(name="DEPARTEMENT")
	private String departement;
	
	@Column(name="NIVEAU")
	private String niveau;
	
	@Column(name="STATUT")
	private Boolean statut;
	
	
	//setters and getters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public java.util.Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(java.util.Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	
	
	
	
	
	
	
	
}
