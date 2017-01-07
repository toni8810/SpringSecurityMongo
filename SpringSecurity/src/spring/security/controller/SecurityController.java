package spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.security.dao.UserDAO;
import spring.security.domain.User;

@Controller
public class SecurityController {
	
	@Autowired
	UserDAO userDao;
	
	@ModelAttribute("user")
	public User modelGetter() {
		return new User();
	}
	
	@RequestMapping
	public String showHome() throws Exception {
		return "index";
	}
	@RequestMapping("/member/home")
	public String showMemberHome() {
		return "membersIndex";
	}
	@RequestMapping("/createAccount")
	public String createAccount(@ModelAttribute("user") User user) {
		userDao.insertUser(user);
		return "index";
	}
	
	
}
