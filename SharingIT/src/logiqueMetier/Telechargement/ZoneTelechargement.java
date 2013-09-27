package logiqueMetier.Telechargement;
import javax.persistence.Entity;

import logiqueMetier.Catalogue.Fichier;
import java.util.Set;
/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:35:02 AM
 */
@Entity
public class ZoneTelechargement {

	private int nombreFichiers=0;
	private Set<Fichier> fichierCollecion;

	public int getNombreFichiers() {
		return nombreFichiers;
	}

	public void setNombreFichiers(int nombreFichiers) {
		this.nombreFichiers = nombreFichiers;
	}
	public Set<Fichier> getFichierCollecion() {
		return fichierCollecion;
	}

	public void setFichierCollecion(Set<Fichier> fichierCollecion) {
		this.fichierCollecion = fichierCollecion;
		
	}

	

	public ZoneTelechargement(){

	}

	public void finalize() throws Throwable {

	}
	public void ajouterFichier(Fichier f){
		fichierCollecion.add(f);
		setNombreFichiers(++nombreFichiers);
	}

	public void supprimerFichier(Fichier F){
		if(nombreFichiers==0) return;
		fichierCollecion.remove(F);
		setNombreFichiers(--nombreFichiers);
	}

	public void vider(){
		fichierCollecion.removeAll(null);
	}
}//end ZoneTelechargement