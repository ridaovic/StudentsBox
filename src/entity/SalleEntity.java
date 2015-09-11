package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.text.StyledEditorKit.BoldAction;


@Entity
@Table(name="SALLE")
public class SalleEntity {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
	
	@Column(name="NUMERO")
	private String numero;
	
	@Column(name="TYPE")
	private String type;
	
	
	@Column(name="NOMBRE")
	private int nombre;
	
	
	@Column(name="STATUT")
	private Boolean statut;
	
	//setters and getters
	
	
	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
		
	
	
	
}
