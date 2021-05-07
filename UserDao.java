package homeWork.dataAccess.abstracts;

import java.util.List;

import homeWork.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void remove(User user);
	void update(User user);
	User get(int id);
	User getByEmail(String eMail);
	User getByEmailAndPassword(String eMail, String password);
	List<User> getAll();
}
