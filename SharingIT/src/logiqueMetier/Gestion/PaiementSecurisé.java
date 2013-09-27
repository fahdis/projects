package logiqueMetier.Gestion;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:35:01 AM
 */
public class PaiementSecurisé {

	private int paiementId;
	//private String creditCardNumber;
	//private CreditCardType creditCardType;
	//private GregorianCalendar creditCardExpiryDate;
	private CarteBancaire carte;
	private Inscription m_inscription;


	public PaiementSecurisé(){

	}
	@SequenceGenerator(name="SeqPaiement", sequenceName="paiement_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SeqPaiement")
	public int getPaiementId() {
		return paiementId;
	}

	public void setPaiementId(int paiementId) {
		this.paiementId = paiementId;
	}
	public CarteBancaire getCarte() {
		return carte;
	}
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}
	/*@Column(nullable=false)
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
*/
	/*
	@Temporal(TemporalType.TIMESTAMP)
	public GregorianCalendar getCreditCardExpiryDate() {
		return creditCardExpiryDate;
	}

	public void setCreditCardExpiryDate(GregorianCalendar creditCardExpiryDate) {
		this.creditCardExpiryDate = creditCardExpiryDate;
	}
	*/
	
	@OneToOne
	public Inscription getM_inscription() {
		return m_inscription;
	}
	public void setM_inscription(Inscription m_inscription) {
		this.m_inscription = m_inscription;
	}

	
	/*public CreditCardType getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(CreditCardType creditCardType) {
		this.creditCardType = creditCardType;
	}
*/
	
	public void finalize() throws Throwable {

	}
}//end PaiementSecurisé