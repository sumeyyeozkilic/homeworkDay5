package homeWork.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeWork.dataAccess.abstracts.UserDao;
import homeWork.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	List<User> users =new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void remove(User user) {
		users.removeIf(obj-> obj.getId()== user.getId());
		
	}

	@Override
	public void update(User user) {
		User toUpdate= get(user.getId());
		toUpdate.setFirstName(user.getFirstName());
		toUpdate.setLastName(user.getLastName());
		
	}

	@Override
	public User get(int id) {
		for(User user: users) {
			if(user.getId()==id);
			return user;
		}
		return null;
		
	}

	@Override
	public User getByEmail(String eMail) {
		for(User user: users) {
			if(user.geteMail()==eMail);
			return user;
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String eMail, String password) {
		for(User user: users) {
			if(user.geteMail()==eMail && user.getPassword()==password);
			return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
