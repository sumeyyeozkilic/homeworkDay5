package homeWork.business.concretes;

import java.util.List;

import homeWork.business.abstracts.UserService;
import homeWork.dataAccess.abstracts.UserDao;
import homeWork.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
		
	}

	@Override
	public void verifyUser(int id) {
		User user= userDao.get(id);
		user.setVerified(true);
		System.out.println("User verified successfully");
		
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public User getByEmail(String eMail) {
		return userDao.getByEmail(eMail);
	}

	@Override
	public User getByEmailAndPassword(String eMail, String password) {
		return userDao.getByEmailAndPassword(eMail, password);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	
	

}
