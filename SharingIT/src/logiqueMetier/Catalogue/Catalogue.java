package logiqueMetier.Catalogue;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:58 AM
 */

@Entity
public class Catalogue {
	private int catalogueId; 
	private Set<Categorie> 	categorieCollection;
	private Set<Auteur> 	auteurCollection;
	private Set<Fichier> fichierCollection;

	
	public Catalogue(){

	}
	
	@SequenceGenerator(name="SeqCatalogue",sequenceName="catalogueSeq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SeqCatalogue")
	public int getCatalogueId() {
		return catalogueId;
	}
	public void setCatalogueId(int catalogueId) {
		this.catalogueId = catalogueId;
	}

	@OneToMany
	public Set<Categorie> getCategorieCollection() {
		return categorieCollection;
	}
	public void setCategorieCollection(Set<Categorie> categorieCollection) {
		this.categorieCollection = categorieCollection;
	}
	
	@OneToMany
	public Set<Auteur> getAuteurCollection() {
		return auteurCollection;
	}
	public void setAuteurCollection(Set<Auteur> auteurCollection) {
		this.auteurCollection = auteurCollection;
	}
	
	@OneToMany
	public Set<Fichier> getFichierCollection() {
		return fichierCollection;
	}
	public void setFichierCollection(Set<Fichier> fichierCollection) {
		this.fichierCollection = fichierCollection;
	}

	
	public void finalize() throws Throwable {

	}
	public void chercherFichiersParAuteur(){

	}

	public void chercherFichiersParCategorie(){

	}

	public void chercherFichiersParLangue(){

	}

	public void chercherFichiersParTitre(){

	}

	public void getInfoFichier(){

	}

	public void chercherFichiersParId(){

	}
}//end Catalogue