package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ADMINISTRATEUR")
public class AdministrateurEntity {

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
	
	@Column(name = "DATE_NAISSANCE")
	private java.util.Date dateNaissance;
	
//	@Column(name="DATE_NAISSANCE")
//    private String dateNaissance;
	
	@Column(name="MOT_PASSE")
    private String motPasse;
	
	@Column(name="FONCTION")
    private String fonction;
	
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

//	public String getDateNaissance() {
//		return dateNaissance;
//	}
//
//	public void setDateNaissance(String dateNaissance) {
//		this.dateNaissance = dateNaissance;
//	}

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

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	@Override
	public String toString() {
		return "AdministrateurEntity [id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", telephone=" + telephone + ", cin=" + cin
				+ ", dateNaissance=" + dateNaissance + ", motPasse=" + motPasse
				+ ", fonction=" + fonction + "]";
	}
	
	
	
	
	
	
}
