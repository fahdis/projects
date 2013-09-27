package logiqueMetier.Gestion;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;
/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:58 AM
 */
 	enum CreditCardType{VISA_CARD, MASTER_CARD, VISA_ELECTRON };

@Entity
public class CarteBancaire {

	private int numero;
	private CreditCardType type;
	private Date dateValiditÚ;	
	private AbonnÚ abonne;
	private Set<PaiementSecurisÚ> paiementCollection; 
	
	
	
	public CarteBancaire(){

	}
	@Id
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public CreditCardType getType() {
		return type;
	}

	public void setType(CreditCardType type) {
		this.type = type;
	}

	public Date getDateValiditÚ() {
		return dateValiditÚ;
	}

	public void setDateValiditÚ(Date dateValiditÚ) {
		this.dateValiditÚ = dateValiditÚ;
	}
	@ManyToOne
	public AbonnÚ getAbonne() {
		return abonne;
	}
	public void setAbonne(AbonnÚ abonne) {
		this.abonne = abonne;
	}

	@OneToMany
	public Set<PaiementSecurisÚ> getPaiementCollection() {
		return paiementCollection;
	}
	public void setPaiementCollection(Set<PaiementSecurisÚ> paiementCollection) {
		this.paiementCollection = paiementCollection;
	}

	public void finalize() throws Throwable {

	}
}//end CarteBancaire