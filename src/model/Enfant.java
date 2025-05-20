package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Enfant {
	
	private int idEnfant;
	private String nomEnfant;
	private String prenomEnfant;
	private LocalDate dateNaissance;
	private List<JourGarde> joursGarde = new ArrayList<>();
	
	public int getIdEnfant() {
		return idEnfant;
	}
	public void setIdEnfant(int idEnfant) {
		this.idEnfant = idEnfant;
	}
	public String getNomEnfant() {
		return nomEnfant;
	}
	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}
	public String getPrenomEnfant() {
		return prenomEnfant;
	}
	public void setPrenomEnfant(String prenomEnfant) {
		this.prenomEnfant = prenomEnfant;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Enfant(int idEnfant, String nomEnfant, String prenomEnfant, LocalDate dateNaissance) {
		this.idEnfant = idEnfant;
		this.nomEnfant = nomEnfant;
		this.prenomEnfant = prenomEnfant;
		this.dateNaissance = dateNaissance;
	}
	
}
