package homeWork.business.concretes;

import homeWork.business.abstracts.EMailService;
import homeWork.business.abstracts.UserService;
import homeWork.business.abstracts.UserValidationService;
import homeWork.core.BusinessRules;
import homeWork.core.abstracts.AuthorService;
import homeWork.entities.concretes.User;

public class AuthorManager implements AuthorService {
	UserService userService;
	EMailService eMailService;
	UserValidationService userValidationService;

	public AuthorManager(UserService userService, UserValidationService userValidationService,
			EMailService eMailService) {
		super();
		this.userService = userService;
		this.eMailService = eMailService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void logIn(String eMail, String password) {
		if(!BusinessRules.run(checkIfAllFieldsFilled(eMail, password))) {
			System.out.println("LogIn failed information not filled in correctly.");
			return;
		}
		
		User userToLogin = userService.getByEmailAndPassword(eMail, password);
		
		if(userToLogin == null) {
			System.out.println("LogIn failed your eMail address or password is incorrect.");
			return;
		}
		
		if(!checkIfUserVerified(userToLogin)) {
			System.out.println("LogIn failed you haven't confirmed your membership.");
			return;
		}
		System.out.println("LogIn succesful. Welcome " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
	}
	
	private boolean checkIfUserExists(String eMail) {
		return userService.getByEmail(eMail) == null;
	}
	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}
	private boolean checkIfAllFieldsFilled(String eMail,String password) {
		if(eMail.length()<=0 || password.length() <=0) {
			return false;
		}
		return true;
	}
			

	@Override

	public void register(String firstName, String lastName, String eMail, String password,int id) {
		User userToRegister= new User(firstName, lastName, eMail, password,false, id);
		
		if(!userValidationService.validate(userToRegister)) {
			System.out.println("The validation process fails, please make sure you enter all fields correctly.");
			return;
		}
		
		if(!BusinessRules.run(checkIfUserExists(eMail))) {
			System.out.println("The registration process will fail, another member is present with this e-Mail");
			return;
		}
		
		System.out.println("Successfully registered, please check your email address to verify your membership.");
		eMailService.sendEMail("verification message attempt.", userToRegister.geteMail());
		userService.add(userToRegister);
	}
		
	}
	
}


