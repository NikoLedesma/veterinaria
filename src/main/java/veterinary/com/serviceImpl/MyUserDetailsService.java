package veterinary.com.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import veterinary.com.dao.UserDao;
import veterinary.com.entity.UserRole;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	@Transactional(readOnly=true)
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		veterinary.com.entity.User user = userDao.findByUserName(username) ;
		List <GrantedAuthority> authorities =this.buildUserAuthority(user.getUserRole());
		return this.buildUserForAuthentication(user, authorities) ;
	}

	
	private User buildUserForAuthentication(veterinary.com.entity.User user,List<GrantedAuthority> authorities){
		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
	}
	
	
	
	private List<GrantedAuthority> buildUserAuthority (Set<UserRole> userRoles){
		Set< GrantedAuthority> setAuths= new HashSet<GrantedAuthority>();
		for(UserRole userRole:userRoles){
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		List <GrantedAuthority> result = new ArrayList<GrantedAuthority>(setAuths);
		return result;
	}
	
	
	
	
	
	
}
