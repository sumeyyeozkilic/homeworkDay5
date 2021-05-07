package homeWork.business.concretes;

import homeWork.business.abstracts.EMailService;

public class EMailManager implements EMailService {

	@Override
	public void sendEMail(String message, String toWho) {
		System.out.println("E-Mail: "+message+" message send to "+toWho+" e-Mail adress.");
		
	}

}
