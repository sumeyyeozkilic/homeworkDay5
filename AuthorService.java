package homeWork.core.abstracts;

public interface AuthorService {
	void logIn(String eMail, String password);
	void register(String firstName, String lastName, String eMail, String password, int id);
}
