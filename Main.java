package homeWork;

import homeWork.business.abstracts.UserService;
import homeWork.business.concretes.AuthorManager;
import homeWork.business.concretes.EMailManager;
import homeWork.business.concretes.UserManager;
import homeWork.business.concretes.UserValidationManager;
import homeWork.core.abstracts.AuthorService;
import homeWork.core.concretes.GoogleAuthorManagerAdapter;
import homeWork.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao());
		AuthorService authorService = new AuthorManager(userService, new UserValidationManager(), new EMailManager());
		
		authorService.register("Sümeyye", "Özkýlýç","ozkilicsumeyye3@gmail.com", "123654", 1);
		
		authorService.logIn("ozkilicsumeyye3@gmail.com", "123654");
		userService.verifyUser(1);
		
		AuthorService googleAuthorService= new GoogleAuthorManagerAdapter();
		googleAuthorService.register("Sümeyye", "Özkýlýç","ozkilicsumeyye3@gmail.com", "123654", 1);
		googleAuthorService.logIn("ozkilicsumeyye3@gmail.com", "123654");
		
}
}

	
