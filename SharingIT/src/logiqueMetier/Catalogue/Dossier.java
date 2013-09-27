package logiqueMetier.Catalogue;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.*;

/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:59 AM
 */
@Entity
public class Dossier {


	private Set<Fichier> fichierCollection;

	public Dossier(){

	}

	public void finalize() throws Throwable {

	}
	
	@OneToMany
	public Set<Fichier> getFichierCollection() {
		return fichierCollection;
	}

	public void setFichierCollection(Set<Fichier> fichierCollection) {
		this.fichierCollection = fichierCollection;
	}


}//end Dossier