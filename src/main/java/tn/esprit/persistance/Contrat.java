package tn.esprit.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Contrat implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idContrat")
private int idContrat ; 
@Temporal(TemporalType.DATE)
private Date dateDebutContrat ;
@Temporal(TemporalType.DATE)
private Date dateFinContrat ;

@Enumerated(EnumType.STRING)
private Specialite specialite ; 
private Boolean archive ; 
private int  montantContrat ;
 
@ManyToOne
@JsonIgnore
private Etudiant etudiant ; 

public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat, Specialite specialite, Boolean archive,
		int montantContrat, Etudiant etudiant) {
	this.idContrat = idContrat;
	this.dateDebutContrat = dateDebutContrat;
	this.dateFinContrat = dateFinContrat;
	this.specialite = specialite;
	this.archive = archive;
	this.montantContrat = montantContrat;
	this.etudiant = etudiant;
}

public Contrat() {

}




public int getIdContrat() {
	return idContrat;
}




public void setIdContrat(int idContrat) {
	this.idContrat = idContrat;
}




public Date getDateDebutContrat() {
	return dateDebutContrat;
}




public void setDateDebutContrat(Date dateDebutContrat) {
	this.dateDebutContrat = dateDebutContrat;
}




public Date getDateFinContrat() {
	return dateFinContrat;
}




public void setDateFinContrat(Date dateFinContrat) {
	this.dateFinContrat = dateFinContrat;
}




public Specialite getSpecialite() {
	return specialite;
}




public void setSpecialite(Specialite specialite) {
	this.specialite = specialite;
}




public Boolean getArchive() {
	return archive;
}




public void setArchive(Boolean archive) {
	this.archive = archive;
}




public int getMontantContrat() {
	return montantContrat;
}




public void setMontantContrat(int montantContrat) {
	this.montantContrat = montantContrat;
}




public Etudiant getEtudiant() {
	return etudiant;
}




public void setEtudiant(Etudiant etudiant) {
	this.etudiant = etudiant;
}






@Override
public String toString() {
	return "Contrat [idContrat=" + idContrat + ", dateDebutContrat=" + dateDebutContrat + ", dateFinContrat="
			+ dateFinContrat + ", specialite=" + specialite + ", archive=" + archive + ", montantContrat="
			+ montantContrat + ", etudiant=" + etudiant + "]";
}






}
