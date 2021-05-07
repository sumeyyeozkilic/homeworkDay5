package homeWork.business.abstracts;

import homeWork.entities.concretes.User;

public interface UserValidationService {
	boolean validate(User user);
}
