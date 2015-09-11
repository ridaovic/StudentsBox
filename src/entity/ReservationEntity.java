package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="RESERVATION")
public class ReservationEntity {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
	
	@Column(name = "DEBUT")
	private java.util.Date debut;
	
	@Column(name = "FIN")
	private java.util.Date fin;
	
	@Column(name = "DATE")
	private java.util.Date date;
	
	
	@Column(name="NOTIFICATION")
	private Boolean notification;
	
	@Column(name="STATUT")
	private Boolean statut;
	
	@OneToOne  
    @JoinColumn(name="ID_ETUDIANT")  
	private EtudiantEntity etudiant;
	//setters and getters
		
	@OneToOne  
    @JoinColumn(name="ID_ADMIN")  
	private AdministrateurEntity admin;
	//setters and getters
	
	@OneToOne  
    @JoinColumn(name="ID_SALLE")  
	private SalleEntity salle;
	//setters and getters
		

	
	//setters and getters
		
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public Boolean getNotification() {
		return notification;
	}

	public void setNotification(Boolean notification) {
		this.notification = notification;
	}

	public java.util.Date getDebut() {
		return debut;
	}

	public void setDebut(java.util.Date debut) {
		this.debut = debut;
	}

	public java.util.Date getFin() {
		return fin;
	}

	public void setFin(java.util.Date fin) {
		this.fin = fin;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
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

	public SalleEntity getSalle() {
		return salle;
	}

	public void setSalle(SalleEntity salle) {
		this.salle = salle;
	}
	
	
		
	
	
	
	
	
}
