package veterinary.com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("login/login");
		return mv;
	}

	@RequestMapping(value = "/user")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("user");
		List<SimpleGrantedAuthority> roles=new ArrayList<SimpleGrantedAuthority>();
		
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>)    SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for (SimpleGrantedAuthority simpleGrantedAuthority : authorities) {
			System.out.println(simpleGrantedAuthority.getAuthority());
			roles.add(simpleGrantedAuthority);
		}
		mv.addObject("roles", roles);
		return mv;
	}

	@RequestMapping(value = "/page1")
	public ModelAndView page1() {
		ModelAndView mv = new ModelAndView("page1");
		return mv;

	}

	@RequestMapping(value = "/page2")
	public ModelAndView page2() {
		ModelAndView mv = new ModelAndView("page2");
		return mv;
	}

}
