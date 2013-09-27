package logiqueMetier.Catalogue;
import javax.persistence.*;
import java.util.*;
/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:57 AM
 */

@Entity
public class Auteur {

	
	private int auteurId;	
	private String nom;
	private String prenom;
	private int pays;
	private Set<Fichier> fichierCollection;

	public Auteur(){

	}
	@Id
	public int getAuteurId() {
		return auteurId;
	}

	public void setAuteurId(int auteurId) {
		this.auteurId = auteurId;
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

	public int getPays() {
		return pays;
	}

	public void setPays(int pays) {
		this.pays = pays;
	}
	
	@ManyToMany
	public Set<Fichier> getFichierCollection() {
		return fichierCollection;
	}
	public void setFichierCollection(Set<Fichier> fichierCollection) {
		this.fichierCollection = fichierCollection;
	}
	public void finalize() throws Throwable {

	}
}//end Auteur