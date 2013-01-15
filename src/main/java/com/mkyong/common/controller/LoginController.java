package com.mkyong.common.controller;
 
import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model){
		return "home";
	}
 
	@RequestMapping(value="/user/login", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal ) { 
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security Custom Form example");
		return "user"; 
	}
	
	@RequestMapping(value="/admin/login", method = RequestMethod.GET)
	public String printWelcomeExtra(ModelMap model, Principal principal ) { 
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Extreme Security");
		return "admin"; 
	}
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) { 
		return "login"; 
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "home";
 
	}
	
	@RequestMapping(value="/user/accessDenied", method = RequestMethod.GET)
	public String accessDenied(ModelMap model) { 
		return "403"; 
	}
	
	@RequestMapping(value="/admin/accessDenied", method = RequestMethod.GET)
	public String accessDeniedAdmin(ModelMap model) { 
		return "403Admin"; 
	}
	
	@RequestMapping(value="/admin/secure", method = RequestMethod.GET)
	public String accessAdminSecure(ModelMap model) { 
		return "admin1"; 
	}
}