package logiqueApplicative.inscription;


import java.util.Date;

import org.apache.struts.action.Action;

import com.opensymphony.xwork2.ActionSupport;
import logiqueMetier.Gestion.*;
import logiqueMetier.Gestion.Inscription.TypeInscription;



public class InscriptionAction extends Action{

	Inscription inscription ;
	
	public Inscription getInscription() {
		return inscription;
	}

	public void setInscription(Inscription inscription) {
		this.inscription = inscription;
	}
	int duree;
	public String execute()
	{
	//	int	inscriptionId=inscription.getInscriptionId();
		//Date dateInscription=inscription.getDate();
		//rivate GregorianCalendar cal;
		//private int modePaiement;
		 duree=inscription.getDuree();
		//TypeInscription typeInscription=inscription.getTypeInscription();
		//PaiementSecurisé paiement=inscription.getPaiement();
		//Abonné abonne=inscription.getAbonne();
		return "success";
	}
}
