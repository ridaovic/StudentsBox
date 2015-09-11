package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="DOCUMENT")
public class DocumentEntity {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
	
	@Column(name="SUJET")
	private String sujet;
	
	@Column(name="CONTENU")
	private String contenu;
	
	@Column(name = "DATE")
	private java.sql.Timestamp date;
	
	
	@Column(name="NOTIFICATION")
	private Boolean notification;
	
	@Column(name="LIEN")
	private String lien;
		
	@Column(name="DISPONIBILITE")
	private Boolean disponibilite;

	@OneToOne  
    @JoinColumn(name="ID_ETUDIANT")  
	private EtudiantEntity etudiant;
	//setters and getters
		
	@OneToOne  
    @JoinColumn(name="ID_ADMIN")  
	private AdministrateurEntity admin;
	//setters and getters
	
	//setters and getters
		
	
	public Integer getId() {
		return id;
	}

	public EtudiantEntity getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(EtudiantEntity etudiant) {
		this.etudiant = etudiant;
	}

	public AdministrateurEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdministrateurEntity admin) {
		this.admin = admin;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public java.sql.Timestamp getDate() {
		return date;
	}

	public void setDate(java.sql.Timestamp date) {
		this.date = date;
	}

	public Boolean getNotification() {
		return notification;
	}

	public void setNotification(Boolean notification) {
		this.notification = notification;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public Boolean getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	
	
	
	
	
	
	
}
