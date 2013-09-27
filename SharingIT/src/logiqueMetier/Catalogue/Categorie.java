package logiqueMetier.Catalogue;

import java.util.List;
import javax.persistence.*;

/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:58 AM
 */
@Entity
public class Categorie {

	private int idCategorie;
	private String nom;
	private  List <Fichier> Li;

	public Categorie(){

	}
	@SequenceGenerator(name="SeqCategorie",sequenceName="categorie_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SeqCategorie")
	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int id) {
		this.idCategorie = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	@OneToMany
	public List<Fichier> getLi() {
		return Li;
	}

	public void setLi(List<Fichier> li) {
		Li = li;
	}

	public void finalize() throws Throwable {

	}
}//end Categorie