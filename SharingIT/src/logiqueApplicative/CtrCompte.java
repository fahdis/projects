package logiqueApplicative;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import logiqueMetier.Gestion.Inscription;

/**
 * @author root
 * @version 1.0
 * @created 10-Sep-2013 7:34:59 AM
 */
public class CtrCompte extends ActionSupport implements ModelDriven<Inscription>{

	public Inscription m_inscription;

	public CtrCompte(){

	}

	public void finalize() throws Throwable {

	}

	@Override
	public Inscription getModel() {
		// TODO Auto-generated method stub
		return m_inscription;
	}
}//end CtrCompte