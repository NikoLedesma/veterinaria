package veterinary.com.daoImpl;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import veterinary.com.dao.UserDao;
import veterinary.com.entity.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public User findByUserName(String username) {
		List<User>users = new ArrayList<User>();
		Query qy= sessionFactory.getCurrentSession().createQuery("from User where username=?");
		users =  qy.setParameter(0, username).list();
		return users.size()>0?users.get(0):null;
	}

}
