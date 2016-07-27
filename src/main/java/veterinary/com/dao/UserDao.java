package veterinary.com.dao;

import veterinary.com.entity.User;

public interface UserDao {
	User findByUserName(String username);

}
