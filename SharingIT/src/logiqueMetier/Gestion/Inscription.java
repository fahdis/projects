package logiqueMetier.Gestion;

import java.util.Date;
//import java.util.GregorianCalendar;
import javax.persistence.*;

/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:35:01 AM
 */


enum Duree{QUINZE_jOURS,MOIS, SIX_MOIS, ANNEE }
//enum ModePaiement {C}
@Entity
public class Inscription {
	public enum TypeInscription{BASIC, PROFESSIONAL, ENTREPRISE};

	private int	inscriptionId;
	private Date dateInscription;
	//rivate GregorianCalendar cal;
	//private int modePaiement;
	private int duree;
	private TypeInscription typeInscription;
	private PaiementSecurisé paiement;
	private Abonné abonne;

	public Inscription(){

	}
	@SequenceGenerator(name="SeqInscription", sequenceName="inscription_Seq")
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SeqInscription")
	public int getInscriptionId() {
		return inscriptionId;
	}

	public void setInscriptionId(int inscriptionId) {
		this.inscriptionId = inscriptionId;
	}

	public Date getDate() {
		return dateInscription;
	}

	public void setDate(Date date) {
		this.dateInscription = date;
	}

	/*public int getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(int modePaiement) {
		this.modePaiement = modePaiement;
	}
	 */
	public int getDuree() {
		return duree;
	}
	
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	@Enumerated(EnumType.STRING)
	public TypeInscription getTypeInscription() {
		return typeInscription;
	}
	public void setTypeInscription(TypeInscription typeInscription) {
		this.typeInscription = typeInscription;
	}
	
	@OneToOne
	public PaiementSecurisé getPaiement() {
		return paiement;
	}

	public void setPaiement(PaiementSecurisé paiement) {
		this.paiement = paiement;
	}

	@ManyToOne
	public Abonné getAbonne() {
		return abonne;
	}
	public void setAbonne(Abonné abonne) {
		this.abonne = abonne;
	}
	public void finalize() throws Throwable {

	}
}//end inscription