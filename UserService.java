package homeWork.business.abstracts;

import java.util.List;

import homeWork.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void remove(User user);
	void verifyUser(int id);
	User get(int id);
	User getByEmail(String eMail);
	User getByEmailAndPassword(String eMail, String password);
	List<User> getAll();
	
	
}
