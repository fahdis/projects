package logiqueMetier.Catalogue;

import java.util.*;


import javax.persistence.*;

import logiqueMetier.Gestion.Abonné;

/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:35:00 AM
 */
@Entity
public class Fichier {

	@Override
	public String toString() {
		return "Fichier [titre=" + titre + ", langue=" + langue
				+ ", dateAjout=" + dateAjout + ", taille=" + taille
				+ ", categorie=" + categorie + ", proprietaire=" + proprietaire
				+ ", nbrTelechargement=" + nbrTelechargement
				+ ", descriptionFichier=" + descriptionFichier + ", relevance="
				+ relevance + ", m_Auteur=" + auteurCollection+ "]";
	}
	private int fichierId;
	private String titre;
	private String langue;
	private Date dateAjout;
	private float taille;
	private Categorie categorie;
	private Catalogue catalogue;
	private Abonné proprietaire;
	private int nbrTelechargement;
	private String descriptionFichier;
	private int relevance;
	private Set<Auteur> auteurCollection;
	private Dossier dossier;

	
	
	public static class Builder {
		//Required Parameters
		private int  	fichierId;
		private String 	titre;
		
		//Optional Parameters
		private String langue=null;
		private Date dateAjout;
		private float taille=0;
		private Categorie categorie=null;
		private Catalogue catalogue=null;
		private Abonné proprietaire=null;
		private int nbrTelechargement=0;
		private String descriptionFichier=null;
		private int relevance=0;
		private Set<Auteur> auteurCollection=null;
		private Dossier dossier=null;
		
		public Builder(int fichierId, String titre) {
				this.fichierId = fichierId;
				this.titre = titre;
				}
		public Builder langue(String l)
				{langue=l; return this;}
		public Builder dateAjout(Date d)
				{dateAjout=d; return this;}
		public Builder categorie(Categorie c)
				{categorie=c;		return this;}
		public Builder catalogue(Catalogue c)
				{catalogue=c; 		return this;}
		public Builder proprietaire(Abonné a)
				{proprietaire=a;	return this;}
		public Builder descriptionFichier(String s)
				{descriptionFichier=s; return this;}
		public Builder relevance(int a)
				{relevance=a;		return this;}
		public Builder auteurCollection(Set<Auteur> co)
				{auteurCollection=co; return this;}
		public Builder dossier(Dossier d)
				{dossier=d; 		return this;}
			
		public Fichier build(){
				return new Fichier(this);
				}}
		
	//public Fichier(){	}
	public Fichier(Builder builder){
		langue=		builder.langue;
		dateAjout=	builder.dateAjout;
		taille=		builder.taille;
		categorie=	builder.categorie;
		catalogue=	builder.catalogue;
		proprietaire=builder.proprietaire;
		nbrTelechargement=builder.nbrTelechargement;
		descriptionFichier=builder.descriptionFichier;
		relevance= 	builder.relevance;
		auteurCollection= builder.auteurCollection;
		dossier= 	builder.dossier;
	
	}
	public void finalize() throws Throwable {

	}
	@SequenceGenerator(name="SeqFichier", sequenceName="fichier_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SeqFichier")
	public int getFichierId() {
		return fichierId;
	}

	public void setFichierId(int fichierId) {
		this.fichierId = fichierId;
	}

	public void getDetails(){

	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}
	
	
	@ManyToOne
	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
	@ManyToOne
	public Categorie getCategorie() {
		return categorie;
	}

	

	public Abonné getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Abonné proprietaire) {
		this.proprietaire = proprietaire;
	}

	public int getNbrTelechargement() {
		return nbrTelechargement;
	}

	public void setNbrTelechargement(int nbrTelechargement) {
		this.nbrTelechargement = nbrTelechargement;
	}

	public String getDescriptionFichier() {
		return descriptionFichier;
	}

	public void setDescriptionFichier(String descriptionFichier) {
		this.descriptionFichier = descriptionFichier;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	
	@ManyToMany
	public Set<Auteur> getAuteurCollection() {
		return auteurCollection;
	}

	public void setAuteurCollection(Set<Auteur> m_Auteur) {
		this.auteurCollection = m_Auteur;
	}
	
	@ManyToOne
	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
}//end Fichier