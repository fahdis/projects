package logiqueMetier.Gestion;
import java.util.Set;
import javax.persistence.*;
/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:57 AM
 */
@Entity
public class Abonné extends Internaute {

	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String motPasse;
	private Set<CarteBancaire> carteBancaireCollection;
	private Set<Inscription>inscriptionCollection;
	

	public Abonné(){
		super();

	}
	@TableGenerator(name = "abonneId",table="abonnepktab",pkColumnName="abonnekey", pkColumnValue="abonnevalue")
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="abonneId") 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	
	@OneToMany
	public Set<CarteBancaire> getCarteBancaireCollection() {
		return carteBancaireCollection;
	}
	public void setCarteBancaireCollection(
			Set<CarteBancaire> carteBancaireCollection) {
		this.carteBancaireCollection = carteBancaireCollection;
	}
	
	@OneToMany
	public Set<Inscription> getInscriptionCollection() {
		return inscriptionCollection;
	}
	public void setInscriptionCollection(Set<Inscription> inscriptionCollection) {
		this.inscriptionCollection = inscriptionCollection;
	}
	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Abonné