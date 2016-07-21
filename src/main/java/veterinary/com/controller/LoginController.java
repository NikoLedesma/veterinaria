package veterinary.com.controller;

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

	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("welcome");
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
