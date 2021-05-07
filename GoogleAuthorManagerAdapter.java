package homeWork.core.concretes;

import homeWork.core.abstracts.AuthorService;

public class GoogleAuthorManagerAdapter implements AuthorService{

	@Override
	public void logIn(String eMail, String password) {
		GoogleAuthorManagerAdapter googleAuthorManagerAdapter= new GoogleAuthorManagerAdapter();
		googleAuthorManagerAdapter.logIn(eMail, password);
	}


	@Override
	public void register(String firstName, String lastName, String eMail, String password, int id) {
		GoogleAuthorManagerAdapter googleAuthorManagerAdapter= new GoogleAuthorManagerAdapter();
		googleAuthorManagerAdapter.register(firstName, lastName, eMail, password,id);
		
	}

}
